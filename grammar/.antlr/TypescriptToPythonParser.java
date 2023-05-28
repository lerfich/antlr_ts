// Generated from /Users/lerfich/Documents/antlr/grammar/TypescriptToPython.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypescriptToPythonParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_declaration = 2, RULE_header = 3, 
		RULE_declarationArgs = 4, RULE_body = 5, RULE_statement = 6, RULE_deepStatement = 7, 
		RULE_returnFunctionValue = 8, RULE_resultValue = 9, RULE_protectedMethod = 10, 
		RULE_consoleLog = 11, RULE_variableDeclation = 12, RULE_conditionIf = 13, 
		RULE_conditionBar = 14, RULE_leftBar = 15, RULE_conditionBarRule = 16, 
		RULE_rightBar = 17, RULE_elseCondition = 18, RULE_objectProperty = 19, 
		RULE_propertyTitle = 20, RULE_objectMethodExec = 21, RULE_methodExec = 22, 
		RULE_methodArgs = 23, RULE_comments = 24, RULE_methodName = 25, RULE_type = 26, 
		RULE_variable = 27, RULE_operationsWithVariable = 28, RULE_leftOperation = 29, 
		RULE_rightOperation = 30, RULE_valueOfVariable = 31, RULE_structure = 32, 
		RULE_structureDeclaration = 33, RULE_structureArguments = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarations", "declaration", "header", "declarationArgs", 
			"body", "statement", "deepStatement", "returnFunctionValue", "resultValue", 
			"protectedMethod", "consoleLog", "variableDeclation", "conditionIf", 
			"conditionBar", "leftBar", "conditionBarRule", "rightBar", "elseCondition", 
			"objectProperty", "propertyTitle", "objectMethodExec", "methodExec", 
			"methodArgs", "comments", "methodName", "type", "variable", "operationsWithVariable", 
			"leftOperation", "rightOperation", "valueOfVariable", "structure", "structureDeclaration", 
			"structureArguments"
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

	@Override
	public String getGrammarFileName() { return "TypescriptToPython.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TypescriptToPythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TypescriptToPythonParser.EOF, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << CONSOLELOG) | (1L << IF) | (1L << WORD) | (1L << COMMENT))) != 0)) {
				{
				setState(70);
				declarations();
				}
			}

			setState(73);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(77);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(75);
					declaration();
					}
					break;
				case T__6:
				case T__10:
				case T__11:
				case CONSOLELOG:
				case IF:
				case WORD:
				case COMMENT:
					{
					setState(76);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << CONSOLELOG) | (1L << IF) | (1L << WORD) | (1L << COMMENT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode EOL() { return getToken(TypescriptToPythonParser.EOL, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			header();
			setState(82);
			body();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(83);
				match(EOL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public DeclarationArgsContext declarationArgs() {
			return getRuleContext(DeclarationArgsContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__0);
			setState(87);
			methodName();
			setState(88);
			match(T__1);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(89);
				declarationArgs();
				}
			}

			setState(92);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationArgsContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(TypescriptToPythonParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(TypescriptToPythonParser.WORD, i);
		}
		public DeclarationArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationArgs; }
	}

	public final DeclarationArgsContext declarationArgs() throws RecognitionException {
		DeclarationArgsContext _localctx = new DeclarationArgsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(WORD);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(95);
				match(T__3);
				setState(96);
				match(WORD);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__4);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << CONSOLELOG) | (1L << IF) | (1L << WORD) | (1L << COMMENT))) != 0)) {
				{
				{
				setState(103);
				statement();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeepStatementContext deepStatement() {
			return getRuleContext(DeepStatementContext.class,0);
		}
		public TerminalNode EOL() { return getToken(TypescriptToPythonParser.EOL, 0); }
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			deepStatement();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(112);
				match(EOL);
				}
			}

			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(115);
				comments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeepStatementContext extends ParserRuleContext {
		public VariableDeclationContext variableDeclation() {
			return getRuleContext(VariableDeclationContext.class,0);
		}
		public OperationsWithVariableContext operationsWithVariable() {
			return getRuleContext(OperationsWithVariableContext.class,0);
		}
		public ConditionIfContext conditionIf() {
			return getRuleContext(ConditionIfContext.class,0);
		}
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public ProtectedMethodContext protectedMethod() {
			return getRuleContext(ProtectedMethodContext.class,0);
		}
		public ObjectMethodExecContext objectMethodExec() {
			return getRuleContext(ObjectMethodExecContext.class,0);
		}
		public ObjectPropertyContext objectProperty() {
			return getRuleContext(ObjectPropertyContext.class,0);
		}
		public ReturnFunctionValueContext returnFunctionValue() {
			return getRuleContext(ReturnFunctionValueContext.class,0);
		}
		public MethodExecContext methodExec() {
			return getRuleContext(MethodExecContext.class,0);
		}
		public DeepStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deepStatement; }
	}

	public final DeepStatementContext deepStatement() throws RecognitionException {
		DeepStatementContext _localctx = new DeepStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_deepStatement);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				variableDeclation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				operationsWithVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				conditionIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				comments();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				protectedMethod();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				objectMethodExec();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
				objectProperty();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(125);
				returnFunctionValue();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(126);
				methodExec();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnFunctionValueContext extends ParserRuleContext {
		public ResultValueContext resultValue() {
			return getRuleContext(ResultValueContext.class,0);
		}
		public ReturnFunctionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnFunctionValue; }
	}

	public final ReturnFunctionValueContext returnFunctionValue() throws RecognitionException {
		ReturnFunctionValueContext _localctx = new ReturnFunctionValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnFunctionValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__6);
			setState(130);
			resultValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultValueContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(TypescriptToPythonParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(TypescriptToPythonParser.INT, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(TypescriptToPythonParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(TypescriptToPythonParser.BOOLEAN, i);
		}
		public List<TerminalNode> STRING() { return getTokens(TypescriptToPythonParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TypescriptToPythonParser.STRING, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(TypescriptToPythonParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(TypescriptToPythonParser.FLOAT, i);
		}
		public List<TerminalNode> WORD() { return getTokens(TypescriptToPythonParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(TypescriptToPythonParser.WORD, i);
		}
		public ResultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultValue; }
	}

	public final ResultValueContext resultValue() throws RecognitionException {
		ResultValueContext _localctx = new ResultValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_resultValue);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(149);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
						{
						setState(132);
						match(INT);
						}
						break;
					case BOOLEAN:
						{
						setState(133);
						match(BOOLEAN);
						}
						break;
					case STRING:
						{
						setState(134);
						match(STRING);
						}
						break;
					case FLOAT:
						{
						setState(135);
						match(FLOAT);
						}
						break;
					case WORD:
						{
						setState(136);
						match(WORD);
						}
						break;
					case T__7:
						{
						setState(137);
						match(T__7);
						setState(139);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							setState(138);
							_la = _input.LA(1);
							if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << WORD))) != 0)) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						setState(145);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(141);
							match(T__3);
							setState(142);
							_la = _input.LA(1);
							if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << WORD))) != 0)) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(147);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(148);
						match(T__8);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(151); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtectedMethodContext extends ParserRuleContext {
		public ConsoleLogContext consoleLog() {
			return getRuleContext(ConsoleLogContext.class,0);
		}
		public MethodArgsContext methodArgs() {
			return getRuleContext(MethodArgsContext.class,0);
		}
		public ProtectedMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protectedMethod; }
	}

	public final ProtectedMethodContext protectedMethod() throws RecognitionException {
		ProtectedMethodContext _localctx = new ProtectedMethodContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_protectedMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			consoleLog();
			setState(154);
			match(T__1);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				setState(155);
				methodArgs();
				}
			}

			setState(158);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsoleLogContext extends ParserRuleContext {
		public TerminalNode CONSOLELOG() { return getToken(TypescriptToPythonParser.CONSOLELOG, 0); }
		public ConsoleLogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consoleLog; }
	}

	public final ConsoleLogContext consoleLog() throws RecognitionException {
		ConsoleLogContext _localctx = new ConsoleLogContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_consoleLog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(CONSOLELOG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQ() { return getToken(TypescriptToPythonParser.EQ, 0); }
		public ValueOfVariableContext valueOfVariable() {
			return getRuleContext(ValueOfVariableContext.class,0);
		}
		public VariableDeclationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclation; }
	}

	public final VariableDeclationContext variableDeclation() throws RecognitionException {
		VariableDeclationContext _localctx = new VariableDeclationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			type();
			setState(163);
			variable();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(164);
				match(EQ);
				setState(165);
				valueOfVariable();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionIfContext extends ParserRuleContext {
		public ConditionBarContext conditionBar() {
			return getRuleContext(ConditionBarContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseConditionContext elseCondition() {
			return getRuleContext(ElseConditionContext.class,0);
		}
		public ConditionIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionIf; }
	}

	public final ConditionIfContext conditionIf() throws RecognitionException {
		ConditionIfContext _localctx = new ConditionIfContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			conditionBar();
			setState(169);
			body();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(170);
				elseCondition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionBarContext extends ParserRuleContext {
		public LeftBarContext leftBar() {
			return getRuleContext(LeftBarContext.class,0);
		}
		public ConditionBarRuleContext conditionBarRule() {
			return getRuleContext(ConditionBarRuleContext.class,0);
		}
		public RightBarContext rightBar() {
			return getRuleContext(RightBarContext.class,0);
		}
		public ConditionBarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionBar; }
	}

	public final ConditionBarContext conditionBar() throws RecognitionException {
		ConditionBarContext _localctx = new ConditionBarContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conditionBar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			leftBar();
			setState(174);
			conditionBarRule();
			setState(175);
			rightBar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftBarContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TypescriptToPythonParser.IF, 0); }
		public TerminalNode BOOLEAN() { return getToken(TypescriptToPythonParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(TypescriptToPythonParser.STRING, 0); }
		public TerminalNode WORD() { return getToken(TypescriptToPythonParser.WORD, 0); }
		public TerminalNode INT() { return getToken(TypescriptToPythonParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(TypescriptToPythonParser.FLOAT, 0); }
		public LeftBarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftBar; }
	}

	public final LeftBarContext leftBar() throws RecognitionException {
		LeftBarContext _localctx = new LeftBarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_leftBar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(IF);
			setState(178);
			match(T__1);
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << WORD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionBarRuleContext extends ParserRuleContext {
		public TerminalNode COMPAREOPERATION() { return getToken(TypescriptToPythonParser.COMPAREOPERATION, 0); }
		public ConditionBarRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionBarRule; }
	}

	public final ConditionBarRuleContext conditionBarRule() throws RecognitionException {
		ConditionBarRuleContext _localctx = new ConditionBarRuleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditionBarRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(COMPAREOPERATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightBarContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(TypescriptToPythonParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(TypescriptToPythonParser.STRING, 0); }
		public TerminalNode WORD() { return getToken(TypescriptToPythonParser.WORD, 0); }
		public TerminalNode INT() { return getToken(TypescriptToPythonParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(TypescriptToPythonParser.FLOAT, 0); }
		public RightBarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightBar; }
	}

	public final RightBarContext rightBar() throws RecognitionException {
		RightBarContext _localctx = new RightBarContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rightBar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << WORD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(184);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseConditionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(TypescriptToPythonParser.ELSE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCondition; }
	}

	public final ElseConditionContext elseCondition() throws RecognitionException {
		ElseConditionContext _localctx = new ElseConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elseCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ELSE);
			setState(187);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectPropertyContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PropertyTitleContext propertyTitle() {
			return getRuleContext(PropertyTitleContext.class,0);
		}
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_objectProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			variable();
			setState(190);
			match(T__9);
			setState(191);
			propertyTitle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyTitleContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TypescriptToPythonParser.WORD, 0); }
		public PropertyTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyTitle; }
	}

	public final PropertyTitleContext propertyTitle() throws RecognitionException {
		PropertyTitleContext _localctx = new PropertyTitleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_propertyTitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectMethodExecContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public MethodArgsContext methodArgs() {
			return getRuleContext(MethodArgsContext.class,0);
		}
		public ObjectMethodExecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectMethodExec; }
	}

	public final ObjectMethodExecContext objectMethodExec() throws RecognitionException {
		ObjectMethodExecContext _localctx = new ObjectMethodExecContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_objectMethodExec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			variable();
			setState(196);
			match(T__9);
			setState(197);
			methodName();
			setState(198);
			match(T__1);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				setState(199);
				methodArgs();
				}
			}

			setState(202);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodExecContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public MethodArgsContext methodArgs() {
			return getRuleContext(MethodArgsContext.class,0);
		}
		public MethodExecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodExec; }
	}

	public final MethodExecContext methodExec() throws RecognitionException {
		MethodExecContext _localctx = new MethodExecContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodExec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			methodName();
			setState(205);
			match(T__1);
			setState(206);
			methodArgs();
			setState(207);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodArgsContext extends ParserRuleContext {
		public List<TerminalNode> BOOLEAN() { return getTokens(TypescriptToPythonParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(TypescriptToPythonParser.BOOLEAN, i);
		}
		public List<TerminalNode> STRING() { return getTokens(TypescriptToPythonParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TypescriptToPythonParser.STRING, i);
		}
		public List<TerminalNode> WORD() { return getTokens(TypescriptToPythonParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(TypescriptToPythonParser.WORD, i);
		}
		public List<TerminalNode> INT() { return getTokens(TypescriptToPythonParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(TypescriptToPythonParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(TypescriptToPythonParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(TypescriptToPythonParser.FLOAT, i);
		}
		public MethodArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgs; }
	}

	public final MethodArgsContext methodArgs() throws RecognitionException {
		MethodArgsContext _localctx = new MethodArgsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << WORD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(210);
				match(T__3);
				setState(211);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << WORD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentsContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(TypescriptToPythonParser.COMMENT, 0); }
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TypescriptToPythonParser.WORD, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TypescriptToPythonParser.WORD, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationsWithVariableContext extends ParserRuleContext {
		public LeftOperationContext leftOperation() {
			return getRuleContext(LeftOperationContext.class,0);
		}
		public RightOperationContext rightOperation() {
			return getRuleContext(RightOperationContext.class,0);
		}
		public OperationsWithVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationsWithVariable; }
	}

	public final OperationsWithVariableContext operationsWithVariable() throws RecognitionException {
		OperationsWithVariableContext _localctx = new OperationsWithVariableContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operationsWithVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			leftOperation();
			setState(226);
			rightOperation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftOperationContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TypescriptToPythonParser.WORD, 0); }
		public TerminalNode EQOPS() { return getToken(TypescriptToPythonParser.EQOPS, 0); }
		public TerminalNode EQ() { return getToken(TypescriptToPythonParser.EQ, 0); }
		public TerminalNode INT() { return getToken(TypescriptToPythonParser.INT, 0); }
		public LeftOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftOperation; }
	}

	public final LeftOperationContext leftOperation() throws RecognitionException {
		LeftOperationContext _localctx = new LeftOperationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_leftOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(WORD);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(229);
				match(T__7);
				setState(230);
				match(INT);
				setState(231);
				match(T__8);
				}
			}

			setState(234);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==EQOPS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightOperationContext extends ParserRuleContext {
		public List<TerminalNode> MATHOPERATION() { return getTokens(TypescriptToPythonParser.MATHOPERATION); }
		public TerminalNode MATHOPERATION(int i) {
			return getToken(TypescriptToPythonParser.MATHOPERATION, i);
		}
		public List<TerminalNode> WORD() { return getTokens(TypescriptToPythonParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(TypescriptToPythonParser.WORD, i);
		}
		public List<TerminalNode> INT() { return getTokens(TypescriptToPythonParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(TypescriptToPythonParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(TypescriptToPythonParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(TypescriptToPythonParser.FLOAT, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(TypescriptToPythonParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(TypescriptToPythonParser.BOOLEAN, i);
		}
		public List<TerminalNode> STRING() { return getTokens(TypescriptToPythonParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TypescriptToPythonParser.STRING, i);
		}
		public RightOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightOperation; }
	}

	public final RightOperationContext rightOperation() throws RecognitionException {
		RightOperationContext _localctx = new RightOperationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_rightOperation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(280);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						{
						setState(237);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__1) {
							{
							setState(236);
							match(T__1);
							}
						}

						setState(252);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MATHOPERATION:
							{
							setState(239);
							match(MATHOPERATION);
							}
							break;
						case INT:
						case FLOAT:
						case BOOLEAN:
						case STRING:
						case WORD:
							{
							setState(250);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case WORD:
								{
								setState(240);
								match(WORD);
								setState(244);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
								case 1:
									{
									setState(241);
									match(T__7);
									setState(242);
									match(INT);
									setState(243);
									match(T__8);
									}
									break;
								}
								}
								break;
							case INT:
								{
								setState(246);
								match(INT);
								}
								break;
							case FLOAT:
								{
								setState(247);
								match(FLOAT);
								}
								break;
							case BOOLEAN:
								{
								setState(248);
								match(BOOLEAN);
								}
								break;
							case STRING:
								{
								setState(249);
								match(STRING);
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(255);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
						case 1:
							{
							setState(254);
							match(T__2);
							}
							break;
						}
						}
						}
						break;
					case 2:
						{
						setState(257);
						match(T__1);
						}
						break;
					case 3:
						{
						setState(258);
						match(T__2);
						}
						break;
					case 4:
						{
						{
						setState(260);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__1) {
							{
							setState(259);
							match(T__1);
							}
						}

						setState(275);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MATHOPERATION:
							{
							setState(262);
							match(MATHOPERATION);
							}
							break;
						case T__7:
							{
							setState(263);
							match(T__7);
							setState(265);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								setState(264);
								_la = _input.LA(1);
								if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << WORD))) != 0)) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
							}

							setState(271);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__3) {
								{
								{
								setState(267);
								match(T__3);
								setState(268);
								_la = _input.LA(1);
								if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << WORD))) != 0)) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(273);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(274);
							match(T__8);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(278);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
						case 1:
							{
							setState(277);
							match(T__2);
							}
							break;
						}
						}
						}
						break;
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueOfVariableContext extends ParserRuleContext {
		public List<TerminalNode> BOOLEAN() { return getTokens(TypescriptToPythonParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(TypescriptToPythonParser.BOOLEAN, i);
		}
		public List<TerminalNode> INT() { return getTokens(TypescriptToPythonParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(TypescriptToPythonParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(TypescriptToPythonParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(TypescriptToPythonParser.FLOAT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(TypescriptToPythonParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TypescriptToPythonParser.STRING, i);
		}
		public List<TerminalNode> WORD() { return getTokens(TypescriptToPythonParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(TypescriptToPythonParser.WORD, i);
		}
		public StructureContext structure() {
			return getRuleContext(StructureContext.class,0);
		}
		public ValueOfVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueOfVariable; }
	}

	public final ValueOfVariableContext valueOfVariable() throws RecognitionException {
		ValueOfVariableContext _localctx = new ValueOfVariableContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_valueOfVariable);
		int _la;
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(BOOLEAN);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				match(STRING);
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 5);
				{
				setState(289);
				match(WORD);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(290);
				structure();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 7);
				{
				setState(291);
				match(T__7);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << WORD))) != 0)) {
					{
					setState(292);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << WORD))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(295);
					match(T__3);
					setState(296);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << WORD))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(302);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructureContext extends ParserRuleContext {
		public StructureDeclarationContext structureDeclaration() {
			return getRuleContext(StructureDeclarationContext.class,0);
		}
		public StructureArgumentsContext structureArguments() {
			return getRuleContext(StructureArgumentsContext.class,0);
		}
		public StructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure; }
	}

	public final StructureContext structure() throws RecognitionException {
		StructureContext _localctx = new StructureContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_structure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			structureDeclaration();
			setState(306);
			match(T__1);
			setState(307);
			structureArguments();
			setState(308);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructureDeclarationContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TypescriptToPythonParser.WORD, 0); }
		public StructureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureDeclaration; }
	}

	public final StructureDeclarationContext structureDeclaration() throws RecognitionException {
		StructureDeclarationContext _localctx = new StructureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_structureDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__12);
			setState(311);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructureArgumentsContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(TypescriptToPythonParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TypescriptToPythonParser.STRING, i);
		}
		public List<TerminalNode> WORD() { return getTokens(TypescriptToPythonParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(TypescriptToPythonParser.WORD, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(TypescriptToPythonParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(TypescriptToPythonParser.FLOAT, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(TypescriptToPythonParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(TypescriptToPythonParser.BOOLEAN, i);
		}
		public List<TerminalNode> INT() { return getTokens(TypescriptToPythonParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(TypescriptToPythonParser.INT, i);
		}
		public StructureArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureArguments; }
	}

	public final StructureArgumentsContext structureArguments() throws RecognitionException {
		StructureArgumentsContext _localctx = new StructureArgumentsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_structureArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				setState(313);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << WORD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(316);
				match(T__3);
				setState(317);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << WORD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0146\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\5\2J\n\2\3\2\3\2\3\3\3\3\6\3P\n\3\r\3\16\3"+
		"Q\3\4\3\4\3\4\5\4W\n\4\3\5\3\5\3\5\3\5\5\5]\n\5\3\5\3\5\3\6\3\6\3\6\7"+
		"\6d\n\6\f\6\16\6g\13\6\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\7\3\7\3\b\3\b"+
		"\5\bt\n\b\3\b\5\bw\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008e\n\13\3\13"+
		"\3\13\7\13\u0092\n\13\f\13\16\13\u0095\13\13\3\13\6\13\u0098\n\13\r\13"+
		"\16\13\u0099\3\f\3\f\3\f\5\f\u009f\n\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\5\16\u00a9\n\16\3\17\3\17\3\17\5\17\u00ae\n\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u00cb\n\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u00d7\n\31\f\31\16"+
		"\31\u00da\13\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\5\37\u00eb\n\37\3\37\3\37\3 \5 \u00f0\n \3 \3 \3"+
		" \3 \3 \5 \u00f7\n \3 \3 \3 \3 \5 \u00fd\n \5 \u00ff\n \3 \5 \u0102\n"+
		" \3 \3 \3 \5 \u0107\n \3 \3 \3 \5 \u010c\n \3 \3 \7 \u0110\n \f \16 \u0113"+
		"\13 \3 \5 \u0116\n \3 \5 \u0119\n \7 \u011b\n \f \16 \u011e\13 \3!\3!"+
		"\3!\3!\3!\3!\3!\3!\5!\u0128\n!\3!\3!\7!\u012c\n!\f!\16!\u012f\13!\3!\5"+
		"!\u0132\n!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\5$\u013d\n$\3$\3$\7$\u0141"+
		"\n$\f$\16$\u0144\13$\3$\2\2%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDF\2\5\3\2\27\33\3\2\r\16\3\2\24\25\2\u015c\2"+
		"I\3\2\2\2\4O\3\2\2\2\6S\3\2\2\2\bX\3\2\2\2\n`\3\2\2\2\fh\3\2\2\2\16q\3"+
		"\2\2\2\20\u0081\3\2\2\2\22\u0083\3\2\2\2\24\u0097\3\2\2\2\26\u009b\3\2"+
		"\2\2\30\u00a2\3\2\2\2\32\u00a4\3\2\2\2\34\u00aa\3\2\2\2\36\u00af\3\2\2"+
		"\2 \u00b3\3\2\2\2\"\u00b7\3\2\2\2$\u00b9\3\2\2\2&\u00bc\3\2\2\2(\u00bf"+
		"\3\2\2\2*\u00c3\3\2\2\2,\u00c5\3\2\2\2.\u00ce\3\2\2\2\60\u00d3\3\2\2\2"+
		"\62\u00db\3\2\2\2\64\u00dd\3\2\2\2\66\u00df\3\2\2\28\u00e1\3\2\2\2:\u00e3"+
		"\3\2\2\2<\u00e6\3\2\2\2>\u011c\3\2\2\2@\u0131\3\2\2\2B\u0133\3\2\2\2D"+
		"\u0138\3\2\2\2F\u013c\3\2\2\2HJ\5\4\3\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2"+
		"KL\7\2\2\3L\3\3\2\2\2MP\5\6\4\2NP\5\16\b\2OM\3\2\2\2ON\3\2\2\2PQ\3\2\2"+
		"\2QO\3\2\2\2QR\3\2\2\2R\5\3\2\2\2ST\5\b\5\2TV\5\f\7\2UW\7\37\2\2VU\3\2"+
		"\2\2VW\3\2\2\2W\7\3\2\2\2XY\7\3\2\2YZ\5\64\33\2Z\\\7\4\2\2[]\5\n\6\2\\"+
		"[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\5\2\2_\t\3\2\2\2`e\7\33\2\2ab\7\6\2"+
		"\2bd\7\33\2\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\13\3\2\2\2ge\3"+
		"\2\2\2hl\7\7\2\2ik\5\16\b\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo"+
		"\3\2\2\2nl\3\2\2\2op\7\b\2\2p\r\3\2\2\2qs\5\20\t\2rt\7\37\2\2sr\3\2\2"+
		"\2st\3\2\2\2tv\3\2\2\2uw\5\62\32\2vu\3\2\2\2vw\3\2\2\2w\17\3\2\2\2x\u0082"+
		"\5\32\16\2y\u0082\5:\36\2z\u0082\5\34\17\2{\u0082\5\62\32\2|\u0082\5\26"+
		"\f\2}\u0082\5,\27\2~\u0082\5(\25\2\177\u0082\5\22\n\2\u0080\u0082\5.\30"+
		"\2\u0081x\3\2\2\2\u0081y\3\2\2\2\u0081z\3\2\2\2\u0081{\3\2\2\2\u0081|"+
		"\3\2\2\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3"+
		"\2\2\2\u0082\21\3\2\2\2\u0083\u0084\7\t\2\2\u0084\u0085\5\24\13\2\u0085"+
		"\23\3\2\2\2\u0086\u0098\7\27\2\2\u0087\u0098\7\31\2\2\u0088\u0098\7\32"+
		"\2\2\u0089\u0098\7\30\2\2\u008a\u0098\7\33\2\2\u008b\u008d\7\n\2\2\u008c"+
		"\u008e\t\2\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0093\3\2"+
		"\2\2\u008f\u0090\7\6\2\2\u0090\u0092\t\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0096\u0098\7\13\2\2\u0097\u0086\3\2\2\2\u0097"+
		"\u0087\3\2\2\2\u0097\u0088\3\2\2\2\u0097\u0089\3\2\2\2\u0097\u008a\3\2"+
		"\2\2\u0097\u008b\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\25\3\2\2\2\u009b\u009c\5\30\r\2\u009c\u009e\7\4\2"+
		"\2\u009d\u009f\5\60\31\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\7\5\2\2\u00a1\27\3\2\2\2\u00a2\u00a3\7\20\2"+
		"\2\u00a3\31\3\2\2\2\u00a4\u00a5\5\66\34\2\u00a5\u00a8\58\35\2\u00a6\u00a7"+
		"\7\24\2\2\u00a7\u00a9\5@!\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\33\3\2\2\2\u00aa\u00ab\5\36\20\2\u00ab\u00ad\5\f\7\2\u00ac\u00ae\5&\24"+
		"\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\35\3\2\2\2\u00af\u00b0"+
		"\5 \21\2\u00b0\u00b1\5\"\22\2\u00b1\u00b2\5$\23\2\u00b2\37\3\2\2\2\u00b3"+
		"\u00b4\7\21\2\2\u00b4\u00b5\7\4\2\2\u00b5\u00b6\t\2\2\2\u00b6!\3\2\2\2"+
		"\u00b7\u00b8\7\23\2\2\u00b8#\3\2\2\2\u00b9\u00ba\t\2\2\2\u00ba\u00bb\7"+
		"\5\2\2\u00bb%\3\2\2\2\u00bc\u00bd\7\22\2\2\u00bd\u00be\5\f\7\2\u00be\'"+
		"\3\2\2\2\u00bf\u00c0\58\35\2\u00c0\u00c1\7\f\2\2\u00c1\u00c2\5*\26\2\u00c2"+
		")\3\2\2\2\u00c3\u00c4\7\33\2\2\u00c4+\3\2\2\2\u00c5\u00c6\58\35\2\u00c6"+
		"\u00c7\7\f\2\2\u00c7\u00c8\5\64\33\2\u00c8\u00ca\7\4\2\2\u00c9\u00cb\5"+
		"\60\31\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\7\5\2\2\u00cd-\3\2\2\2\u00ce\u00cf\5\64\33\2\u00cf\u00d0\7\4\2"+
		"\2\u00d0\u00d1\5\60\31\2\u00d1\u00d2\7\5\2\2\u00d2/\3\2\2\2\u00d3\u00d8"+
		"\t\2\2\2\u00d4\u00d5\7\6\2\2\u00d5\u00d7\t\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\61\3\2\2"+
		"\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\36\2\2\u00dc\63\3\2\2\2\u00dd\u00de"+
		"\7\33\2\2\u00de\65\3\2\2\2\u00df\u00e0\t\3\2\2\u00e0\67\3\2\2\2\u00e1"+
		"\u00e2\7\33\2\2\u00e29\3\2\2\2\u00e3\u00e4\5<\37\2\u00e4\u00e5\5> \2\u00e5"+
		";\3\2\2\2\u00e6\u00ea\7\33\2\2\u00e7\u00e8\7\n\2\2\u00e8\u00e9\7\27\2"+
		"\2\u00e9\u00eb\7\13\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\t\4\2\2\u00ed=\3\2\2\2\u00ee\u00f0\7\4\2\2"+
		"\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00fe\3\2\2\2\u00f1\u00ff"+
		"\7\26\2\2\u00f2\u00f6\7\33\2\2\u00f3\u00f4\7\n\2\2\u00f4\u00f5\7\27\2"+
		"\2\u00f5\u00f7\7\13\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00fd\3\2\2\2\u00f8\u00fd\7\27\2\2\u00f9\u00fd\7\30\2\2\u00fa\u00fd\7"+
		"\31\2\2\u00fb\u00fd\7\32\2\2\u00fc\u00f2\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fc"+
		"\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00ff\3\2"+
		"\2\2\u00fe\u00f1\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u0102\7\5\2\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u011b\3\2"+
		"\2\2\u0103\u011b\7\4\2\2\u0104\u011b\7\5\2\2\u0105\u0107\7\4\2\2\u0106"+
		"\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0115\3\2\2\2\u0108\u0116\7\26"+
		"\2\2\u0109\u010b\7\n\2\2\u010a\u010c\t\2\2\2\u010b\u010a\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u0111\3\2\2\2\u010d\u010e\7\6\2\2\u010e\u0110\t\2"+
		"\2\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0116\7\13"+
		"\2\2\u0115\u0108\3\2\2\2\u0115\u0109\3\2\2\2\u0116\u0118\3\2\2\2\u0117"+
		"\u0119\7\5\2\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2"+
		"\2\2\u011a\u00ef\3\2\2\2\u011a\u0103\3\2\2\2\u011a\u0104\3\2\2\2\u011a"+
		"\u0106\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d?\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0132\7\31\2\2\u0120\u0132"+
		"\7\27\2\2\u0121\u0132\7\30\2\2\u0122\u0132\7\32\2\2\u0123\u0132\7\33\2"+
		"\2\u0124\u0132\5B\"\2\u0125\u0127\7\n\2\2\u0126\u0128\t\2\2\2\u0127\u0126"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012d\3\2\2\2\u0129\u012a\7\6\2\2\u012a"+
		"\u012c\t\2\2\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0132\7\13\2\2\u0131\u011f\3\2\2\2\u0131\u0120\3\2\2\2\u0131\u0121\3"+
		"\2\2\2\u0131\u0122\3\2\2\2\u0131\u0123\3\2\2\2\u0131\u0124\3\2\2\2\u0131"+
		"\u0125\3\2\2\2\u0132A\3\2\2\2\u0133\u0134\5D#\2\u0134\u0135\7\4\2\2\u0135"+
		"\u0136\5F$\2\u0136\u0137\7\5\2\2\u0137C\3\2\2\2\u0138\u0139\7\17\2\2\u0139"+
		"\u013a\7\33\2\2\u013aE\3\2\2\2\u013b\u013d\t\2\2\2\u013c\u013b\3\2\2\2"+
		"\u013c\u013d\3\2\2\2\u013d\u0142\3\2\2\2\u013e\u013f\7\6\2\2\u013f\u0141"+
		"\t\2\2\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143G\3\2\2\2\u0144\u0142\3\2\2\2\'IOQV\\elsv\u0081\u008d"+
		"\u0093\u0097\u0099\u009e\u00a8\u00ad\u00ca\u00d8\u00ea\u00ef\u00f6\u00fc"+
		"\u00fe\u0101\u0106\u010b\u0111\u0115\u0118\u011a\u011c\u0127\u012d\u0131"+
		"\u013c\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}