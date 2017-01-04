package clauseObjects;

import java.util.HashMap;
import java.util.Map;

/**
 * Class for storing information about the FOREACH section of a Cypher query.
 */
public class CypForEach {
    // updateMap consists of the property to be updated, and the value it is to be updated with.
    private Map<String, String> updateMap;

    /**
     * Constructor for the object.
     *
     * @param forEachClause FOREACH part of a Cypher query.
     */
    public CypForEach(String forEachClause) {
        String part = forEachClause.split(" \\| ")[1];
        String[] kv = part.split(" = ");
        kv[0] = kv[0].split("\\.")[1];
        kv[1] = kv[1].substring(1, kv[1].length() - 3);
        Map<String, String> upMap = new HashMap<>();
        upMap.put(kv[0], kv[1]);
        updateMap = upMap;
    }

    /**
     * Retrieve the mapping specified in the FOREACH part of the Cypher query.
     *
     * @return Mapping coded in FOREACH part of Cypher query.
     */
    public Map<String, String> getUpdateMap() {
        return updateMap;
    }
}
