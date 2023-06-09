// Generated from /Users/lerfich/Documents/antlr/grammar/TypescriptToPython.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, CONSOLELOG=15, BREAK=16, 
		CONTINUE=17, WHILE=18, FOR=19, IF=20, ELSE=21, EQ=22, EQOPS=23, MATHOPERATION=24, 
		INT=25, FLOAT=26, BOOLEAN=27, STRING=28, WORD=29, WHITESPACE=30, NEWLINE=31, 
		COMMENT=32, EOL=33, COMPAREOPERATION=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "CONSOLELOG", "BREAK", "CONTINUE", 
			"WHILE", "FOR", "IF", "ELSE", "EQ", "EQOPS", "MATHOPERATION", "INT", 
			"FLOAT", "BOOLEAN", "STRING", "WORD", "WHITESPACE", "NEWLINE", "COMMENT", 
			"EOL", "COMPAREOPERATION", "PLUS", "MINUS", "MULT", "POWER", "DIV", "INTDIV", 
			"REMAINDER", "PLUSEQ", "MINUSEQ", "MULTEQ", "DIVEQ", "REMAINDEREQ", "EQUALITY", 
			"STREQUALITY", "INEQUALITY", "STRINEQUALITY", "LESS", "LARGER", "LESSOREQ", 
			"MOREOREQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'('", "')'", "','", "'{'", "'}'", "'return'", "'['", 
			"']'", "'.'", "'let'", "'var'", "'const'", "'new'", "'console.log'", 
			"'break'", "'continue'", "'while'", "'for'", "'if'", "'else'", "'='", 
			null, null, null, null, null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "CONSOLELOG", "BREAK", "CONTINUE", "WHILE", "FOR", 
			"IF", "ELSE", "EQ", "EQOPS", "MATHOPERATION", "INT", "FLOAT", "BOOLEAN", 
			"STRING", "WORD", "WHITESPACE", "NEWLINE", "COMMENT", "EOL", "COMPAREOPERATION"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public pythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TypescriptToPython.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u016f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u00d6\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u00df\n\31\3\32\5\32\u00e2\n\32\3\32\6\32\u00e5\n\32\r\32\16\32\u00e6"+
		"\3\33\5\33\u00ea\n\33\3\33\6\33\u00ed\n\33\r\33\16\33\u00ee\3\33\3\33"+
		"\6\33\u00f3\n\33\r\33\16\33\u00f4\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\5\34\u0100\n\34\3\35\3\35\7\35\u0104\n\35\f\35\16\35\u0107\13"+
		"\35\3\35\3\35\3\36\3\36\7\36\u010d\n\36\f\36\16\36\u0110\13\36\3\37\6"+
		"\37\u0113\n\37\r\37\16\37\u0114\3\37\3\37\3 \5 \u011a\n \3 \3 \6 \u011e"+
		"\n \r \16 \u011f\3 \3 \3!\3!\3!\3!\7!\u0128\n!\f!\16!\u012b\13!\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0137\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3"+
		"(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3\u0105\28\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2\3\2\7\3\2"+
		"\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\4\2\f\f\16\17\2\u0178\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3o\3\2\2\2\5"+
		"x\3\2\2\2\7z\3\2\2\2\t|\3\2\2\2\13~\3\2\2\2\r\u0080\3\2\2\2\17\u0082\3"+
		"\2\2\2\21\u0089\3\2\2\2\23\u008b\3\2\2\2\25\u008d\3\2\2\2\27\u008f\3\2"+
		"\2\2\31\u0093\3\2\2\2\33\u0097\3\2\2\2\35\u009d\3\2\2\2\37\u00a1\3\2\2"+
		"\2!\u00ad\3\2\2\2#\u00b3\3\2\2\2%\u00bc\3\2\2\2\'\u00c2\3\2\2\2)\u00c6"+
		"\3\2\2\2+\u00c9\3\2\2\2-\u00ce\3\2\2\2/\u00d5\3\2\2\2\61\u00de\3\2\2\2"+
		"\63\u00e1\3\2\2\2\65\u00e9\3\2\2\2\67\u00ff\3\2\2\29\u0101\3\2\2\2;\u010a"+
		"\3\2\2\2=\u0112\3\2\2\2?\u011d\3\2\2\2A\u0123\3\2\2\2C\u012c\3\2\2\2E"+
		"\u0136\3\2\2\2G\u0138\3\2\2\2I\u013a\3\2\2\2K\u013c\3\2\2\2M\u013e\3\2"+
		"\2\2O\u0141\3\2\2\2Q\u0143\3\2\2\2S\u0146\3\2\2\2U\u0148\3\2\2\2W\u014b"+
		"\3\2\2\2Y\u014e\3\2\2\2[\u0151\3\2\2\2]\u0154\3\2\2\2_\u0157\3\2\2\2a"+
		"\u015a\3\2\2\2c\u015e\3\2\2\2e\u0161\3\2\2\2g\u0165\3\2\2\2i\u0167\3\2"+
		"\2\2k\u0169\3\2\2\2m\u016c\3\2\2\2op\7h\2\2pq\7w\2\2qr\7p\2\2rs\7e\2\2"+
		"st\7v\2\2tu\7k\2\2uv\7q\2\2vw\7p\2\2w\4\3\2\2\2xy\7*\2\2y\6\3\2\2\2z{"+
		"\7+\2\2{\b\3\2\2\2|}\7.\2\2}\n\3\2\2\2~\177\7}\2\2\177\f\3\2\2\2\u0080"+
		"\u0081\7\177\2\2\u0081\16\3\2\2\2\u0082\u0083\7t\2\2\u0083\u0084\7g\2"+
		"\2\u0084\u0085\7v\2\2\u0085\u0086\7w\2\2\u0086\u0087\7t\2\2\u0087\u0088"+
		"\7p\2\2\u0088\20\3\2\2\2\u0089\u008a\7]\2\2\u008a\22\3\2\2\2\u008b\u008c"+
		"\7_\2\2\u008c\24\3\2\2\2\u008d\u008e\7\60\2\2\u008e\26\3\2\2\2\u008f\u0090"+
		"\7n\2\2\u0090\u0091\7g\2\2\u0091\u0092\7v\2\2\u0092\30\3\2\2\2\u0093\u0094"+
		"\7x\2\2\u0094\u0095\7c\2\2\u0095\u0096\7t\2\2\u0096\32\3\2\2\2\u0097\u0098"+
		"\7e\2\2\u0098\u0099\7q\2\2\u0099\u009a\7p\2\2\u009a\u009b\7u\2\2\u009b"+
		"\u009c\7v\2\2\u009c\34\3\2\2\2\u009d\u009e\7p\2\2\u009e\u009f\7g\2\2\u009f"+
		"\u00a0\7y\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7q\2\2\u00a3"+
		"\u00a4\7p\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7n\2\2"+
		"\u00a7\u00a8\7g\2\2\u00a8\u00a9\7\60\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab"+
		"\7q\2\2\u00ab\u00ac\7i\2\2\u00ac \3\2\2\2\u00ad\u00ae\7d\2\2\u00ae\u00af"+
		"\7t\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7m\2\2\u00b2"+
		"\"\3\2\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7p\2\2\u00b6"+
		"\u00b7\7v\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7w\2\2"+
		"\u00ba\u00bb\7g\2\2\u00bb$\3\2\2\2\u00bc\u00bd\7y\2\2\u00bd\u00be\7j\2"+
		"\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7g\2\2\u00c1&\3\2"+
		"\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7t\2\2\u00c5(\3"+
		"\2\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7h\2\2\u00c8*\3\2\2\2\u00c9\u00ca"+
		"\7g\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		",\3\2\2\2\u00ce\u00cf\7?\2\2\u00cf.\3\2\2\2\u00d0\u00d6\5U+\2\u00d1\u00d6"+
		"\5W,\2\u00d2\u00d6\5Y-\2\u00d3\u00d6\5[.\2\u00d4\u00d6\5]/\2\u00d5\u00d0"+
		"\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d4\3\2\2\2\u00d6\60\3\2\2\2\u00d7\u00df\5G$\2\u00d8\u00df\5I%\2\u00d9"+
		"\u00df\5K&\2\u00da\u00df\5M\'\2\u00db\u00df\5O(\2\u00dc\u00df\5Q)\2\u00dd"+
		"\u00df\5S*\2\u00de\u00d7\3\2\2\2\u00de\u00d8\3\2\2\2\u00de\u00d9\3\2\2"+
		"\2\u00de\u00da\3\2\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd"+
		"\3\2\2\2\u00df\62\3\2\2\2\u00e0\u00e2\7/\2\2\u00e1\u00e0\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e5\t\2\2\2\u00e4\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\64\3\2\2\2\u00e8\u00ea\7/\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2"+
		"\u00ea\u00ec\3\2\2\2\u00eb\u00ed\t\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f2\7\60\2\2\u00f1\u00f3\t\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3"+
		"\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\66\3\2\2\2\u00f6"+
		"\u00f7\7v\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7w\2\2\u00f9\u0100\7g\2\2"+
		"\u00fa\u00fb\7h\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe"+
		"\7u\2\2\u00fe\u0100\7g\2\2\u00ff\u00f6\3\2\2\2\u00ff\u00fa\3\2\2\2\u0100"+
		"8\3\2\2\2\u0101\u0105\7$\2\2\u0102\u0104\13\2\2\2\u0103\u0102\3\2\2\2"+
		"\u0104\u0107\3\2\2\2\u0105\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7$\2\2\u0109:\3\2\2\2\u010a\u010e"+
		"\t\3\2\2\u010b\u010d\t\4\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f<\3\2\2\2\u0110\u010e\3\2\2\2"+
		"\u0111\u0113\t\5\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\b\37\2\2"+
		"\u0117>\3\2\2\2\u0118\u011a\7\17\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\u011e\7\f\2\2\u011c\u011e\7\17\2\2\u011d"+
		"\u0119\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\b \2\2\u0122"+
		"@\3\2\2\2\u0123\u0124\7\61\2\2\u0124\u0125\7\61\2\2\u0125\u0129\3\2\2"+
		"\2\u0126\u0128\n\6\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012aB\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012d\7=\2\2\u012dD\3\2\2\2\u012e\u0137\5_\60\2\u012f\u0137\5a\61\2\u0130"+
		"\u0137\5c\62\2\u0131\u0137\5e\63\2\u0132\u0137\5g\64\2\u0133\u0137\5i"+
		"\65\2\u0134\u0137\5k\66\2\u0135\u0137\5m\67\2\u0136\u012e\3\2\2\2\u0136"+
		"\u012f\3\2\2\2\u0136\u0130\3\2\2\2\u0136\u0131\3\2\2\2\u0136\u0132\3\2"+
		"\2\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137"+
		"F\3\2\2\2\u0138\u0139\7-\2\2\u0139H\3\2\2\2\u013a\u013b\7/\2\2\u013bJ"+
		"\3\2\2\2\u013c\u013d\7,\2\2\u013dL\3\2\2\2\u013e\u013f\7,\2\2\u013f\u0140"+
		"\7,\2\2\u0140N\3\2\2\2\u0141\u0142\7\61\2\2\u0142P\3\2\2\2\u0143\u0144"+
		"\7\61\2\2\u0144\u0145\7\61\2\2\u0145R\3\2\2\2\u0146\u0147\7\'\2\2\u0147"+
		"T\3\2\2\2\u0148\u0149\7-\2\2\u0149\u014a\7?\2\2\u014aV\3\2\2\2\u014b\u014c"+
		"\7/\2\2\u014c\u014d\7?\2\2\u014dX\3\2\2\2\u014e\u014f\7,\2\2\u014f\u0150"+
		"\7?\2\2\u0150Z\3\2\2\2\u0151\u0152\7\61\2\2\u0152\u0153\7?\2\2\u0153\\"+
		"\3\2\2\2\u0154\u0155\7\'\2\2\u0155\u0156\7?\2\2\u0156^\3\2\2\2\u0157\u0158"+
		"\7?\2\2\u0158\u0159\7?\2\2\u0159`\3\2\2\2\u015a\u015b\7?\2\2\u015b\u015c"+
		"\7?\2\2\u015c\u015d\7?\2\2\u015db\3\2\2\2\u015e\u015f\7#\2\2\u015f\u0160"+
		"\7?\2\2\u0160d\3\2\2\2\u0161\u0162\7#\2\2\u0162\u0163\7?\2\2\u0163\u0164"+
		"\7?\2\2\u0164f\3\2\2\2\u0165\u0166\7>\2\2\u0166h\3\2\2\2\u0167\u0168\7"+
		"@\2\2\u0168j\3\2\2\2\u0169\u016a\7>\2\2\u016a\u016b\7?\2\2\u016bl\3\2"+
		"\2\2\u016c\u016d\7@\2\2\u016d\u016e\7?\2\2\u016en\3\2\2\2\23\2\u00d5\u00de"+
		"\u00e1\u00e6\u00e9\u00ee\u00f4\u00ff\u0105\u010e\u0114\u0119\u011d\u011f"+
		"\u0129\u0136\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}