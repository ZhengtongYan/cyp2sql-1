package toolv1;

import clauseObjects.*;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CypherTranslator {
    static DecodedQuery MatchAndReturnAndOrderAndSkip(ArrayList<String> tokenList, CypherWalker cypherQ)
            throws Exception {
        // query has structure MATCH ... RETURN ... ORDER BY [ASC|DESC] .. SKIP .. LIMIT
        // check to perform is returning something mentioned in match clause
        System.out.println(tokenList.toString());

        int posOfMatch = tokenList.indexOf("MATCH");
        int posOfWhere = tokenList.indexOf("WHERE");
        int posOfReturn = tokenList.indexOf("RETURN");
        int posOfOrder = tokenList.indexOf("ORDER");
        int posOfSkip = tokenList.indexOf("SKIP");
        int posOfLimit = tokenList.indexOf("LIMIT");

        List<String> matchClause;
        List<String> returnClause;
        List<String> orderClause = null;

        if (cypherQ.doesCluaseHaveWhere())
            matchClause = tokenList.subList(posOfMatch + 1, posOfWhere);
        else
            matchClause = tokenList.subList(posOfMatch + 1, posOfReturn);

        if (posOfOrder == -1) {
            if (posOfSkip == -1 && posOfLimit == -1) {
                returnClause = tokenList.subList(posOfReturn + 1 + ((cypherQ.hasDistinct()) ? 1 : 0), tokenList.size());
            } else if (posOfLimit == -1) {
                returnClause = tokenList.subList(posOfReturn + 1 + ((cypherQ.hasDistinct()) ? 1 : 0), posOfSkip);
            } else if (posOfSkip == -1) {
                returnClause = tokenList.subList(posOfReturn + 1 + ((cypherQ.hasDistinct()) ? 1 : 0), posOfLimit);
            } else {
                returnClause = tokenList.subList(posOfReturn + 1 + ((cypherQ.hasDistinct()) ? 1 : 0), posOfSkip);
            }
        } else {
            returnClause = tokenList.subList(posOfReturn + 1 + ((cypherQ.hasDistinct()) ? 1 : 0), posOfOrder);
            if (posOfSkip == -1 && posOfLimit == -1) {
                orderClause = tokenList.subList(posOfOrder + 2, tokenList.size());
            } else if (posOfLimit == -1) {
                orderClause = tokenList.subList(posOfOrder + 2, posOfSkip);
            } else if (posOfSkip == -1) {
                orderClause = tokenList.subList(posOfOrder + 2, posOfLimit);
            } else {
                orderClause = tokenList.subList(posOfOrder + 2, posOfSkip);
            }
        }

        System.out.println(returnClause);
        MatchClause matchC = matchDecode(matchClause);
        ReturnClause returnC = returnDecode(returnClause, matchC);
        OrderClause orderC = null;
        if (orderClause != null)
            orderC = orderDecode(orderClause);

        int skipAmount = (posOfSkip != -1) ? cypherQ.getSkipAmount() : -1;
        int limitAmount = (posOfLimit != -1) ? cypherQ.getLimitAmount() : -1;

        DecodedQuery dq = new DecodedQuery(matchC, returnC, orderC, skipAmount, limitAmount, cypherQ);

        if (cypherQ.doesCluaseHaveWhere()) {
            whereDecode(matchC, cypherQ);
        }


        return dq;
    }

    private static void whereDecode(MatchClause matchC, CypherWalker cypherQ) throws Exception {
        WhereClause wc = new WhereClause(cypherQ.getWhereClause());
        while (!wc.getClause().isEmpty()) {
            extractWhere(wc.getClause(), matchC, wc);
        }
    }

    private static WhereClause extractWhere(String clause, MatchClause matchC, WhereClause wc) throws Exception {
        if (clause.contains(" or ")) {
            String[] items = clause.split(" or ");
            wc.setHasOr(true);
            wc.addToOr(items);
            for (String item : items) {
                extractWhere(item, matchC, wc);
            }
        } else {
            wc.setClause(wc.getClause().substring(clause.length()));
            String[] idAndCond = clause.split(" = ");
            addCondition(idAndCond, matchC);
        }
        return wc;
    }

    private static void addCondition(String[] idAndCond, MatchClause matchC) throws Exception {
        String[] idAndProp = idAndCond[0].split("\\.");
        for (CypNode cN : matchC.getNodes()) {
            if (cN.getId().equals(idAndProp[0].toUpperCase())) {
                JsonObject obj = cN.getProps();
                if (obj == null) obj = new JsonObject();
                obj.addProperty(idAndProp[1], idAndCond[1].replace("\"", "").toUpperCase());
                cN.setProps(obj);
                return;
            }
        }
        throw new Exception("WHERE CLAUSE MALFORMED");
    }

    // current status: unsure, test
    private static MatchClause matchDecode(List<String> matchClause) {
        MatchClause m = new MatchClause();

        // extract the nodes from the match clause
        m.setNodes(extractNodes(matchClause, m));

        // reset ID between method calls
        m.resetInternalID();

        // extract any relationships from the match clause
        m.setRels(extractRels(matchClause, m));

        for (CypNode c : m.getNodes()) {
            System.out.println(c.toString());
        }

        for (CypRel c : m.getRels()) {
            System.out.println(c.toString());
        }

        return m;
    }

    private static ArrayList<CypNode> extractNodes(List<String> clause,
                                                   MatchClause m) {
        ArrayList<CypNode> nodes = new ArrayList<CypNode>();
        Map<String, Integer> nodeIDS = new HashMap<String, Integer>();

        JsonObject o;
        List<String> nodeString;
        List<String> propsString;

        String id;
        String type;

        while (!clause.isEmpty()) {
            nodeString = null;
            propsString = null;
            o = null;

            // find nodes in the clause
            int lBrack = clause.indexOf("(");
            int rBrack = clause.indexOf(")");

            // check if a node has been found or not
            if (lBrack != -1 && rBrack != -1) {
                // extract the inner node tokens
                nodeString = clause.subList(lBrack + 1, rBrack);

                // keep rest of clause safe
                clause = clause.subList(rBrack + 1, clause.size());

                while (!nodeString.isEmpty()) {
                    // extract any properties from the nodes
                    int lCurly = nodeString.indexOf("{");
                    int rCurly = nodeString.indexOf("}");

                    if (lCurly != -1 && rCurly != -1) {
                        propsString = nodeString.subList(lCurly + 1, rCurly);
                        nodeString = nodeString.subList(0, lCurly);
                    } else {
                        break;
                    }
                }
            }

            if (nodeString != null) {
                if (propsString != null) {
                    o = getJSONProps(propsString);
                }

                String[] temp = extractIdAndType(nodeString);
                id = temp[0];
                type = temp[1];

                // add the formatted node object to list of nodes
                // associated with the match clause
                int internalID = m.getInternalID();

                if (id != null && !nodeIDS.containsKey(id)) {
                    nodeIDS.put(id, internalID);
                } else if (nodeIDS.containsKey(id)) {
                    type = nodes.get(nodeIDS.get(id) - 1).getType();
                    o = nodes.get(nodeIDS.get(id) - 1).getProps();
                }
                nodes.add(new CypNode(internalID, id, type, o));
            }
        }
        return nodes;
    }

    private static ArrayList<CypRel> extractRels(List<String> clause,
                                                 MatchClause m) {
        ArrayList<CypRel> rels = new ArrayList<CypRel>();

        JsonObject o;
        String direction;
        List<String> relString;
        List<String> propsString;
        String id;
        String type;

        while (!clause.isEmpty()) {
            id = null;
            type = null;
            propsString = null;
            o = null;
            direction = null;

            int lSq = clause.indexOf("[");
            int rSq = clause.indexOf("]");

            if (lSq != -1 && rSq != -1) {
                String tokBeforeLSQ1 = clause.get(lSq - 1);
                String tokAfterRSQ1 = clause.get(rSq + 1);
                String tokBeforeLSQ2 = clause.get(lSq - 2);
                String tokAfterRSQ2 = clause.get(rSq + 2);

                if (tokBeforeLSQ1.equals("-") &&
                        tokAfterRSQ1.equals("-")) {
                    // is a valid relationship structure
                    relString = clause.subList(lSq + 1, rSq);
                    if (tokAfterRSQ2.equals(">")) {
                        direction = "right";
                        clause = clause.subList(rSq + 3, clause.size());
                    } else {
                        clause = clause.subList(rSq + 2, clause.size());
                        if (tokBeforeLSQ2.equals("<")) {
                            direction = "left";
                        } else {
                            direction = "none";
                        }
                    }

                    if (relString.contains("{")) {
                        int lCurly = relString.indexOf("{");
                        int rCurly = relString.indexOf("}");

                        if (lCurly != -1 && rCurly != -1) {
                            propsString = relString.subList(lCurly + 1, rCurly);
                            relString = relString.subList(0, lCurly);
                        }
                    }

                    String[] temp = extractIdAndType(relString);
                    id = temp[0];
                    type = temp[1];

                    if (propsString != null) {
                        o = getJSONProps(propsString);
                    }
                }
            } else {
                // may be a relationship still there
                if (clause.contains("<") || clause.contains(">")) {
                    int posLeftArrow = clause.indexOf("<");
                    int posRightArrow = clause.indexOf(">");

                    if (posLeftArrow != -1 && posRightArrow != -1) {
                        if (posLeftArrow < posRightArrow) {
                            direction = "left";
                            clause = clause.subList(posLeftArrow + 3, clause.size());
                        } else {
                            direction = "right";
                            clause = clause.subList(posRightArrow + 1, clause.size());
                        }
                    } else if (posLeftArrow != -1) {
                        direction = "left";
                        clause = clause.subList(posLeftArrow + 3, clause.size());
                    } else if (posRightArrow != -1) {
                        direction = "right";
                        clause = clause.subList(posRightArrow + 1, clause.size());
                    } else if (clause.contains("-")) {
                        int posDash = clause.indexOf("-");
                        if (clause.get(posDash + 1).equals("-")) {
                            direction = "none";
                            clause = clause.subList(posDash + 2, clause.size());
                        }
                    }
                } else
                    break;
            }

            rels.add(new CypRel(m.getInternalID(), id, type, o, direction));
        }
        return rels;
    }

    private static JsonObject getJSONProps(List<String> propsString) {
        JsonParser parser = new JsonParser();
        StringBuilder temp = new StringBuilder();
        int i = 0;

        for (String a : propsString) {
            if (i % 3 == 0) {
                temp.append("{\"").append(a).append("\"");
            }
            if (i % 3 == 1) {
                temp.append(":");
            }
            if (i % 3 == 2) {
                temp.append(a).append("}, ");
            }
            i++;
        }

        temp.setLength(temp.length() - 2);
        return parser.parse(temp.toString()).getAsJsonObject();
    }

    private static ReturnClause returnDecode(List<String> returnClause, MatchClause matchC) throws Exception {
        ReturnClause r = new ReturnClause();

        List<CypReturn> items = new ArrayList<CypReturn>();

        List<String> currentWorking;

        // find all the separate parts of the return clause
        while (returnClause.contains(",")) {
            int posComma = returnClause.indexOf(",");
            currentWorking = returnClause.subList(0, posComma);
            returnClause = returnClause.subList(posComma + 1,
                    returnClause.size());

            items.add(extractReturn(currentWorking, matchC));
        }

        if (!returnClause.isEmpty()) {
            items.add(extractReturn(returnClause, matchC));
        }

        r.setItems(items);

        for (CypReturn c : r.getItems())
            System.out.println(c.toString());

        return r;
    }

    private static CypReturn extractReturn(List<String> clause, MatchClause matchC) throws Exception {
        if (clause.size() == 3 && clause.contains(".")) {
            return new CypReturn(clause.get(0), clause.get(2), matchC);
        } else if (clause.size() == 1) {
            return new CypReturn(clause.get(0), null, matchC);
        } else throw new Exception("RETURN CLAUSE MALFORMED");
    }

    private static String[] extractIdAndType(List<String> tokens) {
        String[] toReturn = {null, null};
        if (tokens.size() == 3) {
            toReturn[0] = tokens.get(0);
            toReturn[1] = tokens.get(2);
        } else if (tokens.size() == 2) {
            toReturn[1] = tokens.get(1);
        } else if (tokens.size() == 1) {
            toReturn[0] = tokens.get(0);
        }
        return toReturn;
    }

    private static OrderClause orderDecode(List<String> orderClause) throws Exception {
        OrderClause o = new OrderClause();

        List<CypOrder> items = new ArrayList<CypOrder>();

        List<String> currentWorking;

        // find all the separate parts of the return clause
        while (orderClause.contains(",")) {
            int posComma = orderClause.indexOf(",");
            currentWorking = orderClause.subList(0, posComma);
            orderClause = orderClause.subList(posComma + 1,
                    orderClause.size());

            items.add(extractOrder(currentWorking));
        }

        if (!orderClause.isEmpty()) {
            items.add(extractOrder(orderClause));
        }

        o.setItems(items);

        for (CypOrder c : o.getItems())
            System.out.println(c.toString());

        return o;
    }

    private static CypOrder extractOrder(List<String> clause) throws Exception {
        System.out.println(clause.toString());
        if (clause.size() == 4 && clause.contains(".")) {
            return new CypOrder(clause.get(0), clause.get(2), clause.get(3));
        } else if (clause.size() == 3 && clause.contains(".")) {
            return new CypOrder(clause.get(0), clause.get(2), "ASC");
        } else throw new Exception("RETURN CLAUSE MALFORMED");
    }

}
