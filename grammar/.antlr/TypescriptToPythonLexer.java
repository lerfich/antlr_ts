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
public class TypescriptToPythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, CONSOLELOG=14, IF=15, ELSE=16, 
		COMPAREOPERATION=17, EQ=18, EQOPS=19, MATHOPERATION=20, INT=21, FLOAT=22, 
		BOOLEAN=23, STRING=24, WORD=25, WHITESPACE=26, NEWLINE=27, COMMENT=28, 
		EOL=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "CONSOLELOG", "IF", "ELSE", "COMPAREOPERATION", 
			"MULTEQ", "DIVEQ", "EQUALITY", "STREQUALITY", "INEQUALITY", "STRINEQUALITY", 
			"LESS", "PLUS", "MINUS", "MULT", "POWER", "DIV", "INTDIV", "PLUSEQ", 
			"MINUSEQ", "AND", "OR", "LARGER", "LESSOREQ", "MOREOREQ", "EQ", "EQOPS", 
			"MATHOPERATION", "INT", "FLOAT", "BOOLEAN", "STRING", "WORD", "WHITESPACE", 
			"NEWLINE", "COMMENT", "EOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'('", "')'", "','", "'{'", "'}'", "'return'", "'['", 
			"']'", "'.'", "'const'", "'let'", "'new'", "'console.log'", "'if'", "'else'", 
			null, "'='", null, null, null, null, null, null, null, null, null, null, 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "CONSOLELOG", "IF", "ELSE", "COMPAREOPERATION", "EQ", "EQOPS", 
			"MATHOPERATION", "INT", "FLOAT", "BOOLEAN", "STRING", "WORD", "WHITESPACE", 
			"NEWLINE", "COMMENT", "EOL"
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


	public TypescriptToPythonLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u0147\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b0\n\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3"+
		"%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3(\5(\u00f0\n(\3)\3)\3)\3)\3)\3)\5)\u00f8"+
		"\n)\3*\5*\u00fb\n*\3*\6*\u00fe\n*\r*\16*\u00ff\3+\5+\u0103\n+\3+\6+\u0106"+
		"\n+\r+\16+\u0107\3+\3+\6+\u010c\n+\r+\16+\u010d\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\5,\u0119\n,\3-\3-\7-\u011d\n-\f-\16-\u0120\13-\3-\3-\3.\3.\7.\u0126"+
		"\n.\f.\16.\u0129\13.\3/\6/\u012c\n/\r/\16/\u012d\3/\3/\3\60\5\60\u0133"+
		"\n\60\3\60\3\60\6\60\u0137\n\60\r\60\16\60\u0138\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\7\61\u0141\n\61\f\61\16\61\u0144\13\61\3\62\3\62\3\u011e\2\63"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C"+
		"\2E\2G\2I\2K\2M\24O\25Q\26S\27U\30W\31Y\32[\33]\34_\35a\36c\37\3\2\7\3"+
		"\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\4\2\f\f\16\17\2\u014e\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3"+
		"\2\2\2\5n\3\2\2\2\7p\3\2\2\2\tr\3\2\2\2\13t\3\2\2\2\rv\3\2\2\2\17x\3\2"+
		"\2\2\21\177\3\2\2\2\23\u0081\3\2\2\2\25\u0083\3\2\2\2\27\u0085\3\2\2\2"+
		"\31\u008b\3\2\2\2\33\u008f\3\2\2\2\35\u0093\3\2\2\2\37\u009f\3\2\2\2!"+
		"\u00a2\3\2\2\2#\u00af\3\2\2\2%\u00b1\3\2\2\2\'\u00b4\3\2\2\2)\u00b7\3"+
		"\2\2\2+\u00ba\3\2\2\2-\u00be\3\2\2\2/\u00c1\3\2\2\2\61\u00c5\3\2\2\2\63"+
		"\u00c7\3\2\2\2\65\u00c9\3\2\2\2\67\u00cb\3\2\2\29\u00cd\3\2\2\2;\u00d0"+
		"\3\2\2\2=\u00d2\3\2\2\2?\u00d5\3\2\2\2A\u00d8\3\2\2\2C\u00db\3\2\2\2E"+
		"\u00de\3\2\2\2G\u00e1\3\2\2\2I\u00e3\3\2\2\2K\u00e6\3\2\2\2M\u00e9\3\2"+
		"\2\2O\u00ef\3\2\2\2Q\u00f7\3\2\2\2S\u00fa\3\2\2\2U\u0102\3\2\2\2W\u0118"+
		"\3\2\2\2Y\u011a\3\2\2\2[\u0123\3\2\2\2]\u012b\3\2\2\2_\u0136\3\2\2\2a"+
		"\u013c\3\2\2\2c\u0145\3\2\2\2ef\7h\2\2fg\7w\2\2gh\7p\2\2hi\7e\2\2ij\7"+
		"v\2\2jk\7k\2\2kl\7q\2\2lm\7p\2\2m\4\3\2\2\2no\7*\2\2o\6\3\2\2\2pq\7+\2"+
		"\2q\b\3\2\2\2rs\7.\2\2s\n\3\2\2\2tu\7}\2\2u\f\3\2\2\2vw\7\177\2\2w\16"+
		"\3\2\2\2xy\7t\2\2yz\7g\2\2z{\7v\2\2{|\7w\2\2|}\7t\2\2}~\7p\2\2~\20\3\2"+
		"\2\2\177\u0080\7]\2\2\u0080\22\3\2\2\2\u0081\u0082\7_\2\2\u0082\24\3\2"+
		"\2\2\u0083\u0084\7\60\2\2\u0084\26\3\2\2\2\u0085\u0086\7e\2\2\u0086\u0087"+
		"\7q\2\2\u0087\u0088\7p\2\2\u0088\u0089\7u\2\2\u0089\u008a\7v\2\2\u008a"+
		"\30\3\2\2\2\u008b\u008c\7n\2\2\u008c\u008d\7g\2\2\u008d\u008e\7v\2\2\u008e"+
		"\32\3\2\2\2\u008f\u0090\7p\2\2\u0090\u0091\7g\2\2\u0091\u0092\7y\2\2\u0092"+
		"\34\3\2\2\2\u0093\u0094\7e\2\2\u0094\u0095\7q\2\2\u0095\u0096\7p\2\2\u0096"+
		"\u0097\7u\2\2\u0097\u0098\7q\2\2\u0098\u0099\7n\2\2\u0099\u009a\7g\2\2"+
		"\u009a\u009b\7\60\2\2\u009b\u009c\7n\2\2\u009c\u009d\7q\2\2\u009d\u009e"+
		"\7i\2\2\u009e\36\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7h\2\2\u00a1 "+
		"\3\2\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5"+
		"\u00a6\7g\2\2\u00a6\"\3\2\2\2\u00a7\u00b0\5)\25\2\u00a8\u00b0\5+\26\2"+
		"\u00a9\u00b0\5-\27\2\u00aa\u00b0\5/\30\2\u00ab\u00b0\5\61\31\2\u00ac\u00b0"+
		"\5G$\2\u00ad\u00b0\5I%\2\u00ae\u00b0\5K&\2\u00af\u00a7\3\2\2\2\u00af\u00a8"+
		"\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00aa\3\2\2\2\u00af\u00ab\3\2\2\2\u00af"+
		"\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0$\3\2\2\2"+
		"\u00b1\u00b2\7,\2\2\u00b2\u00b3\7?\2\2\u00b3&\3\2\2\2\u00b4\u00b5\7\61"+
		"\2\2\u00b5\u00b6\7?\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7?\2\2\u00b8\u00b9"+
		"\7?\2\2\u00b9*\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb\u00bc\7?\2\2\u00bc\u00bd"+
		"\7?\2\2\u00bd,\3\2\2\2\u00be\u00bf\7#\2\2\u00bf\u00c0\7?\2\2\u00c0.\3"+
		"\2\2\2\u00c1\u00c2\7#\2\2\u00c2\u00c3\7?\2\2\u00c3\u00c4\7?\2\2\u00c4"+
		"\60\3\2\2\2\u00c5\u00c6\7>\2\2\u00c6\62\3\2\2\2\u00c7\u00c8\7-\2\2\u00c8"+
		"\64\3\2\2\2\u00c9\u00ca\7/\2\2\u00ca\66\3\2\2\2\u00cb\u00cc\7,\2\2\u00cc"+
		"8\3\2\2\2\u00cd\u00ce\7,\2\2\u00ce\u00cf\7,\2\2\u00cf:\3\2\2\2\u00d0\u00d1"+
		"\7\61\2\2\u00d1<\3\2\2\2\u00d2\u00d3\7\61\2\2\u00d3\u00d4\7\61\2\2\u00d4"+
		">\3\2\2\2\u00d5\u00d6\7-\2\2\u00d6\u00d7\7?\2\2\u00d7@\3\2\2\2\u00d8\u00d9"+
		"\7/\2\2\u00d9\u00da\7?\2\2\u00daB\3\2\2\2\u00db\u00dc\7(\2\2\u00dc\u00dd"+
		"\7(\2\2\u00ddD\3\2\2\2\u00de\u00df\7~\2\2\u00df\u00e0\7~\2\2\u00e0F\3"+
		"\2\2\2\u00e1\u00e2\7@\2\2\u00e2H\3\2\2\2\u00e3\u00e4\7>\2\2\u00e4\u00e5"+
		"\7?\2\2\u00e5J\3\2\2\2\u00e6\u00e7\7@\2\2\u00e7\u00e8\7?\2\2\u00e8L\3"+
		"\2\2\2\u00e9\u00ea\7?\2\2\u00eaN\3\2\2\2\u00eb\u00f0\5? \2\u00ec\u00f0"+
		"\5A!\2\u00ed\u00f0\5%\23\2\u00ee\u00f0\5\'\24\2\u00ef\u00eb\3\2\2\2\u00ef"+
		"\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0P\3\2\2\2"+
		"\u00f1\u00f8\5\63\32\2\u00f2\u00f8\5\65\33\2\u00f3\u00f8\5\67\34\2\u00f4"+
		"\u00f8\59\35\2\u00f5\u00f8\5;\36\2\u00f6\u00f8\5=\37\2\u00f7\u00f1\3\2"+
		"\2\2\u00f7\u00f2\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8R\3\2\2\2\u00f9\u00fb\7/\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fe\t\2"+
		"\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100T\3\2\2\2\u0101\u0103\7/\2\2\u0102\u0101\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0106\t\2\2\2\u0105\u0104\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010b\7\60\2\2\u010a\u010c\t\2\2\2\u010b\u010a\3"+
		"\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"V\3\2\2\2\u010f\u0110\7v\2\2\u0110\u0111\7t\2\2\u0111\u0112\7w\2\2\u0112"+
		"\u0119\7g\2\2\u0113\u0114\7h\2\2\u0114\u0115\7c\2\2\u0115\u0116\7n\2\2"+
		"\u0116\u0117\7u\2\2\u0117\u0119\7g\2\2\u0118\u010f\3\2\2\2\u0118\u0113"+
		"\3\2\2\2\u0119X\3\2\2\2\u011a\u011e\7$\2\2\u011b\u011d\13\2\2\2\u011c"+
		"\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011f\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7$\2\2\u0122"+
		"Z\3\2\2\2\u0123\u0127\t\3\2\2\u0124\u0126\t\4\2\2\u0125\u0124\3\2\2\2"+
		"\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\\\3"+
		"\2\2\2\u0129\u0127\3\2\2\2\u012a\u012c\t\5\2\2\u012b\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0130\b/\2\2\u0130^\3\2\2\2\u0131\u0133\7\17\2\2\u0132\u0131"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0137\7\f\2\2\u0135"+
		"\u0137\7\17\2\2\u0136\u0132\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u0138\3"+
		"\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\b\60\2\2\u013b`\3\2\2\2\u013c\u013d\7\61\2\2\u013d\u013e\7\61\2"+
		"\2\u013e\u0142\3\2\2\2\u013f\u0141\n\6\2\2\u0140\u013f\3\2\2\2\u0141\u0144"+
		"\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143b\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u0146\7=\2\2\u0146d\3\2\2\2\23\2\u00af\u00ef\u00f7"+
		"\u00fa\u00ff\u0102\u0107\u010d\u0118\u011e\u0127\u012d\u0132\u0136\u0138"+
		"\u0142\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}