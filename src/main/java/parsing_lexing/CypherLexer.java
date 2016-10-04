package parsing_lexing;// Generated from Cypher.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CypherLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, StringLiteral=52, 
		EscapedChar=53, HexInteger=54, DecimalInteger=55, OctalInteger=56, HexString=57, 
		DigitString=58, OctalString=59, HexDigit=60, Digit=61, OctDigit=62, UNION=63, 
		ALL=64, OPTIONAL=65, MATCH=66, UNWIND=67, AS=68, MERGE=69, ON=70, CREATE=71, 
		SET=72, DELETE=73, DETACH=74, REMOVE=75, WITH=76, DISTINCT=77, RETURNX=78, 
		ORDER=79, BY=80, L_SKIP=81, LIMIT=82, DESCENDING=83, DESC=84, ASCENDING=85, 
		ASC=86, WHERE=87, OR=88, XOR=89, AND=90, NOT=91, IN=92, STARTS=93, ENDS=94, 
		CONTAINS=95, IS=96, NULL=97, TRUE=98, FALSE=99, COUNT=100, FILTER=101, 
		EXTRACT=102, ANY=103, NONE=104, SINGLE=105, UnescapedSymbolicName=106, 
		IdentifierStart=107, IdentifierPart=108, EscapedSymbolicName=109, WHITESPACE=110, 
		Comment=111, L_0X=112;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "StringLiteral", "EscapedChar", "HexInteger", "DecimalInteger", 
		"OctalInteger", "HexString", "DigitString", "OctalString", "HexDigit", 
		"Digit", "OctDigit", "UNION", "ALL", "OPTIONAL", "MATCH", "UNWIND", "AS", 
		"MERGE", "ON", "CREATE", "SET", "DELETE", "DETACH", "REMOVE", "WITH", 
		"DISTINCT", "RETURNX", "ORDER", "BY", "L_SKIP", "LIMIT", "DESCENDING", 
		"DESC", "ASCENDING", "ASC", "WHERE", "OR", "XOR", "AND", "NOT", "IN", 
		"STARTS", "ENDS", "CONTAINS", "IS", "NULL", "TRUE", "FALSE", "COUNT", 
		"FILTER", "EXTRACT", "ANY", "NONE", "SINGLE", "UnescapedSymbolicName", 
		"IdentifierStart", "IdentifierPart", "EscapedSymbolicName", "WHITESPACE", 
		"Comment", "L_0X", "FF", "EscapedSymbolicName_0", "RS", "ID_Continue", 
		"Comment_1", "Comment_0", "StringLiteral_1", "Comment_2", "GS", "FS", 
		"CR", "Sc", "SPACE", "TAB", "StringLiteral_0", "LF", "VT", "US", "ID_Start"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "','", "'='", "'+='", "'*'", "'('", "')'", "'['", "'?'", 
		"']'", "':'", "'|'", "'..'", "'+'", "'-'", "'/'", "'%'", "'^'", "'=~'", 
		"'<>'", "'!='", "'<'", "'>'", "'<='", "'>='", "'.'", "'!'", "'{'", "'}'", 
		"'$'", "'E'", "'e'", "'⟨'", "'〈'", "'﹤'", "'＜'", "'⟩'", "'〉'", 
		"'﹥'", "'＞'", "'­'", "'�?'", "'‑'", "'‒'", "'–'", "'—'", 
		"'―'", "'−'", "'﹘'", "'﹣'", "'�?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "StringLiteral", "EscapedChar", "HexInteger", 
		"DecimalInteger", "OctalInteger", "HexString", "DigitString", "OctalString", 
		"HexDigit", "Digit", "OctDigit", "UNION", "ALL", "OPTIONAL", "MATCH", 
		"UNWIND", "AS", "MERGE", "ON", "CREATE", "SET", "DELETE", "DETACH", "REMOVE", 
		"WITH", "DISTINCT", "RETURNX", "ORDER", "BY", "L_SKIP", "LIMIT", "DESCENDING", 
		"DESC", "ASCENDING", "ASC", "WHERE", "OR", "XOR", "AND", "NOT", "IN", 
		"STARTS", "ENDS", "CONTAINS", "IS", "NULL", "TRUE", "FALSE", "COUNT", 
		"FILTER", "EXTRACT", "ANY", "NONE", "SINGLE", "UnescapedSymbolicName", 
		"IdentifierStart", "IdentifierPart", "EscapedSymbolicName", "WHITESPACE", 
		"Comment", "L_0X"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CypherLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cypher.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2r\u039c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\7\65\u019f\n\65\f\65\16"+
		"\65\u01a2\13\65\3\65\3\65\3\65\3\65\7\65\u01a8\n\65\f\65\16\65\u01ab\13"+
		"\65\3\65\5\65\u01ae\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01c2\n\66\3\67\3\67"+
		"\3\67\38\38\58\u01c9\n8\38\58\u01cc\n8\39\39\39\3:\6:\u01d2\n:\r:\16:"+
		"\u01d3\3;\6;\u01d7\n;\r;\16;\u01d8\3<\6<\u01dc\n<\r<\16<\u01dd\3=\5=\u01e1"+
		"\n=\3>\3>\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3F\3F\3F\3F\3F\3F"+
		"\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3K\3K"+
		"\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N"+
		"\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3R"+
		"\3R\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y"+
		"\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3]\3^\3^\3^\3^\3^\3^\3"+
		"^\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3a\3a\3a\3b\3b\3b\3b\3b\3"+
		"c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3"+
		"f\3g\3g\3g\3g\3g\3g\3g\3g\3h\3h\3h\3h\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\3"+
		"j\3j\3k\3k\7k\u02e1\nk\fk\16k\u02e4\13k\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l"+
		"\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u0303\nl"+
		"\3m\3m\5m\u0307\nm\3n\3n\7n\u030b\nn\fn\16n\u030e\13n\3n\6n\u0311\nn\r"+
		"n\16n\u0312\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3"+
		"o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3"+
		"o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3"+
		"o\3o\5o\u0358\no\3p\3p\3p\3p\3p\3p\7p\u0360\np\fp\16p\u0363\13p\3p\3p"+
		"\3p\3p\3p\3p\3p\5p\u036c\np\3p\3p\5p\u0370\np\5p\u0372\np\3q\3q\3q\3r"+
		"\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}"+
		"\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083"+
		"\3\u0083\3\u0084\3\u0084\2\2\u0085\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097"+
		"M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00ab"+
		"W\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bf"+
		"a\u00c1b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3"+
		"k\u00d5l\u00d7m\u00d9n\u00dbo\u00ddp\u00dfq\u00e1r\u00e3\2\u00e5\2\u00e7"+
		"\2\u00e9\2\u00eb\2\u00ed\2\u00ef\2\u00f1\2\u00f3\2\u00f5\2\u00f7\2\u00f9"+
		"\2\u00fb\2\u00fd\2\u00ff\2\u0101\2\u0103\2\u0105\2\u0107\2\3\2.\21\2$"+
		"$\'\'))DDHHPPTTVV^^aaddhhppttvv\4\2WWww\5\2\62;CHch\4\2PPpp\4\2KKkk\4"+
		"\2QQqq\4\2CCcc\4\2NNnn\4\2RRrr\4\2VVvv\4\2OOoo\4\2EEee\4\2JJjj\4\2YYy"+
		"y\4\2FFff\4\2UUuu\4\2GGgg\4\2TTtt\4\2IIii\4\2XXxx\4\2DDdd\4\2[[{{\4\2"+
		"MMmm\4\2ZZzz\4\2HHhh\3\2\16\16\4\2\2ac\1\3\2  \u01af\2\62;C\\aac|\u00ac"+
		"\u00ac\u00b7\u00b7\u00b9\u00b9\u00bc\u00bc\u00c2\u00d8\u00da\u00f8\u00fa"+
		"\u02c3\u02c8\u02d3\u02e2\u02e6\u02ee\u02ee\u02f0\u02f0\u0302\u0376\u0378"+
		"\u0379\u037c\u037f\u0388\u038c\u038e\u038e\u0390\u03a3\u03a5\u03f7\u03f9"+
		"\u0483\u0485\u0489\u048c\u0529\u0533\u0558\u055b\u055b\u0563\u0589\u0593"+
		"\u05bf\u05c1\u05c1\u05c3\u05c4\u05c6\u05c7\u05c9\u05c9\u05d2\u05ec\u05f2"+
		"\u05f4\u0612\u061c\u0622\u066b\u0670\u06d5\u06d7\u06de\u06e1\u06ea\u06ec"+
		"\u06fe\u0701\u0701\u0712\u074c\u074f\u07b3\u07c2\u07f7\u07fc\u07fc\u0802"+
		"\u082f\u0842\u085d\u08a2\u08a2\u08a4\u08ae\u08e6\u0900\u0902\u0965\u0968"+
		"\u0971\u0973\u0979\u097b\u0981\u0983\u0985\u0987\u098e\u0991\u0992\u0995"+
		"\u09aa\u09ac\u09b2\u09b4\u09b4\u09b8\u09bb\u09be\u09c6\u09c9\u09ca\u09cd"+
		"\u09d0\u09d9\u09d9\u09de\u09df\u09e1\u09e5\u09e8\u09f3\u0a03\u0a05\u0a07"+
		"\u0a0c\u0a11\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34\u0a35\u0a37\u0a38\u0a3a"+
		"\u0a3b\u0a3e\u0a3e\u0a40\u0a44\u0a49\u0a4a\u0a4d\u0a4f\u0a53\u0a53\u0a5b"+
		"\u0a5e\u0a60\u0a60\u0a68\u0a77\u0a83\u0a85\u0a87\u0a8f\u0a91\u0a93\u0a95"+
		"\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb\u0abe\u0ac7\u0ac9\u0acb\u0acd"+
		"\u0acf\u0ad2\u0ad2\u0ae2\u0ae5\u0ae8\u0af1\u0b03\u0b05\u0b07\u0b0e\u0b11"+
		"\u0b12\u0b15\u0b2a\u0b2c\u0b32\u0b34\u0b35\u0b37\u0b3b\u0b3e\u0b46\u0b49"+
		"\u0b4a\u0b4d\u0b4f\u0b58\u0b59\u0b5e\u0b5f\u0b61\u0b65\u0b68\u0b71\u0b73"+
		"\u0b73\u0b84\u0b85\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b\u0b9c\u0b9e"+
		"\u0b9e\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bbb\u0bc0\u0bc4\u0bc8"+
		"\u0bca\u0bcc\u0bcf\u0bd2\u0bd2\u0bd9\u0bd9\u0be8\u0bf1\u0c03\u0c05\u0c07"+
		"\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c35\u0c37\u0c3b\u0c3f\u0c46\u0c48"+
		"\u0c4a\u0c4c\u0c4f\u0c57\u0c58\u0c5a\u0c5b\u0c62\u0c65\u0c68\u0c71\u0c84"+
		"\u0c85\u0c87\u0c8e\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7\u0cbb\u0cbe"+
		"\u0cc6\u0cc8\u0cca\u0ccc\u0ccf\u0cd7\u0cd8\u0ce0\u0ce0\u0ce2\u0ce5\u0ce8"+
		"\u0cf1\u0cf3\u0cf4\u0d04\u0d05\u0d07\u0d0e\u0d10\u0d12\u0d14\u0d3c\u0d3f"+
		"\u0d46\u0d48\u0d4a\u0d4c\u0d50\u0d59\u0d59\u0d62\u0d65\u0d68\u0d71\u0d7c"+
		"\u0d81\u0d84\u0d85\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dbf\u0dc2"+
		"\u0dc8\u0dcc\u0dcc\u0dd1\u0dd6\u0dd8\u0dd8\u0dda\u0de1\u0df4\u0df5\u0e03"+
		"\u0e3c\u0e42\u0e50\u0e52\u0e5b\u0e83\u0e84\u0e86\u0e86\u0e89\u0e8a\u0e8c"+
		"\u0e8c\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9"+
		"\u0ea9\u0eac\u0ead\u0eaf\u0ebb\u0ebd\u0ebf\u0ec2\u0ec6\u0ec8\u0ec8\u0eca"+
		"\u0ecf\u0ed2\u0edb\u0ede\u0ee1\u0f02\u0f02\u0f1a\u0f1b\u0f22\u0f2b\u0f37"+
		"\u0f37\u0f39\u0f39\u0f3b\u0f3b\u0f40\u0f49\u0f4b\u0f6e\u0f73\u0f86\u0f88"+
		"\u0f99\u0f9b\u0fbe\u0fc8\u0fc8\u1002\u104b\u1052\u109f\u10a2\u10c7\u10c9"+
		"\u10c9\u10cf\u10cf\u10d2\u10fc\u10fe\u124a\u124c\u124f\u1252\u1258\u125a"+
		"\u125a\u125c\u125f\u1262\u128a\u128c\u128f\u1292\u12b2\u12b4\u12b7\u12ba"+
		"\u12c0\u12c2\u12c2\u12c4\u12c7\u12ca\u12d8\u12da\u1312\u1314\u1317\u131a"+
		"\u135c\u135f\u1361\u136b\u1373\u1382\u1391\u13a2\u13f6\u1403\u166e\u1671"+
		"\u1681\u1683\u169c\u16a2\u16ec\u16f0\u16f2\u1702\u170e\u1710\u1716\u1722"+
		"\u1736\u1742\u1755\u1762\u176e\u1770\u1772\u1774\u1775\u1782\u17d5\u17d9"+
		"\u17d9\u17de\u17df\u17e2\u17eb\u180d\u180f\u1812\u181b\u1822\u1879\u1882"+
		"\u18ac\u18b2\u18f7\u1902\u191e\u1922\u192d\u1932\u193d\u1948\u196f\u1972"+
		"\u1976\u1982\u19ad\u19b2\u19cb\u19d2\u19dc\u1a02\u1a1d\u1a22\u1a60\u1a62"+
		"\u1a7e\u1a81\u1a8b\u1a92\u1a9b\u1aa9\u1aa9\u1b02\u1b4d\u1b52\u1b5b\u1b6d"+
		"\u1b75\u1b82\u1bf5\u1c02\u1c39\u1c42\u1c4b\u1c4f\u1c7f\u1cd2\u1cd4\u1cd6"+
		"\u1cf8\u1d02\u1de8\u1dfe\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a\u1f4f\u1f52"+
		"\u1f59\u1f5b\u1f5b\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82\u1fb6\u1fb8"+
		"\u1fbe\u1fc0\u1fc0\u1fc4\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8\u1fdd\u1fe2"+
		"\u1fee\u1ff4\u1ff6\u1ff8\u1ffe\u2041\u2042\u2056\u2056\u2073\u2073\u2081"+
		"\u2081\u2092\u209e\u20d2\u20de\u20e3\u20e3\u20e7\u20f2\u2104\u2104\u2109"+
		"\u2109\u210c\u2115\u2117\u2117\u211a\u211f\u2126\u2126\u2128\u2128\u212a"+
		"\u212a\u212c\u213b\u213e\u2141\u2147\u214b\u2150\u2150\u2162\u218a\u2c02"+
		"\u2c30\u2c32\u2c60\u2c62\u2ce6\u2ced\u2cf5\u2d02\u2d27\u2d29\u2d29\u2d2f"+
		"\u2d2f\u2d32\u2d69\u2d71\u2d71\u2d81\u2d98\u2da2\u2da8\u2daa\u2db0\u2db2"+
		"\u2db8\u2dba\u2dc0\u2dc2\u2dc8\u2dca\u2dd0\u2dd2\u2dd8\u2dda\u2de0\u2de2"+
		"\u2e01\u3007\u3009\u3023\u3031\u3033\u3037\u303a\u303e\u3043\u3098\u309b"+
		"\u30a1\u30a3\u30fc\u30fe\u3101\u3107\u312f\u3133\u3190\u31a2\u31bc\u31f2"+
		"\u3201\u3402\u4db7\u4e02\u9fce\ua002\ua48e\ua4d2\ua4ff\ua502\ua60e\ua612"+
		"\ua62d\ua642\ua671\ua676\ua67f\ua681\ua699\ua6a1\ua6f3\ua719\ua721\ua724"+
		"\ua78a\ua78d\ua790\ua792\ua795\ua7a2\ua7ac\ua7fa\ua829\ua842\ua875\ua882"+
		"\ua8c6\ua8d2\ua8db\ua8e2\ua8f9\ua8fd\ua8fd\ua902\ua92f\ua932\ua955\ua962"+
		"\ua97e\ua982\ua9c2\ua9d1\ua9db\uaa02\uaa38\uaa42\uaa4f\uaa52\uaa5b\uaa62"+
		"\uaa78\uaa7c\uaa7d\uaa82\uaac4\uaadd\uaadf\uaae2\uaaf1\uaaf4\uaaf8\uab03"+
		"\uab08\uab0b\uab10\uab13\uab18\uab22\uab28\uab2a\uab30\uabc2\uabec\uabee"+
		"\uabef\uabf2\uabfb\uac02\ud7a5\ud7b2\ud7c8\ud7cd\ud7fd\uf902\ufa6f\ufa72"+
		"\ufadb\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb2a\ufb2c\ufb38\ufb3a\ufb3e\ufb40"+
		"\ufb40\ufb42\ufb43\ufb45\ufb46\ufb48\ufbb3\ufbd5\ufd3f\ufd52\ufd91\ufd94"+
		"\ufdc9\ufdf2\ufdfd\ufe02\ufe11\ufe22\ufe28\ufe35\ufe36\ufe4f\ufe51\ufe72"+
		"\ufe76\ufe78\ufefe\uff12\uff1b\uff23\uff3c\uff41\uff41\uff43\uff5c\uff68"+
		"\uffc0\uffc4\uffc9\uffcc\uffd1\uffd4\uffd9\uffdc\uffde\4\2\2\60\62\1\4"+
		"\2\2+-\1\4\2\2(*\1\5\2\2\13\r\16\20\1\3\2\37\37\3\2\36\36\3\2\17\17\23"+
		"\2&&\u00a4\u00a7\u0591\u0591\u060d\u060d\u09f4\u09f5\u09fd\u09fd\u0af3"+
		"\u0af3\u0bfb\u0bfb\u0e41\u0e41\u17dd\u17dd\u20a2\u20bc\ua83a\ua83a\ufdfe"+
		"\ufdfe\ufe6b\ufe6b\uff06\uff06\uffe2\uffe3\uffe7\uffe8\3\2\"\"\3\2\13"+
		"\13\4\2\2#%\1\3\2\f\f\3\2\r\r\3\2!!\u0174\2C\\c|\u00ac\u00ac\u00b7\u00b7"+
		"\u00bc\u00bc\u00c2\u00d8\u00da\u00f8\u00fa\u02c3\u02c8\u02d3\u02e2\u02e6"+
		"\u02ee\u02ee\u02f0\u02f0\u0372\u0376\u0378\u0379\u037c\u037f\u0388\u0388"+
		"\u038a\u038c\u038e\u038e\u0390\u03a3\u03a5\u03f7\u03f9\u0483\u048c\u0529"+
		"\u0533\u0558\u055b\u055b\u0563\u0589\u05d2\u05ec\u05f2\u05f4\u0622\u064c"+
		"\u0670\u0671\u0673\u06d5\u06d7\u06d7\u06e7\u06e8\u06f0\u06f1\u06fc\u06fe"+
		"\u0701\u0701\u0712\u0712\u0714\u0731\u074f\u07a7\u07b3\u07b3\u07cc\u07ec"+
		"\u07f6\u07f7\u07fc\u07fc\u0802\u0817\u081c\u081c\u0826\u0826\u082a\u082a"+
		"\u0842\u085a\u08a2\u08a2\u08a4\u08ae\u0906\u093b\u093f\u093f\u0952\u0952"+
		"\u095a\u0963\u0973\u0979\u097b\u0981\u0987\u098e\u0991\u0992\u0995\u09aa"+
		"\u09ac\u09b2\u09b4\u09b4\u09b8\u09bb\u09bf\u09bf\u09d0\u09d0\u09de\u09df"+
		"\u09e1\u09e3\u09f2\u09f3\u0a07\u0a0c\u0a11\u0a12\u0a15\u0a2a\u0a2c\u0a32"+
		"\u0a34\u0a35\u0a37\u0a38\u0a3a\u0a3b\u0a5b\u0a5e\u0a60\u0a60\u0a74\u0a76"+
		"\u0a87\u0a8f\u0a91\u0a93\u0a95\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb"+
		"\u0abf\u0abf\u0ad2\u0ad2\u0ae2\u0ae3\u0b07\u0b0e\u0b11\u0b12\u0b15\u0b2a"+
		"\u0b2c\u0b32\u0b34\u0b35\u0b37\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f\u0b61\u0b63"+
		"\u0b73\u0b73\u0b85\u0b85\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b\u0b9c"+
		"\u0b9e\u0b9e\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bbb\u0bd2\u0bd2"+
		"\u0c07\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c35\u0c37\u0c3b\u0c3f\u0c3f"+
		"\u0c5a\u0c5b\u0c62\u0c63\u0c87\u0c8e\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5"+
		"\u0cb7\u0cbb\u0cbf\u0cbf\u0ce0\u0ce0\u0ce2\u0ce3\u0cf3\u0cf4\u0d07\u0d0e"+
		"\u0d10\u0d12\u0d14\u0d3c\u0d3f\u0d3f\u0d50\u0d50\u0d62\u0d63\u0d7c\u0d81"+
		"\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dbf\u0dc2\u0dc8\u0e03\u0e32"+
		"\u0e34\u0e35\u0e42\u0e48\u0e83\u0e84\u0e86\u0e86\u0e89\u0e8a\u0e8c\u0e8c"+
		"\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9\u0ea9"+
		"\u0eac\u0ead\u0eaf\u0eb2\u0eb4\u0eb5\u0ebf\u0ebf\u0ec2\u0ec6\u0ec8\u0ec8"+
		"\u0ede\u0ee1\u0f02\u0f02\u0f42\u0f49\u0f4b\u0f6e\u0f8a\u0f8e\u1002\u102c"+
		"\u1041\u1041\u1052\u1057\u105c\u105f\u1063\u1063\u1067\u1068\u1070\u1072"+
		"\u1077\u1083\u1090\u1090\u10a2\u10c7\u10c9\u10c9\u10cf\u10cf\u10d2\u10fc"+
		"\u10fe\u124a\u124c\u124f\u1252\u1258\u125a\u125a\u125c\u125f\u1262\u128a"+
		"\u128c\u128f\u1292\u12b2\u12b4\u12b7\u12ba\u12c0\u12c2\u12c2\u12c4\u12c7"+
		"\u12ca\u12d8\u12da\u1312\u1314\u1317\u131a\u135c\u1382\u1391\u13a2\u13f6"+
		"\u1403\u166e\u1671\u1681\u1683\u169c\u16a2\u16ec\u16f0\u16f2\u1702\u170e"+
		"\u1710\u1713\u1722\u1733\u1742\u1753\u1762\u176e\u1770\u1772\u1782\u17b5"+
		"\u17d9\u17d9\u17de\u17de\u1822\u1879\u1882\u18aa\u18ac\u18ac\u18b2\u18f7"+
		"\u1902\u191e\u1952\u196f\u1972\u1976\u1982\u19ad\u19c3\u19c9\u1a02\u1a18"+
		"\u1a22\u1a56\u1aa9\u1aa9\u1b07\u1b35\u1b47\u1b4d\u1b85\u1ba2\u1bb0\u1bb1"+
		"\u1bbc\u1be7\u1c02\u1c25\u1c4f\u1c51\u1c5c\u1c7f\u1ceb\u1cee\u1cf0\u1cf3"+
		"\u1cf7\u1cf8\u1d02\u1dc1\u1e02\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a\u1f4f"+
		"\u1f52\u1f59\u1f5b\u1f5b\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82\u1fb6"+
		"\u1fb8\u1fbe\u1fc0\u1fc0\u1fc4\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8\u1fdd"+
		"\u1fe2\u1fee\u1ff4\u1ff6\u1ff8\u1ffe\u2073\u2073\u2081\u2081\u2092\u209e"+
		"\u2104\u2104\u2109\u2109\u210c\u2115\u2117\u2117\u211a\u211f\u2126\u2126"+
		"\u2128\u2128\u212a\u212a\u212c\u213b\u213e\u2141\u2147\u214b\u2150\u2150"+
		"\u2162\u218a\u2c02\u2c30\u2c32\u2c60\u2c62\u2ce6\u2ced\u2cf0\u2cf4\u2cf5"+
		"\u2d02\u2d27\u2d29\u2d29\u2d2f\u2d2f\u2d32\u2d69\u2d71\u2d71\u2d82\u2d98"+
		"\u2da2\u2da8\u2daa\u2db0\u2db2\u2db8\u2dba\u2dc0\u2dc2\u2dc8\u2dca\u2dd0"+
		"\u2dd2\u2dd8\u2dda\u2de0\u3007\u3009\u3023\u302b\u3033\u3037\u303a\u303e"+
		"\u3043\u3098\u309d\u30a1\u30a3\u30fc\u30fe\u3101\u3107\u312f\u3133\u3190"+
		"\u31a2\u31bc\u31f2\u3201\u3402\u4db7\u4e02\u9fce\ua002\ua48e\ua4d2\ua4ff"+
		"\ua502\ua60e\ua612\ua621\ua62c\ua62d\ua642\ua670\ua681\ua699\ua6a2\ua6f1"+
		"\ua719\ua721\ua724\ua78a\ua78d\ua790\ua792\ua795\ua7a2\ua7ac\ua7fa\ua803"+
		"\ua805\ua807\ua809\ua80c\ua80e\ua824\ua842\ua875\ua884\ua8b5\ua8f4\ua8f9"+
		"\ua8fd\ua8fd\ua90c\ua927\ua932\ua948\ua962\ua97e\ua986\ua9b4\ua9d1\ua9d1"+
		"\uaa02\uaa2a\uaa42\uaa44\uaa46\uaa4d\uaa62\uaa78\uaa7c\uaa7c\uaa82\uaab1"+
		"\uaab3\uaab3\uaab7\uaab8\uaabb\uaabf\uaac2\uaac2\uaac4\uaac4\uaadd\uaadf"+
		"\uaae2\uaaec\uaaf4\uaaf6\uab03\uab08\uab0b\uab10\uab13\uab18\uab22\uab28"+
		"\uab2a\uab30\uabc2\uabe4\uac02\ud7a5\ud7b2\ud7c8\ud7cd\ud7fd\uf902\ufa6f"+
		"\ufa72\ufadb\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb1f\ufb21\ufb2a\ufb2c\ufb38"+
		"\ufb3a\ufb3e\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46\ufb48\ufbb3\ufbd5\ufd3f"+
		"\ufd52\ufd91\ufd94\ufdc9\ufdf2\ufdfd\ufe72\ufe76\ufe78\ufefe\uff23\uff3c"+
		"\uff43\uff5c\uff68\uffc0\uffc4\uffc9\uffcc\uffd1\uffd4\uffd9\uffdc\uffde"+
		"\u03c4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2"+
		"\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2"+
		"\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb"+
		"\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2"+
		"\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd"+
		"\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\3\u0109\3\2\2\2\5\u010b\3\2\2"+
		"\2\7\u010d\3\2\2\2\t\u010f\3\2\2\2\13\u0112\3\2\2\2\r\u0114\3\2\2\2\17"+
		"\u0116\3\2\2\2\21\u0118\3\2\2\2\23\u011a\3\2\2\2\25\u011c\3\2\2\2\27\u011e"+
		"\3\2\2\2\31\u0120\3\2\2\2\33\u0122\3\2\2\2\35\u0125\3\2\2\2\37\u0127\3"+
		"\2\2\2!\u0129\3\2\2\2#\u012b\3\2\2\2%\u012d\3\2\2\2\'\u012f\3\2\2\2)\u0132"+
		"\3\2\2\2+\u0135\3\2\2\2-\u0138\3\2\2\2/\u013a\3\2\2\2\61\u013c\3\2\2\2"+
		"\63\u013f\3\2\2\2\65\u0142\3\2\2\2\67\u0144\3\2\2\29\u0146\3\2\2\2;\u0148"+
		"\3\2\2\2=\u014a\3\2\2\2?\u014c\3\2\2\2A\u014e\3\2\2\2C\u0150\3\2\2\2E"+
		"\u0154\3\2\2\2G\u0158\3\2\2\2I\u015c\3\2\2\2K\u0160\3\2\2\2M\u0164\3\2"+
		"\2\2O\u0168\3\2\2\2Q\u016c\3\2\2\2S\u0170\3\2\2\2U\u0173\3\2\2\2W\u0177"+
		"\3\2\2\2Y\u017b\3\2\2\2[\u017f\3\2\2\2]\u0183\3\2\2\2_\u0187\3\2\2\2a"+
		"\u018b\3\2\2\2c\u018f\3\2\2\2e\u0193\3\2\2\2g\u0197\3\2\2\2i\u01ad\3\2"+
		"\2\2k\u01af\3\2\2\2m\u01c3\3\2\2\2o\u01cb\3\2\2\2q\u01cd\3\2\2\2s\u01d1"+
		"\3\2\2\2u\u01d6\3\2\2\2w\u01db\3\2\2\2y\u01e0\3\2\2\2{\u01e2\3\2\2\2}"+
		"\u01e4\3\2\2\2\177\u01e6\3\2\2\2\u0081\u01ec\3\2\2\2\u0083\u01f0\3\2\2"+
		"\2\u0085\u01f9\3\2\2\2\u0087\u01ff\3\2\2\2\u0089\u0206\3\2\2\2\u008b\u0209"+
		"\3\2\2\2\u008d\u020f\3\2\2\2\u008f\u0212\3\2\2\2\u0091\u0219\3\2\2\2\u0093"+
		"\u021d\3\2\2\2\u0095\u0224\3\2\2\2\u0097\u022b\3\2\2\2\u0099\u0232\3\2"+
		"\2\2\u009b\u0237\3\2\2\2\u009d\u0240\3\2\2\2\u009f\u0247\3\2\2\2\u00a1"+
		"\u024d\3\2\2\2\u00a3\u0250\3\2\2\2\u00a5\u0255\3\2\2\2\u00a7\u025b\3\2"+
		"\2\2\u00a9\u0266\3\2\2\2\u00ab\u026b\3\2\2\2\u00ad\u0275\3\2\2\2\u00af"+
		"\u0279\3\2\2\2\u00b1\u027f\3\2\2\2\u00b3\u0282\3\2\2\2\u00b5\u0286\3\2"+
		"\2\2\u00b7\u028a\3\2\2\2\u00b9\u028e\3\2\2\2\u00bb\u0291\3\2\2\2\u00bd"+
		"\u0298\3\2\2\2\u00bf\u029d\3\2\2\2\u00c1\u02a6\3\2\2\2\u00c3\u02a9\3\2"+
		"\2\2\u00c5\u02ae\3\2\2\2\u00c7\u02b3\3\2\2\2\u00c9\u02b9\3\2\2\2\u00cb"+
		"\u02bf\3\2\2\2\u00cd\u02c6\3\2\2\2\u00cf\u02ce\3\2\2\2\u00d1\u02d2\3\2"+
		"\2\2\u00d3\u02d7\3\2\2\2\u00d5\u02de\3\2\2\2\u00d7\u0302\3\2\2\2\u00d9"+
		"\u0306\3\2\2\2\u00db\u0310\3\2\2\2\u00dd\u0357\3\2\2\2\u00df\u0371\3\2"+
		"\2\2\u00e1\u0373\3\2\2\2\u00e3\u0376\3\2\2\2\u00e5\u0378\3\2\2\2\u00e7"+
		"\u037a\3\2\2\2\u00e9\u037c\3\2\2\2\u00eb\u037e\3\2\2\2\u00ed\u0380\3\2"+
		"\2\2\u00ef\u0382\3\2\2\2\u00f1\u0384\3\2\2\2\u00f3\u0386\3\2\2\2\u00f5"+
		"\u0388\3\2\2\2\u00f7\u038a\3\2\2\2\u00f9\u038c\3\2\2\2\u00fb\u038e\3\2"+
		"\2\2\u00fd\u0390\3\2\2\2\u00ff\u0392\3\2\2\2\u0101\u0394\3\2\2\2\u0103"+
		"\u0396\3\2\2\2\u0105\u0398\3\2\2\2\u0107\u039a\3\2\2\2\u0109\u010a\7="+
		"\2\2\u010a\4\3\2\2\2\u010b\u010c\7.\2\2\u010c\6\3\2\2\2\u010d\u010e\7"+
		"?\2\2\u010e\b\3\2\2\2\u010f\u0110\7-\2\2\u0110\u0111\7?\2\2\u0111\n\3"+
		"\2\2\2\u0112\u0113\7,\2\2\u0113\f\3\2\2\2\u0114\u0115\7*\2\2\u0115\16"+
		"\3\2\2\2\u0116\u0117\7+\2\2\u0117\20\3\2\2\2\u0118\u0119\7]\2\2\u0119"+
		"\22\3\2\2\2\u011a\u011b\7A\2\2\u011b\24\3\2\2\2\u011c\u011d\7_\2\2\u011d"+
		"\26\3\2\2\2\u011e\u011f\7<\2\2\u011f\30\3\2\2\2\u0120\u0121\7~\2\2\u0121"+
		"\32\3\2\2\2\u0122\u0123\7\60\2\2\u0123\u0124\7\60\2\2\u0124\34\3\2\2\2"+
		"\u0125\u0126\7-\2\2\u0126\36\3\2\2\2\u0127\u0128\7/\2\2\u0128 \3\2\2\2"+
		"\u0129\u012a\7\61\2\2\u012a\"\3\2\2\2\u012b\u012c\7\'\2\2\u012c$\3\2\2"+
		"\2\u012d\u012e\7`\2\2\u012e&\3\2\2\2\u012f\u0130\7?\2\2\u0130\u0131\7"+
		"\u0080\2\2\u0131(\3\2\2\2\u0132\u0133\7>\2\2\u0133\u0134\7@\2\2\u0134"+
		"*\3\2\2\2\u0135\u0136\7#\2\2\u0136\u0137\7?\2\2\u0137,\3\2\2\2\u0138\u0139"+
		"\7>\2\2\u0139.\3\2\2\2\u013a\u013b\7@\2\2\u013b\60\3\2\2\2\u013c\u013d"+
		"\7>\2\2\u013d\u013e\7?\2\2\u013e\62\3\2\2\2\u013f\u0140\7@\2\2\u0140\u0141"+
		"\7?\2\2\u0141\64\3\2\2\2\u0142\u0143\7\60\2\2\u0143\66\3\2\2\2\u0144\u0145"+
		"\7#\2\2\u01458\3\2\2\2\u0146\u0147\7}\2\2\u0147:\3\2\2\2\u0148\u0149\7"+
		"\177\2\2\u0149<\3\2\2\2\u014a\u014b\7&\2\2\u014b>\3\2\2\2\u014c\u014d"+
		"\7G\2\2\u014d@\3\2\2\2\u014e\u014f\7g\2\2\u014fB\3\2\2\2\u0150\u0151\7"+
		"\u00e4\2\2\u0151\u0152\7\u017a\2\2\u0152\u0153\7\u00aa\2\2\u0153D\3\2"+
		"\2\2\u0154\u0155\7\u00e5\2\2\u0155\u0156\7\u20ae\2\2\u0156\u0157\7\u02c8"+
		"\2\2\u0157F\3\2\2\2\u0158\u0159\7\u00f1\2\2\u0159\u015a\7\u00bb\2\2\u015a"+
		"\u015b\7\u00a6\2\2\u015bH\3\2\2\2\u015c\u015d\7\u00f1\2\2\u015d\u015e"+
		"\7\u00be\2\2\u015e\u015f\7\u0155\2\2\u015fJ\3\2\2\2\u0160\u0161\7\u00e4"+
		"\2\2\u0161\u0162\7\u017a\2\2\u0162\u0163\7\u00ab\2\2\u0163L\3\2\2\2\u0164"+
		"\u0165\7\u00e5\2\2\u0165\u0166\7\u20ae\2\2\u0166\u0167\7\u2032\2\2\u0167"+
		"N\3\2\2\2\u0168\u0169\7\u00f1\2\2\u0169\u016a\7\u00bb\2\2\u016a\u016b"+
		"\7\u00a7\2\2\u016bP\3\2\2\2\u016c\u016d\7\u00f1\2\2\u016d\u016e\7\u00be"+
		"\2\2\u016e\u016f\7\u0180\2\2\u016fR\3\2\2\2\u0170\u0171\7\u00c4\2\2\u0171"+
		"\u0172\7\u00af\2\2\u0172T\3\2\2\2\u0173\u0174\7\u00e4\2\2\u0174\u0175"+
		"\7\u20ae\2\2\u0175\u0176\7\uffff\2\2\u0176V\3\2\2\2\u0177\u0178\7\u00e4"+
		"\2\2\u0178\u0179\7\u20ae\2\2\u0179\u017a\7\u201a\2\2\u017aX\3\2\2\2\u017b"+
		"\u017c\7\u00e4\2\2\u017c\u017d\7\u20ae\2\2\u017d\u017e\7\u201b\2\2\u017e"+
		"Z\3\2\2\2\u017f\u0180\7\u00e4\2\2\u0180\u0181\7\u20ae\2\2\u0181\u0182"+
		"\7\u201e\2\2\u0182\\\3\2\2\2\u0183\u0184\7\u00e4\2\2\u0184\u0185\7\u20ae"+
		"\2\2\u0185\u0186\7\u201f\2\2\u0186^\3\2\2\2\u0187\u0188\7\u00e4\2\2\u0188"+
		"\u0189\7\u20ae\2\2\u0189\u018a\7\u2024\2\2\u018a`\3\2\2\2\u018b\u018c"+
		"\7\u00e4\2\2\u018c\u018d\7\u02c8\2\2\u018d\u018e\7\u201b\2\2\u018eb\3"+
		"\2\2\2\u018f\u0190\7\u00f1\2\2\u0190\u0191\7\u00bb\2\2\u0191\u0192\7\u02de"+
		"\2\2\u0192d\3\2\2\2\u0193\u0194\7\u00f1\2\2\u0194\u0195\7\u00bb\2\2\u0195"+
		"\u0196\7\u00a5\2\2\u0196f\3\2\2\2\u0197\u0198\7\u00f1\2\2\u0198\u0199"+
		"\7\u00be\2\2\u0199\u019a\7\uffff\2\2\u019ah\3\2\2\2\u019b\u01a0\7$\2\2"+
		"\u019c\u019f\5\u00ff\u0080\2\u019d\u019f\5k\66\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01ae\7$\2\2\u01a4"+
		"\u01a9\7)\2\2\u01a5\u01a8\5\u00efx\2\u01a6\u01a8\5k\66\2\u01a7\u01a5\3"+
		"\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ae\7)"+
		"\2\2\u01ad\u019b\3\2\2\2\u01ad\u01a4\3\2\2\2\u01aej\3\2\2\2\u01af\u01c1"+
		"\7^\2\2\u01b0\u01c2\t\2\2\2\u01b1\u01b2\t\3\2\2\u01b2\u01b3\5y=\2\u01b3"+
		"\u01b4\5y=\2\u01b4\u01b5\5y=\2\u01b5\u01b6\5y=\2\u01b6\u01c2\3\2\2\2\u01b7"+
		"\u01b8\t\3\2\2\u01b8\u01b9\5y=\2\u01b9\u01ba\5y=\2\u01ba\u01bb\5y=\2\u01bb"+
		"\u01bc\5y=\2\u01bc\u01bd\5y=\2\u01bd\u01be\5y=\2\u01be\u01bf\5y=\2\u01bf"+
		"\u01c0\5y=\2\u01c0\u01c2\3\2\2\2\u01c1\u01b0\3\2\2\2\u01c1\u01b1\3\2\2"+
		"\2\u01c1\u01b7\3\2\2\2\u01c2l\3\2\2\2\u01c3\u01c4\5\u00e1q\2\u01c4\u01c5"+
		"\5s:\2\u01c5n\3\2\2\2\u01c6\u01c8\4\63;\2\u01c7\u01c9\5u;\2\u01c8\u01c7"+
		"\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01cc\7\62\2\2"+
		"\u01cb\u01c6\3\2\2\2\u01cb\u01ca\3\2\2\2\u01ccp\3\2\2\2\u01cd\u01ce\7"+
		"\62\2\2\u01ce\u01cf\5w<\2\u01cfr\3\2\2\2\u01d0\u01d2\5y=\2\u01d1\u01d0"+
		"\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"t\3\2\2\2\u01d5\u01d7\5{>\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9v\3\2\2\2\u01da\u01dc\5}?\2\u01db"+
		"\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01dex\3\2\2\2\u01df\u01e1\t\4\2\2\u01e0\u01df\3\2\2\2\u01e1z\3\2"+
		"\2\2\u01e2\u01e3\4\62;\2\u01e3|\3\2\2\2\u01e4\u01e5\4\629\2\u01e5~\3\2"+
		"\2\2\u01e6\u01e7\t\3\2\2\u01e7\u01e8\t\5\2\2\u01e8\u01e9\t\6\2\2\u01e9"+
		"\u01ea\t\7\2\2\u01ea\u01eb\t\5\2\2\u01eb\u0080\3\2\2\2\u01ec\u01ed\t\b"+
		"\2\2\u01ed\u01ee\t\t\2\2\u01ee\u01ef\t\t\2\2\u01ef\u0082\3\2\2\2\u01f0"+
		"\u01f1\t\7\2\2\u01f1\u01f2\t\n\2\2\u01f2\u01f3\t\13\2\2\u01f3\u01f4\t"+
		"\6\2\2\u01f4\u01f5\t\7\2\2\u01f5\u01f6\t\5\2\2\u01f6\u01f7\t\b\2\2\u01f7"+
		"\u01f8\t\t\2\2\u01f8\u0084\3\2\2\2\u01f9\u01fa\t\f\2\2\u01fa\u01fb\t\b"+
		"\2\2\u01fb\u01fc\t\13\2\2\u01fc\u01fd\t\r\2\2\u01fd\u01fe\t\16\2\2\u01fe"+
		"\u0086\3\2\2\2\u01ff\u0200\t\3\2\2\u0200\u0201\t\5\2\2\u0201\u0202\t\17"+
		"\2\2\u0202\u0203\t\6\2\2\u0203\u0204\t\5\2\2\u0204\u0205\t\20\2\2\u0205"+
		"\u0088\3\2\2\2\u0206\u0207\t\b\2\2\u0207\u0208\t\21\2\2\u0208\u008a\3"+
		"\2\2\2\u0209\u020a\t\f\2\2\u020a\u020b\t\22\2\2\u020b\u020c\t\23\2\2\u020c"+
		"\u020d\t\24\2\2\u020d\u020e\t\22\2\2\u020e\u008c\3\2\2\2\u020f\u0210\t"+
		"\7\2\2\u0210\u0211\t\5\2\2\u0211\u008e\3\2\2\2\u0212\u0213\t\r\2\2\u0213"+
		"\u0214\t\23\2\2\u0214\u0215\t\22\2\2\u0215\u0216\t\b\2\2\u0216\u0217\t"+
		"\13\2\2\u0217\u0218\t\22\2\2\u0218\u0090\3\2\2\2\u0219\u021a\t\21\2\2"+
		"\u021a\u021b\t\22\2\2\u021b\u021c\t\13\2\2\u021c\u0092\3\2\2\2\u021d\u021e"+
		"\t\20\2\2\u021e\u021f\t\22\2\2\u021f\u0220\t\t\2\2\u0220\u0221\t\22\2"+
		"\2\u0221\u0222\t\13\2\2\u0222\u0223\t\22\2\2\u0223\u0094\3\2\2\2\u0224"+
		"\u0225\t\20\2\2\u0225\u0226\t\22\2\2\u0226\u0227\t\13\2\2\u0227\u0228"+
		"\t\b\2\2\u0228\u0229\t\r\2\2\u0229\u022a\t\16\2\2\u022a\u0096\3\2\2\2"+
		"\u022b\u022c\t\23\2\2\u022c\u022d\t\22\2\2\u022d\u022e\t\f\2\2\u022e\u022f"+
		"\t\7\2\2\u022f\u0230\t\25\2\2\u0230\u0231\t\22\2\2\u0231\u0098\3\2\2\2"+
		"\u0232\u0233\t\17\2\2\u0233\u0234\t\6\2\2\u0234\u0235\t\13\2\2\u0235\u0236"+
		"\t\16\2\2\u0236\u009a\3\2\2\2\u0237\u0238\t\20\2\2\u0238\u0239\t\6\2\2"+
		"\u0239\u023a\t\21\2\2\u023a\u023b\t\13\2\2\u023b\u023c\t\6\2\2\u023c\u023d"+
		"\t\5\2\2\u023d\u023e\t\r\2\2\u023e\u023f\t\13\2\2\u023f\u009c\3\2\2\2"+
		"\u0240\u0241\t\23\2\2\u0241\u0242\t\22\2\2\u0242\u0243\t\13\2\2\u0243"+
		"\u0244\t\3\2\2\u0244\u0245\t\23\2\2\u0245\u0246\t\5\2\2\u0246\u009e\3"+
		"\2\2\2\u0247\u0248\t\7\2\2\u0248\u0249\t\23\2\2\u0249\u024a\t\20\2\2\u024a"+
		"\u024b\t\22\2\2\u024b\u024c\t\23\2\2\u024c\u00a0\3\2\2\2\u024d\u024e\t"+
		"\26\2\2\u024e\u024f\t\27\2\2\u024f\u00a2\3\2\2\2\u0250\u0251\t\21\2\2"+
		"\u0251\u0252\t\30\2\2\u0252\u0253\t\6\2\2\u0253\u0254\t\n\2\2\u0254\u00a4"+
		"\3\2\2\2\u0255\u0256\t\t\2\2\u0256\u0257\t\6\2\2\u0257\u0258\t\f\2\2\u0258"+
		"\u0259\t\6\2\2\u0259\u025a\t\13\2\2\u025a\u00a6\3\2\2\2\u025b\u025c\t"+
		"\20\2\2\u025c\u025d\t\22\2\2\u025d\u025e\t\21\2\2\u025e\u025f\t\r\2\2"+
		"\u025f\u0260\t\22\2\2\u0260\u0261\t\5\2\2\u0261\u0262\t\20\2\2\u0262\u0263"+
		"\t\6\2\2\u0263\u0264\t\5\2\2\u0264\u0265\t\24\2\2\u0265\u00a8\3\2\2\2"+
		"\u0266\u0267\t\20\2\2\u0267\u0268\t\22\2\2\u0268\u0269\t\21\2\2\u0269"+
		"\u026a\t\r\2\2\u026a\u00aa\3\2\2\2\u026b\u026c\t\b\2\2\u026c\u026d\t\21"+
		"\2\2\u026d\u026e\t\r\2\2\u026e\u026f\t\22\2\2\u026f\u0270\t\5\2\2\u0270"+
		"\u0271\t\20\2\2\u0271\u0272\t\6\2\2\u0272\u0273\t\5\2\2\u0273\u0274\t"+
		"\24\2\2\u0274\u00ac\3\2\2\2\u0275\u0276\t\b\2\2\u0276\u0277\t\21\2\2\u0277"+
		"\u0278\t\r\2\2\u0278\u00ae\3\2\2\2\u0279\u027a\t\17\2\2\u027a\u027b\t"+
		"\16\2\2\u027b\u027c\t\22\2\2\u027c\u027d\t\23\2\2\u027d\u027e\t\22\2\2"+
		"\u027e\u00b0\3\2\2\2\u027f\u0280\t\7\2\2\u0280\u0281\t\23\2\2\u0281\u00b2"+
		"\3\2\2\2\u0282\u0283\t\31\2\2\u0283\u0284\t\7\2\2\u0284\u0285\t\23\2\2"+
		"\u0285\u00b4\3\2\2\2\u0286\u0287\t\b\2\2\u0287\u0288\t\5\2\2\u0288\u0289"+
		"\t\20\2\2\u0289\u00b6\3\2\2\2\u028a\u028b\t\5\2\2\u028b\u028c\t\7\2\2"+
		"\u028c\u028d\t\13\2\2\u028d\u00b8\3\2\2\2\u028e\u028f\t\6\2\2\u028f\u0290"+
		"\t\5\2\2\u0290\u00ba\3\2\2\2\u0291\u0292\t\21\2\2\u0292\u0293\t\13\2\2"+
		"\u0293\u0294\t\b\2\2\u0294\u0295\t\23\2\2\u0295\u0296\t\13\2\2\u0296\u0297"+
		"\t\21\2\2\u0297\u00bc\3\2\2\2\u0298\u0299\t\22\2\2\u0299\u029a\t\5\2\2"+
		"\u029a\u029b\t\20\2\2\u029b\u029c\t\21\2\2\u029c\u00be\3\2\2\2\u029d\u029e"+
		"\t\r\2\2\u029e\u029f\t\7\2\2\u029f\u02a0\t\5\2\2\u02a0\u02a1\t\13\2\2"+
		"\u02a1\u02a2\t\b\2\2\u02a2\u02a3\t\6\2\2\u02a3\u02a4\t\5\2\2\u02a4\u02a5"+
		"\t\21\2\2\u02a5\u00c0\3\2\2\2\u02a6\u02a7\t\6\2\2\u02a7\u02a8\t\21\2\2"+
		"\u02a8\u00c2\3\2\2\2\u02a9\u02aa\t\5\2\2\u02aa\u02ab\t\3\2\2\u02ab\u02ac"+
		"\t\t\2\2\u02ac\u02ad\t\t\2\2\u02ad\u00c4\3\2\2\2\u02ae\u02af\t\13\2\2"+
		"\u02af\u02b0\t\23\2\2\u02b0\u02b1\t\3\2\2\u02b1\u02b2\t\22\2\2\u02b2\u00c6"+
		"\3\2\2\2\u02b3\u02b4\t\32\2\2\u02b4\u02b5\t\b\2\2\u02b5\u02b6\t\t\2\2"+
		"\u02b6\u02b7\t\21\2\2\u02b7\u02b8\t\22\2\2\u02b8\u00c8\3\2\2\2\u02b9\u02ba"+
		"\t\r\2\2\u02ba\u02bb\t\7\2\2\u02bb\u02bc\t\3\2\2\u02bc\u02bd\t\5\2\2\u02bd"+
		"\u02be\t\13\2\2\u02be\u00ca\3\2\2\2\u02bf\u02c0\t\32\2\2\u02c0\u02c1\t"+
		"\6\2\2\u02c1\u02c2\t\t\2\2\u02c2\u02c3\t\13\2\2\u02c3\u02c4\t\22\2\2\u02c4"+
		"\u02c5\t\23\2\2\u02c5\u00cc\3\2\2\2\u02c6\u02c7\t\22\2\2\u02c7\u02c8\t"+
		"\31\2\2\u02c8\u02c9\t\13\2\2\u02c9\u02ca\t\23\2\2\u02ca\u02cb\t\b\2\2"+
		"\u02cb\u02cc\t\r\2\2\u02cc\u02cd\t\13\2\2\u02cd\u00ce\3\2\2\2\u02ce\u02cf"+
		"\t\b\2\2\u02cf\u02d0\t\5\2\2\u02d0\u02d1\t\27\2\2\u02d1\u00d0\3\2\2\2"+
		"\u02d2\u02d3\t\5\2\2\u02d3\u02d4\t\7\2\2\u02d4\u02d5\t\5\2\2\u02d5\u02d6"+
		"\t\22\2\2\u02d6\u00d2\3\2\2\2\u02d7\u02d8\t\21\2\2\u02d8\u02d9\t\6\2\2"+
		"\u02d9\u02da\t\5\2\2\u02da\u02db\t\24\2\2\u02db\u02dc\t\t\2\2\u02dc\u02dd"+
		"\t\22\2\2\u02dd\u00d4\3\2\2\2\u02de\u02e2\5\u00d7l\2\u02df\u02e1\5\u00d9"+
		"m\2\u02e0\u02df\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2"+
		"\u02e3\3\2\2\2\u02e3\u00d6\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u0303\5\u0107"+
		"\u0084\2\u02e6\u0303\7a\2\2\u02e7\u02e8\7\u00e4\2\2\u02e8\u02e9\7\u20ae"+
		"\2\2\u02e9\u0303\7\u00c1\2\2\u02ea\u02eb\7\u00e4\2\2\u02eb\u02ec\7\uffff"+
		"\2\2\u02ec\u0303\7\u20ae\2\2\u02ed\u02ee\7\u00e4\2\2\u02ee\u02ef\7\uffff"+
		"\2\2\u02ef\u0303\7\u201f\2\2\u02f0\u02f1\7\u00f1\2\2\u02f1\u02f2\7\u00ba"+
		"\2\2\u02f2\u0303\7\u00b5\2\2\u02f3\u02f4\7\u00f1\2\2\u02f4\u02f5\7\u00ba"+
		"\2\2\u02f5\u0303\7\u00b6\2\2\u02f6\u02f7\7\u00f1\2\2\u02f7\u02f8\7\u00bb"+
		"\2\2\u02f8\u0303\7\uffff\2\2\u02f9\u02fa\7\u00f1\2\2\u02fa\u02fb\7\u00bb"+
		"\2\2\u02fb\u0303\7\u017f\2\2\u02fc\u02fd\7\u00f1\2\2\u02fd\u02fe\7\u00bb"+
		"\2\2\u02fe\u0303\7\uffff\2\2\u02ff\u0300\7\u00f1\2\2\u0300\u0301\7\u00be"+
		"\2\2\u0301\u0303\7\u00c1\2\2\u0302\u02e5\3\2\2\2\u0302\u02e6\3\2\2\2\u0302"+
		"\u02e7\3\2\2\2\u0302\u02ea\3\2\2\2\u0302\u02ed\3\2\2\2\u0302\u02f0\3\2"+
		"\2\2\u0302\u02f3\3\2\2\2\u0302\u02f6\3\2\2\2\u0302\u02f9\3\2\2\2\u0302"+
		"\u02fc\3\2\2\2\u0302\u02ff\3\2\2\2\u0303\u00d8\3\2\2\2\u0304\u0307\5\u00e9"+
		"u\2\u0305\u0307\5\u00f9}\2\u0306\u0304\3\2\2\2\u0306\u0305\3\2\2\2\u0307"+
		"\u00da\3\2\2\2\u0308\u030c\7b\2\2\u0309\u030b\5\u00e5s\2\u030a\u0309\3"+
		"\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d"+
		"\u030f\3\2\2\2\u030e\u030c\3\2\2\2\u030f\u0311\7b\2\2\u0310\u0308\3\2"+
		"\2\2\u0311\u0312\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313"+
		"\u00dc\3\2\2\2\u0314\u0358\5\u00fb~\2\u0315\u0358\5\u00fd\177\2\u0316"+
		"\u0358\5\u0101\u0081\2\u0317\u0358\5\u0103\u0082\2\u0318\u0358\5\u00e3"+
		"r\2\u0319\u0358\5\u00f7|\2\u031a\u0358\5\u00f5{\2\u031b\u0358\5\u00f3"+
		"z\2\u031c\u0358\5\u00e7t\2\u031d\u0358\5\u0105\u0083\2\u031e\u031f\7\u00e3"+
		"\2\2\u031f\u0320\7\u0163\2\2\u0320\u0358\7\u20ae\2\2\u0321\u0322\7\u00e3"+
		"\2\2\u0322\u0323\7\u00a2\2\2\u0323\u0358\7\u017f\2\2\u0324\u0325\7\u00e4"+
		"\2\2\u0325\u0326\7\u20ae\2\2\u0326\u0358\7\u20ae\2\2\u0327\u0328\7\u00e4"+
		"\2\2\u0328\u0329\7\u20ae\2\2\u0329\u0358\7\uffff\2\2\u032a\u032b\7\u00e4"+
		"\2\2\u032b\u032c\7\u20ae\2\2\u032c\u0358\7\u201c\2\2\u032d\u032e\7\u00e4"+
		"\2\2\u032e\u032f\7\u20ae\2\2\u032f\u0358\7\u0194\2\2\u0330\u0331\7\u00e4"+
		"\2\2\u0331\u0332\7\u20ae\2\2\u0332\u0358\7\u2020\2\2\u0333\u0334\7\u00e4"+
		"\2\2\u0334\u0335\7\u20ae\2\2\u0335\u0358\7\u2028\2\2\u0336\u0337\7\u00e4"+
		"\2\2\u0337\u0338\7\u20ae\2\2\u0338\u0358\7\u2022\2\2\u0339\u033a\7\u00e4"+
		"\2\2\u033a\u033b\7\u20ae\2\2\u033b\u0358\7\u02c8\2\2\u033c\u033d\7\u00e4"+
		"\2\2\u033d\u033e\7\u20ae\2\2\u033e\u0358\7\u2032\2\2\u033f\u0340\7\u00e4"+
		"\2\2\u0340\u0341\7\u20ae\2\2\u0341\u0358\7\u0162\2\2\u0342\u0343\7\u00e4"+
		"\2\2\u0343\u0344\7\u20ae\2\2\u0344\u0358\7\u00aa\2\2\u0345\u0346\7\u00e4"+
		"\2\2\u0346\u0347\7\u20ae\2\2\u0347\u0358\7\u00ab\2\2\u0348\u0349\7\u00e4"+
		"\2\2\u0349\u034a\7\uffff\2\2\u034a\u0358\7\u017a\2\2\u034b\u034c\7\u00e5"+
		"\2\2\u034c\u034d\7\u20ae\2\2\u034d\u0358\7\u20ae\2\2\u034e\u034f\7\u00c4"+
		"\2\2\u034f\u0358\7\u00a2\2\2\u0350\u0351\7\u00e4\2\2\u0351\u0352\7\u20ae"+
		"\2\2\u0352\u0358\7\u2023\2\2\u0353\u0354\7\u00e4\2\2\u0354\u0355\7\u20ae"+
		"\2\2\u0355\u0358\7\u00b1\2\2\u0356\u0358\5\u00dfp\2\u0357\u0314\3\2\2"+
		"\2\u0357\u0315\3\2\2\2\u0357\u0316\3\2\2\2\u0357\u0317\3\2\2\2\u0357\u0318"+
		"\3\2\2\2\u0357\u0319\3\2\2\2\u0357\u031a\3\2\2\2\u0357\u031b\3\2\2\2\u0357"+
		"\u031c\3\2\2\2\u0357\u031d\3\2\2\2\u0357\u031e\3\2\2\2\u0357\u0321\3\2"+
		"\2\2\u0357\u0324\3\2\2\2\u0357\u0327\3\2\2\2\u0357\u032a\3\2\2\2\u0357"+
		"\u032d\3\2\2\2\u0357\u0330\3\2\2\2\u0357\u0333\3\2\2\2\u0357\u0336\3\2"+
		"\2\2\u0357\u0339\3\2\2\2\u0357\u033c\3\2\2\2\u0357\u033f\3\2\2\2\u0357"+
		"\u0342\3\2\2\2\u0357\u0345\3\2\2\2\u0357\u0348\3\2\2\2\u0357\u034b\3\2"+
		"\2\2\u0357\u034e\3\2\2\2\u0357\u0350\3\2\2\2\u0357\u0353\3\2\2\2\u0357"+
		"\u0356\3\2\2\2\u0358\u00de\3\2\2\2\u0359\u035a\7\61\2\2\u035a\u035b\7"+
		",\2\2\u035b\u0361\3\2\2\2\u035c\u0360\5\u00edw\2\u035d\u035e\7,\2\2\u035e"+
		"\u0360\5\u00ebv\2\u035f\u035c\3\2\2\2\u035f\u035d\3\2\2\2\u0360\u0363"+
		"\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0364\3\2\2\2\u0363"+
		"\u0361\3\2\2\2\u0364\u0365\7,\2\2\u0365\u0372\7\61\2\2\u0366\u0367\7\61"+
		"\2\2\u0367\u0368\7\61\2\2\u0368\u0369\3\2\2\2\u0369\u036b\5\u00f1y\2\u036a"+
		"\u036c\5\u00f7|\2\u036b\u036a\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036f"+
		"\3\2\2\2\u036d\u0370\5\u0101\u0081\2\u036e\u0370\7\2\2\3\u036f\u036d\3"+
		"\2\2\2\u036f\u036e\3\2\2\2\u0370\u0372\3\2\2\2\u0371\u0359\3\2\2\2\u0371"+
		"\u0366\3\2\2\2\u0372\u00e0\3\2\2\2\u0373\u0374\4\62\62\2\u0374\u0375\t"+
		"\31\2\2\u0375\u00e2\3\2\2\2\u0376\u0377\t\33\2\2\u0377\u00e4\3\2\2\2\u0378"+
		"\u0379\t\34\2\2\u0379\u00e6\3\2\2\2\u037a\u037b\t\35\2\2\u037b\u00e8\3"+
		"\2\2\2\u037c\u037d\t\36\2\2\u037d\u00ea\3\2\2\2\u037e\u037f\t\37\2\2\u037f"+
		"\u00ec\3\2\2\2\u0380\u0381\t \2\2\u0381\u00ee\3\2\2\2\u0382\u0383\t!\2"+
		"\2\u0383\u00f0\3\2\2\2\u0384\u0385\t\"\2\2\u0385\u00f2\3\2\2\2\u0386\u0387"+
		"\t#\2\2\u0387\u00f4\3\2\2\2\u0388\u0389\t$\2\2\u0389\u00f6\3\2\2\2\u038a"+
		"\u038b\t%\2\2\u038b\u00f8\3\2\2\2\u038c\u038d\t&\2\2\u038d\u00fa\3\2\2"+
		"\2\u038e\u038f\t\'\2\2\u038f\u00fc\3\2\2\2\u0390\u0391\t(\2\2\u0391\u00fe"+
		"\3\2\2\2\u0392\u0393\t)\2\2\u0393\u0100\3\2\2\2\u0394\u0395\t*\2\2\u0395"+
		"\u0102\3\2\2\2\u0396\u0397\t+\2\2\u0397\u0104\3\2\2\2\u0398\u0399\t,\2"+
		"\2\u0399\u0106\3\2\2\2\u039a\u039b\t-\2\2\u039b\u0108\3\2\2\2\32\2\u019e"+
		"\u01a0\u01a7\u01a9\u01ad\u01c1\u01c8\u01cb\u01d3\u01d8\u01dd\u01e0\u02e2"+
		"\u0302\u0306\u030c\u0312\u0357\u035f\u0361\u036b\u036f\u0371\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}