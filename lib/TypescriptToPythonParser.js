// Generated from grammar/TypescriptToPython.g4 by ANTLR 4.12.0
// jshint ignore: start
import antlr4 from 'antlr4';
import TypescriptToPythonListener from './TypescriptToPythonListener.js';
import TypescriptToPythonVisitor from './TypescriptToPythonVisitor.js';

const serializedATN = [4,1,33,324,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,
4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,
2,13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,
20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,2,27,
7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,2,33,7,33,2,34,7,
34,1,0,3,0,72,8,0,1,0,1,0,1,1,1,1,4,1,78,8,1,11,1,12,1,79,1,2,1,2,1,2,3,
2,85,8,2,1,3,1,3,1,3,1,3,3,3,91,8,3,1,3,1,3,1,4,1,4,1,4,5,4,98,8,4,10,4,
12,4,101,9,4,1,5,1,5,5,5,105,8,5,10,5,12,5,108,9,5,1,5,1,5,1,6,1,6,3,6,114,
8,6,1,6,3,6,117,8,6,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,3,7,128,8,7,1,8,
1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,9,1,9,3,9,140,8,9,1,9,1,9,5,9,144,8,9,10,9,
12,9,147,9,9,1,9,4,9,150,8,9,11,9,12,9,151,1,10,1,10,1,10,3,10,157,8,10,
1,10,1,10,1,11,1,11,1,12,1,12,1,12,1,12,3,12,167,8,12,1,13,1,13,1,13,3,13,
172,8,13,1,14,1,14,1,14,1,14,1,15,1,15,1,15,1,15,1,16,1,16,1,17,1,17,1,17,
1,18,1,18,1,18,1,19,1,19,1,19,1,19,1,20,1,20,1,21,1,21,1,21,1,21,1,21,3,
21,201,8,21,1,21,1,21,1,22,1,22,1,22,1,22,1,22,1,23,1,23,1,23,5,23,213,8,
23,10,23,12,23,216,9,23,1,24,1,24,1,25,1,25,1,26,1,26,1,27,1,27,1,28,1,28,
1,28,1,29,1,29,1,29,1,29,3,29,233,8,29,1,29,1,29,1,30,3,30,238,8,30,1,30,
1,30,1,30,1,30,1,30,3,30,245,8,30,1,30,1,30,1,30,1,30,3,30,251,8,30,3,30,
253,8,30,1,30,3,30,256,8,30,1,30,1,30,1,30,3,30,261,8,30,1,30,1,30,1,30,
3,30,266,8,30,1,30,1,30,5,30,270,8,30,10,30,12,30,273,9,30,1,30,3,30,276,
8,30,1,30,3,30,279,8,30,5,30,281,8,30,10,30,12,30,284,9,30,1,31,1,31,1,31,
1,31,1,31,1,31,1,31,1,31,3,31,294,8,31,1,31,1,31,5,31,298,8,31,10,31,12,
31,301,9,31,1,31,3,31,304,8,31,1,32,1,32,1,32,1,32,1,32,1,33,1,33,1,33,1,
34,3,34,315,8,34,1,34,1,34,5,34,319,8,34,10,34,12,34,322,9,34,1,34,0,0,35,
0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,
52,54,56,58,60,62,64,66,68,0,3,1,0,24,28,1,0,11,12,1,0,21,22,346,0,71,1,
0,0,0,2,77,1,0,0,0,4,81,1,0,0,0,6,86,1,0,0,0,8,94,1,0,0,0,10,102,1,0,0,0,
12,111,1,0,0,0,14,127,1,0,0,0,16,129,1,0,0,0,18,149,1,0,0,0,20,153,1,0,0,
0,22,160,1,0,0,0,24,162,1,0,0,0,26,168,1,0,0,0,28,173,1,0,0,0,30,177,1,0,
0,0,32,181,1,0,0,0,34,183,1,0,0,0,36,186,1,0,0,0,38,189,1,0,0,0,40,193,1,
0,0,0,42,195,1,0,0,0,44,204,1,0,0,0,46,209,1,0,0,0,48,217,1,0,0,0,50,219,
1,0,0,0,52,221,1,0,0,0,54,223,1,0,0,0,56,225,1,0,0,0,58,228,1,0,0,0,60,282,
1,0,0,0,62,303,1,0,0,0,64,305,1,0,0,0,66,310,1,0,0,0,68,314,1,0,0,0,70,72,
3,2,1,0,71,70,1,0,0,0,71,72,1,0,0,0,72,73,1,0,0,0,73,74,5,0,0,1,74,1,1,0,
0,0,75,78,3,4,2,0,76,78,3,12,6,0,77,75,1,0,0,0,77,76,1,0,0,0,78,79,1,0,0,
0,79,77,1,0,0,0,79,80,1,0,0,0,80,3,1,0,0,0,81,82,3,6,3,0,82,84,3,10,5,0,
83,85,5,32,0,0,84,83,1,0,0,0,84,85,1,0,0,0,85,5,1,0,0,0,86,87,5,1,0,0,87,
88,3,50,25,0,88,90,5,2,0,0,89,91,3,8,4,0,90,89,1,0,0,0,90,91,1,0,0,0,91,
92,1,0,0,0,92,93,5,3,0,0,93,7,1,0,0,0,94,99,5,28,0,0,95,96,5,4,0,0,96,98,
5,28,0,0,97,95,1,0,0,0,98,101,1,0,0,0,99,97,1,0,0,0,99,100,1,0,0,0,100,9,
1,0,0,0,101,99,1,0,0,0,102,106,5,5,0,0,103,105,3,12,6,0,104,103,1,0,0,0,
105,108,1,0,0,0,106,104,1,0,0,0,106,107,1,0,0,0,107,109,1,0,0,0,108,106,
1,0,0,0,109,110,5,6,0,0,110,11,1,0,0,0,111,113,3,14,7,0,112,114,5,32,0,0,
113,112,1,0,0,0,113,114,1,0,0,0,114,116,1,0,0,0,115,117,3,48,24,0,116,115,
1,0,0,0,116,117,1,0,0,0,117,13,1,0,0,0,118,128,3,24,12,0,119,128,3,56,28,
0,120,128,3,26,13,0,121,128,3,48,24,0,122,128,3,20,10,0,123,128,3,42,21,
0,124,128,3,38,19,0,125,128,3,16,8,0,126,128,3,44,22,0,127,118,1,0,0,0,127,
119,1,0,0,0,127,120,1,0,0,0,127,121,1,0,0,0,127,122,1,0,0,0,127,123,1,0,
0,0,127,124,1,0,0,0,127,125,1,0,0,0,127,126,1,0,0,0,128,15,1,0,0,0,129,130,
5,7,0,0,130,131,3,18,9,0,131,17,1,0,0,0,132,150,5,24,0,0,133,150,5,26,0,
0,134,150,5,27,0,0,135,150,5,25,0,0,136,150,5,28,0,0,137,139,5,8,0,0,138,
140,7,0,0,0,139,138,1,0,0,0,139,140,1,0,0,0,140,145,1,0,0,0,141,142,5,4,
0,0,142,144,7,0,0,0,143,141,1,0,0,0,144,147,1,0,0,0,145,143,1,0,0,0,145,
146,1,0,0,0,146,148,1,0,0,0,147,145,1,0,0,0,148,150,5,9,0,0,149,132,1,0,
0,0,149,133,1,0,0,0,149,134,1,0,0,0,149,135,1,0,0,0,149,136,1,0,0,0,149,
137,1,0,0,0,150,151,1,0,0,0,151,149,1,0,0,0,151,152,1,0,0,0,152,19,1,0,0,
0,153,154,3,22,11,0,154,156,5,2,0,0,155,157,3,46,23,0,156,155,1,0,0,0,156,
157,1,0,0,0,157,158,1,0,0,0,158,159,5,3,0,0,159,21,1,0,0,0,160,161,5,14,
0,0,161,23,1,0,0,0,162,163,3,52,26,0,163,166,3,54,27,0,164,165,5,21,0,0,
165,167,3,62,31,0,166,164,1,0,0,0,166,167,1,0,0,0,167,25,1,0,0,0,168,169,
3,28,14,0,169,171,3,10,5,0,170,172,3,36,18,0,171,170,1,0,0,0,171,172,1,0,
0,0,172,27,1,0,0,0,173,174,3,30,15,0,174,175,3,32,16,0,175,176,3,34,17,0,
176,29,1,0,0,0,177,178,5,19,0,0,178,179,5,2,0,0,179,180,7,0,0,0,180,31,1,
0,0,0,181,182,5,33,0,0,182,33,1,0,0,0,183,184,7,0,0,0,184,185,5,3,0,0,185,
35,1,0,0,0,186,187,5,20,0,0,187,188,3,10,5,0,188,37,1,0,0,0,189,190,3,54,
27,0,190,191,5,10,0,0,191,192,3,40,20,0,192,39,1,0,0,0,193,194,5,28,0,0,
194,41,1,0,0,0,195,196,3,54,27,0,196,197,5,10,0,0,197,198,3,50,25,0,198,
200,5,2,0,0,199,201,3,46,23,0,200,199,1,0,0,0,200,201,1,0,0,0,201,202,1,
0,0,0,202,203,5,3,0,0,203,43,1,0,0,0,204,205,3,50,25,0,205,206,5,2,0,0,206,
207,3,46,23,0,207,208,5,3,0,0,208,45,1,0,0,0,209,214,7,0,0,0,210,211,5,4,
0,0,211,213,7,0,0,0,212,210,1,0,0,0,213,216,1,0,0,0,214,212,1,0,0,0,214,
215,1,0,0,0,215,47,1,0,0,0,216,214,1,0,0,0,217,218,5,31,0,0,218,49,1,0,0,
0,219,220,5,28,0,0,220,51,1,0,0,0,221,222,7,1,0,0,222,53,1,0,0,0,223,224,
5,28,0,0,224,55,1,0,0,0,225,226,3,58,29,0,226,227,3,60,30,0,227,57,1,0,0,
0,228,232,5,28,0,0,229,230,5,8,0,0,230,231,5,24,0,0,231,233,5,9,0,0,232,
229,1,0,0,0,232,233,1,0,0,0,233,234,1,0,0,0,234,235,7,2,0,0,235,59,1,0,0,
0,236,238,5,2,0,0,237,236,1,0,0,0,237,238,1,0,0,0,238,252,1,0,0,0,239,253,
5,23,0,0,240,244,5,28,0,0,241,242,5,8,0,0,242,243,5,24,0,0,243,245,5,9,0,
0,244,241,1,0,0,0,244,245,1,0,0,0,245,251,1,0,0,0,246,251,5,24,0,0,247,251,
5,25,0,0,248,251,5,26,0,0,249,251,5,27,0,0,250,240,1,0,0,0,250,246,1,0,0,
0,250,247,1,0,0,0,250,248,1,0,0,0,250,249,1,0,0,0,251,253,1,0,0,0,252,239,
1,0,0,0,252,250,1,0,0,0,253,255,1,0,0,0,254,256,5,3,0,0,255,254,1,0,0,0,
255,256,1,0,0,0,256,281,1,0,0,0,257,281,5,2,0,0,258,281,5,3,0,0,259,261,
5,2,0,0,260,259,1,0,0,0,260,261,1,0,0,0,261,275,1,0,0,0,262,276,5,23,0,0,
263,265,5,8,0,0,264,266,7,0,0,0,265,264,1,0,0,0,265,266,1,0,0,0,266,271,
1,0,0,0,267,268,5,4,0,0,268,270,7,0,0,0,269,267,1,0,0,0,270,273,1,0,0,0,
271,269,1,0,0,0,271,272,1,0,0,0,272,274,1,0,0,0,273,271,1,0,0,0,274,276,
5,9,0,0,275,262,1,0,0,0,275,263,1,0,0,0,276,278,1,0,0,0,277,279,5,3,0,0,
278,277,1,0,0,0,278,279,1,0,0,0,279,281,1,0,0,0,280,237,1,0,0,0,280,257,
1,0,0,0,280,258,1,0,0,0,280,260,1,0,0,0,281,284,1,0,0,0,282,280,1,0,0,0,
282,283,1,0,0,0,283,61,1,0,0,0,284,282,1,0,0,0,285,304,5,26,0,0,286,304,
5,24,0,0,287,304,5,25,0,0,288,304,5,27,0,0,289,304,5,28,0,0,290,304,3,64,
32,0,291,293,5,8,0,0,292,294,7,0,0,0,293,292,1,0,0,0,293,294,1,0,0,0,294,
299,1,0,0,0,295,296,5,4,0,0,296,298,7,0,0,0,297,295,1,0,0,0,298,301,1,0,
0,0,299,297,1,0,0,0,299,300,1,0,0,0,300,302,1,0,0,0,301,299,1,0,0,0,302,
304,5,9,0,0,303,285,1,0,0,0,303,286,1,0,0,0,303,287,1,0,0,0,303,288,1,0,
0,0,303,289,1,0,0,0,303,290,1,0,0,0,303,291,1,0,0,0,304,63,1,0,0,0,305,306,
3,66,33,0,306,307,5,2,0,0,307,308,3,68,34,0,308,309,5,3,0,0,309,65,1,0,0,
0,310,311,5,13,0,0,311,312,5,28,0,0,312,67,1,0,0,0,313,315,7,0,0,0,314,313,
1,0,0,0,314,315,1,0,0,0,315,320,1,0,0,0,316,317,5,4,0,0,317,319,7,0,0,0,
318,316,1,0,0,0,319,322,1,0,0,0,320,318,1,0,0,0,320,321,1,0,0,0,321,69,1,
0,0,0,322,320,1,0,0,0,37,71,77,79,84,90,99,106,113,116,127,139,145,149,151,
156,166,171,200,214,232,237,244,250,252,255,260,265,271,275,278,280,282,
293,299,303,314,320];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class TypescriptToPythonParser extends antlr4.Parser {

    static grammarFileName = "TypescriptToPython.g4";
    static literalNames = [ null, "'function'", "'('", "')'", "','", "'{'", 
                            "'}'", "'return'", "'['", "']'", "'.'", "'const'", 
                            "'let'", "'new'", "'console.log'", "'break'", 
                            "'continue'", "'while'", "'for'", "'if'", "'else'", 
                            "'='", null, null, null, null, null, null, null, 
                            null, null, null, "';'" ];
    static symbolicNames = [ null, null, null, null, null, null, null, null, 
                             null, null, null, null, null, null, "CONSOLELOG", 
                             "BREAK", "CONTINUE", "WHILE", "FOR", "IF", 
                             "ELSE", "EQ", "EQOPS", "MATHOPERATION", "INT", 
                             "FLOAT", "BOOLEAN", "STRING", "WORD", "WHITESPACE", 
                             "NEWLINE", "COMMENT", "EOL", "COMPAREOPERATION" ];
    static ruleNames = [ "program", "declarations", "declaration", "header", 
                         "declarationArgs", "body", "statement", "deepStatement", 
                         "returnFunctionValue", "resultValue", "protectedMethod", 
                         "consoleLog", "variableDeclation", "conditionIf", 
                         "conditionBar", "leftBar", "conditionBarRule", 
                         "rightBar", "elseCondition", "objectProperty", 
                         "propertyTitle", "objectMethodExec", "methodExec", 
                         "methodArgs", "comments", "methodName", "type", 
                         "variable", "operationsWithVariable", "leftOperation", 
                         "rightOperation", "valueOfVariable", "structure", 
                         "structureDeclaration", "structureArguments" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = TypescriptToPythonParser.ruleNames;
        this.literalNames = TypescriptToPythonParser.literalNames;
        this.symbolicNames = TypescriptToPythonParser.symbolicNames;
    }



	program() {
	    let localctx = new ProgramContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, TypescriptToPythonParser.RULE_program);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 71;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) === 0 && ((1 << _la) & 2416466050) !== 0)) {
	            this.state = 70;
	            this.declarations();
	        }

	        this.state = 73;
	        this.match(TypescriptToPythonParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	declarations() {
	    let localctx = new DeclarationsContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, TypescriptToPythonParser.RULE_declarations);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 77; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 77;
	            this._errHandler.sync(this);
	            switch(this._input.LA(1)) {
	            case 1:
	                this.state = 75;
	                this.declaration();
	                break;
	            case 7:
	            case 11:
	            case 12:
	            case 14:
	            case 19:
	            case 28:
	            case 31:
	                this.state = 76;
	                this.statement();
	                break;
	            default:
	                throw new antlr4.error.NoViableAltException(this);
	            }
	            this.state = 79; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) === 0 && ((1 << _la) & 2416466050) !== 0));
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	declaration() {
	    let localctx = new DeclarationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, TypescriptToPythonParser.RULE_declaration);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 81;
	        this.header();
	        this.state = 82;
	        this.body();
	        this.state = 84;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===32) {
	            this.state = 83;
	            this.match(TypescriptToPythonParser.EOL);
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	header() {
	    let localctx = new HeaderContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, TypescriptToPythonParser.RULE_header);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 86;
	        this.match(TypescriptToPythonParser.T__0);
	        this.state = 87;
	        this.methodName();
	        this.state = 88;
	        this.match(TypescriptToPythonParser.T__1);
	        this.state = 90;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===28) {
	            this.state = 89;
	            this.declarationArgs();
	        }

	        this.state = 92;
	        this.match(TypescriptToPythonParser.T__2);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	declarationArgs() {
	    let localctx = new DeclarationArgsContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, TypescriptToPythonParser.RULE_declarationArgs);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 94;
	        this.match(TypescriptToPythonParser.WORD);
	        this.state = 99;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===4) {
	            this.state = 95;
	            this.match(TypescriptToPythonParser.T__3);
	            this.state = 96;
	            this.match(TypescriptToPythonParser.WORD);
	            this.state = 101;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	body() {
	    let localctx = new BodyContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, TypescriptToPythonParser.RULE_body);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 102;
	        this.match(TypescriptToPythonParser.T__4);
	        this.state = 106;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 2416466048) !== 0)) {
	            this.state = 103;
	            this.statement();
	            this.state = 108;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 109;
	        this.match(TypescriptToPythonParser.T__5);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	statement() {
	    let localctx = new StatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, TypescriptToPythonParser.RULE_statement);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 111;
	        this.deepStatement();
	        this.state = 113;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===32) {
	            this.state = 112;
	            this.match(TypescriptToPythonParser.EOL);
	        }

	        this.state = 116;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,8,this._ctx);
	        if(la_===1) {
	            this.state = 115;
	            this.comments();

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	deepStatement() {
	    let localctx = new DeepStatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, TypescriptToPythonParser.RULE_deepStatement);
	    try {
	        this.state = 127;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,9,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 118;
	            this.variableDeclation();
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 119;
	            this.operationsWithVariable();
	            break;

	        case 3:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 120;
	            this.conditionIf();
	            break;

	        case 4:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 121;
	            this.comments();
	            break;

	        case 5:
	            this.enterOuterAlt(localctx, 5);
	            this.state = 122;
	            this.protectedMethod();
	            break;

	        case 6:
	            this.enterOuterAlt(localctx, 6);
	            this.state = 123;
	            this.objectMethodExec();
	            break;

	        case 7:
	            this.enterOuterAlt(localctx, 7);
	            this.state = 124;
	            this.objectProperty();
	            break;

	        case 8:
	            this.enterOuterAlt(localctx, 8);
	            this.state = 125;
	            this.returnFunctionValue();
	            break;

	        case 9:
	            this.enterOuterAlt(localctx, 9);
	            this.state = 126;
	            this.methodExec();
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	returnFunctionValue() {
	    let localctx = new ReturnFunctionValueContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, TypescriptToPythonParser.RULE_returnFunctionValue);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 129;
	        this.match(TypescriptToPythonParser.T__6);
	        this.state = 130;
	        this.resultValue();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	resultValue() {
	    let localctx = new ResultValueContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, TypescriptToPythonParser.RULE_resultValue);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 149; 
	        this._errHandler.sync(this);
	        var _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 149;
	        		this._errHandler.sync(this);
	        		switch(this._input.LA(1)) {
	        		case 24:
	        		    this.state = 132;
	        		    this.match(TypescriptToPythonParser.INT);
	        		    break;
	        		case 26:
	        		    this.state = 133;
	        		    this.match(TypescriptToPythonParser.BOOLEAN);
	        		    break;
	        		case 27:
	        		    this.state = 134;
	        		    this.match(TypescriptToPythonParser.STRING);
	        		    break;
	        		case 25:
	        		    this.state = 135;
	        		    this.match(TypescriptToPythonParser.FLOAT);
	        		    break;
	        		case 28:
	        		    this.state = 136;
	        		    this.match(TypescriptToPythonParser.WORD);
	        		    break;
	        		case 8:
	        		    this.state = 137;
	        		    this.match(TypescriptToPythonParser.T__7);
	        		    this.state = 139;
	        		    this._errHandler.sync(this);
	        		    _la = this._input.LA(1);
	        		    if((((_la) & ~0x1f) === 0 && ((1 << _la) & 520093696) !== 0)) {
	        		        this.state = 138;
	        		        _la = this._input.LA(1);
	        		        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 520093696) !== 0))) {
	        		        this._errHandler.recoverInline(this);
	        		        }
	        		        else {
	        		        	this._errHandler.reportMatch(this);
	        		            this.consume();
	        		        }
	        		    }

	        		    this.state = 145;
	        		    this._errHandler.sync(this);
	        		    _la = this._input.LA(1);
	        		    while(_la===4) {
	        		        this.state = 141;
	        		        this.match(TypescriptToPythonParser.T__3);
	        		        this.state = 142;
	        		        _la = this._input.LA(1);
	        		        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 520093696) !== 0))) {
	        		        this._errHandler.recoverInline(this);
	        		        }
	        		        else {
	        		        	this._errHandler.reportMatch(this);
	        		            this.consume();
	        		        }
	        		        this.state = 147;
	        		        this._errHandler.sync(this);
	        		        _la = this._input.LA(1);
	        		    }
	        		    this.state = 148;
	        		    this.match(TypescriptToPythonParser.T__8);
	        		    break;
	        		default:
	        		    throw new antlr4.error.NoViableAltException(this);
	        		}
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 151; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,13, this._ctx);
	        } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	protectedMethod() {
	    let localctx = new ProtectedMethodContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, TypescriptToPythonParser.RULE_protectedMethod);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 153;
	        this.consoleLog();
	        this.state = 154;
	        this.match(TypescriptToPythonParser.T__1);
	        this.state = 156;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) === 0 && ((1 << _la) & 520093696) !== 0)) {
	            this.state = 155;
	            this.methodArgs();
	        }

	        this.state = 158;
	        this.match(TypescriptToPythonParser.T__2);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	consoleLog() {
	    let localctx = new ConsoleLogContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 22, TypescriptToPythonParser.RULE_consoleLog);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 160;
	        this.match(TypescriptToPythonParser.CONSOLELOG);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	variableDeclation() {
	    let localctx = new VariableDeclationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 24, TypescriptToPythonParser.RULE_variableDeclation);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 162;
	        this.type();
	        this.state = 163;
	        this.variable();
	        this.state = 166;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===21) {
	            this.state = 164;
	            this.match(TypescriptToPythonParser.EQ);
	            this.state = 165;
	            this.valueOfVariable();
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	conditionIf() {
	    let localctx = new ConditionIfContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 26, TypescriptToPythonParser.RULE_conditionIf);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 168;
	        this.conditionBar();
	        this.state = 169;
	        this.body();
	        this.state = 171;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===20) {
	            this.state = 170;
	            this.elseCondition();
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	conditionBar() {
	    let localctx = new ConditionBarContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 28, TypescriptToPythonParser.RULE_conditionBar);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 173;
	        this.leftBar();
	        this.state = 174;
	        this.conditionBarRule();
	        this.state = 175;
	        this.rightBar();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	leftBar() {
	    let localctx = new LeftBarContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 30, TypescriptToPythonParser.RULE_leftBar);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 177;
	        this.match(TypescriptToPythonParser.IF);
	        this.state = 178;
	        this.match(TypescriptToPythonParser.T__1);
	        this.state = 179;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 520093696) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	conditionBarRule() {
	    let localctx = new ConditionBarRuleContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 32, TypescriptToPythonParser.RULE_conditionBarRule);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 181;
	        this.match(TypescriptToPythonParser.COMPAREOPERATION);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	rightBar() {
	    let localctx = new RightBarContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 34, TypescriptToPythonParser.RULE_rightBar);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 183;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 520093696) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	        this.state = 184;
	        this.match(TypescriptToPythonParser.T__2);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	elseCondition() {
	    let localctx = new ElseConditionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 36, TypescriptToPythonParser.RULE_elseCondition);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 186;
	        this.match(TypescriptToPythonParser.ELSE);
	        this.state = 187;
	        this.body();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	objectProperty() {
	    let localctx = new ObjectPropertyContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 38, TypescriptToPythonParser.RULE_objectProperty);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 189;
	        this.variable();
	        this.state = 190;
	        this.match(TypescriptToPythonParser.T__9);
	        this.state = 191;
	        this.propertyTitle();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	propertyTitle() {
	    let localctx = new PropertyTitleContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 40, TypescriptToPythonParser.RULE_propertyTitle);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 193;
	        this.match(TypescriptToPythonParser.WORD);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	objectMethodExec() {
	    let localctx = new ObjectMethodExecContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 42, TypescriptToPythonParser.RULE_objectMethodExec);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 195;
	        this.variable();
	        this.state = 196;
	        this.match(TypescriptToPythonParser.T__9);
	        this.state = 197;
	        this.methodName();
	        this.state = 198;
	        this.match(TypescriptToPythonParser.T__1);
	        this.state = 200;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) === 0 && ((1 << _la) & 520093696) !== 0)) {
	            this.state = 199;
	            this.methodArgs();
	        }

	        this.state = 202;
	        this.match(TypescriptToPythonParser.T__2);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	methodExec() {
	    let localctx = new MethodExecContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 44, TypescriptToPythonParser.RULE_methodExec);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 204;
	        this.methodName();
	        this.state = 205;
	        this.match(TypescriptToPythonParser.T__1);
	        this.state = 206;
	        this.methodArgs();
	        this.state = 207;
	        this.match(TypescriptToPythonParser.T__2);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	methodArgs() {
	    let localctx = new MethodArgsContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 46, TypescriptToPythonParser.RULE_methodArgs);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 209;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 520093696) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	        this.state = 214;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===4) {
	            this.state = 210;
	            this.match(TypescriptToPythonParser.T__3);
	            this.state = 211;
	            _la = this._input.LA(1);
	            if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 520093696) !== 0))) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            this.state = 216;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	comments() {
	    let localctx = new CommentsContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 48, TypescriptToPythonParser.RULE_comments);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 217;
	        this.match(TypescriptToPythonParser.COMMENT);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	methodName() {
	    let localctx = new MethodNameContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 50, TypescriptToPythonParser.RULE_methodName);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 219;
	        this.match(TypescriptToPythonParser.WORD);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	type() {
	    let localctx = new TypeContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 52, TypescriptToPythonParser.RULE_type);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 221;
	        _la = this._input.LA(1);
	        if(!(_la===11 || _la===12)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	variable() {
	    let localctx = new VariableContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 54, TypescriptToPythonParser.RULE_variable);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 223;
	        this.match(TypescriptToPythonParser.WORD);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	operationsWithVariable() {
	    let localctx = new OperationsWithVariableContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 56, TypescriptToPythonParser.RULE_operationsWithVariable);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 225;
	        this.leftOperation();
	        this.state = 226;
	        this.rightOperation();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	leftOperation() {
	    let localctx = new LeftOperationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 58, TypescriptToPythonParser.RULE_leftOperation);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 228;
	        this.match(TypescriptToPythonParser.WORD);
	        this.state = 232;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===8) {
	            this.state = 229;
	            this.match(TypescriptToPythonParser.T__7);
	            this.state = 230;
	            this.match(TypescriptToPythonParser.INT);
	            this.state = 231;
	            this.match(TypescriptToPythonParser.T__8);
	        }

	        this.state = 234;
	        _la = this._input.LA(1);
	        if(!(_la===21 || _la===22)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	rightOperation() {
	    let localctx = new RightOperationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 60, TypescriptToPythonParser.RULE_rightOperation);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 282;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,31,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                this.state = 280;
	                this._errHandler.sync(this);
	                var la_ = this._interp.adaptivePredict(this._input,30,this._ctx);
	                switch(la_) {
	                case 1:
	                    this.state = 237;
	                    this._errHandler.sync(this);
	                    _la = this._input.LA(1);
	                    if(_la===2) {
	                        this.state = 236;
	                        this.match(TypescriptToPythonParser.T__1);
	                    }

	                    this.state = 252;
	                    this._errHandler.sync(this);
	                    switch(this._input.LA(1)) {
	                    case 23:
	                        this.state = 239;
	                        this.match(TypescriptToPythonParser.MATHOPERATION);
	                        break;
	                    case 24:
	                    case 25:
	                    case 26:
	                    case 27:
	                    case 28:
	                        this.state = 250;
	                        this._errHandler.sync(this);
	                        switch(this._input.LA(1)) {
	                        case 28:
	                            this.state = 240;
	                            this.match(TypescriptToPythonParser.WORD);
	                            this.state = 244;
	                            this._errHandler.sync(this);
	                            var la_ = this._interp.adaptivePredict(this._input,21,this._ctx);
	                            if(la_===1) {
	                                this.state = 241;
	                                this.match(TypescriptToPythonParser.T__7);
	                                this.state = 242;
	                                this.match(TypescriptToPythonParser.INT);
	                                this.state = 243;
	                                this.match(TypescriptToPythonParser.T__8);

	                            }
	                            break;
	                        case 24:
	                            this.state = 246;
	                            this.match(TypescriptToPythonParser.INT);
	                            break;
	                        case 25:
	                            this.state = 247;
	                            this.match(TypescriptToPythonParser.FLOAT);
	                            break;
	                        case 26:
	                            this.state = 248;
	                            this.match(TypescriptToPythonParser.BOOLEAN);
	                            break;
	                        case 27:
	                            this.state = 249;
	                            this.match(TypescriptToPythonParser.STRING);
	                            break;
	                        default:
	                            throw new antlr4.error.NoViableAltException(this);
	                        }
	                        break;
	                    default:
	                        throw new antlr4.error.NoViableAltException(this);
	                    }
	                    this.state = 255;
	                    this._errHandler.sync(this);
	                    var la_ = this._interp.adaptivePredict(this._input,24,this._ctx);
	                    if(la_===1) {
	                        this.state = 254;
	                        this.match(TypescriptToPythonParser.T__2);

	                    }
	                    break;

	                case 2:
	                    this.state = 257;
	                    this.match(TypescriptToPythonParser.T__1);
	                    break;

	                case 3:
	                    this.state = 258;
	                    this.match(TypescriptToPythonParser.T__2);
	                    break;

	                case 4:
	                    this.state = 260;
	                    this._errHandler.sync(this);
	                    _la = this._input.LA(1);
	                    if(_la===2) {
	                        this.state = 259;
	                        this.match(TypescriptToPythonParser.T__1);
	                    }

	                    this.state = 275;
	                    this._errHandler.sync(this);
	                    switch(this._input.LA(1)) {
	                    case 23:
	                        this.state = 262;
	                        this.match(TypescriptToPythonParser.MATHOPERATION);
	                        break;
	                    case 8:
	                        this.state = 263;
	                        this.match(TypescriptToPythonParser.T__7);
	                        this.state = 265;
	                        this._errHandler.sync(this);
	                        _la = this._input.LA(1);
	                        if((((_la) & ~0x1f) === 0 && ((1 << _la) & 520093696) !== 0)) {
	                            this.state = 264;
	                            _la = this._input.LA(1);
	                            if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 520093696) !== 0))) {
	                            this._errHandler.recoverInline(this);
	                            }
	                            else {
	                            	this._errHandler.reportMatch(this);
	                                this.consume();
	                            }
	                        }

	                        this.state = 271;
	                        this._errHandler.sync(this);
	                        _la = this._input.LA(1);
	                        while(_la===4) {
	                            this.state = 267;
	                            this.match(TypescriptToPythonParser.T__3);
	                            this.state = 268;
	                            _la = this._input.LA(1);
	                            if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 520093696) !== 0))) {
	                            this._errHandler.recoverInline(this);
	                            }
	                            else {
	                            	this._errHandler.reportMatch(this);
	                                this.consume();
	                            }
	                            this.state = 273;
	                            this._errHandler.sync(this);
	                            _la = this._input.LA(1);
	                        }
	                        this.state = 274;
	                        this.match(TypescriptToPythonParser.T__8);
	                        break;
	                    default:
	                        throw new antlr4.error.NoViableAltException(this);
	                    }
	                    this.state = 278;
	                    this._errHandler.sync(this);
	                    var la_ = this._interp.adaptivePredict(this._input,29,this._ctx);
	                    if(la_===1) {
	                        this.state = 277;
	                        this.match(TypescriptToPythonParser.T__2);

	                    }
	                    break;

	                } 
	            }
	            this.state = 284;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,31,this._ctx);
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	valueOfVariable() {
	    let localctx = new ValueOfVariableContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 62, TypescriptToPythonParser.RULE_valueOfVariable);
	    var _la = 0;
	    try {
	        this.state = 303;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 26:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 285;
	            this.match(TypescriptToPythonParser.BOOLEAN);
	            break;
	        case 24:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 286;
	            this.match(TypescriptToPythonParser.INT);
	            break;
	        case 25:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 287;
	            this.match(TypescriptToPythonParser.FLOAT);
	            break;
	        case 27:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 288;
	            this.match(TypescriptToPythonParser.STRING);
	            break;
	        case 28:
	            this.enterOuterAlt(localctx, 5);
	            this.state = 289;
	            this.match(TypescriptToPythonParser.WORD);
	            break;
	        case 13:
	            this.enterOuterAlt(localctx, 6);
	            this.state = 290;
	            this.structure();
	            break;
	        case 8:
	            this.enterOuterAlt(localctx, 7);
	            this.state = 291;
	            this.match(TypescriptToPythonParser.T__7);
	            this.state = 293;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if((((_la) & ~0x1f) === 0 && ((1 << _la) & 520093696) !== 0)) {
	                this.state = 292;
	                _la = this._input.LA(1);
	                if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 520093696) !== 0))) {
	                this._errHandler.recoverInline(this);
	                }
	                else {
	                	this._errHandler.reportMatch(this);
	                    this.consume();
	                }
	            }

	            this.state = 299;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            while(_la===4) {
	                this.state = 295;
	                this.match(TypescriptToPythonParser.T__3);
	                this.state = 296;
	                _la = this._input.LA(1);
	                if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 520093696) !== 0))) {
	                this._errHandler.recoverInline(this);
	                }
	                else {
	                	this._errHandler.reportMatch(this);
	                    this.consume();
	                }
	                this.state = 301;
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            }
	            this.state = 302;
	            this.match(TypescriptToPythonParser.T__8);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	structure() {
	    let localctx = new StructureContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 64, TypescriptToPythonParser.RULE_structure);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 305;
	        this.structureDeclaration();
	        this.state = 306;
	        this.match(TypescriptToPythonParser.T__1);
	        this.state = 307;
	        this.structureArguments();
	        this.state = 308;
	        this.match(TypescriptToPythonParser.T__2);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	structureDeclaration() {
	    let localctx = new StructureDeclarationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 66, TypescriptToPythonParser.RULE_structureDeclaration);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 310;
	        this.match(TypescriptToPythonParser.T__12);
	        this.state = 311;
	        this.match(TypescriptToPythonParser.WORD);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	structureArguments() {
	    let localctx = new StructureArgumentsContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 68, TypescriptToPythonParser.RULE_structureArguments);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 314;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) === 0 && ((1 << _la) & 520093696) !== 0)) {
	            this.state = 313;
	            _la = this._input.LA(1);
	            if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 520093696) !== 0))) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	        }

	        this.state = 320;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===4) {
	            this.state = 316;
	            this.match(TypescriptToPythonParser.T__3);
	            this.state = 317;
	            _la = this._input.LA(1);
	            if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 520093696) !== 0))) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            this.state = 322;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

TypescriptToPythonParser.EOF = antlr4.Token.EOF;
TypescriptToPythonParser.T__0 = 1;
TypescriptToPythonParser.T__1 = 2;
TypescriptToPythonParser.T__2 = 3;
TypescriptToPythonParser.T__3 = 4;
TypescriptToPythonParser.T__4 = 5;
TypescriptToPythonParser.T__5 = 6;
TypescriptToPythonParser.T__6 = 7;
TypescriptToPythonParser.T__7 = 8;
TypescriptToPythonParser.T__8 = 9;
TypescriptToPythonParser.T__9 = 10;
TypescriptToPythonParser.T__10 = 11;
TypescriptToPythonParser.T__11 = 12;
TypescriptToPythonParser.T__12 = 13;
TypescriptToPythonParser.CONSOLELOG = 14;
TypescriptToPythonParser.BREAK = 15;
TypescriptToPythonParser.CONTINUE = 16;
TypescriptToPythonParser.WHILE = 17;
TypescriptToPythonParser.FOR = 18;
TypescriptToPythonParser.IF = 19;
TypescriptToPythonParser.ELSE = 20;
TypescriptToPythonParser.EQ = 21;
TypescriptToPythonParser.EQOPS = 22;
TypescriptToPythonParser.MATHOPERATION = 23;
TypescriptToPythonParser.INT = 24;
TypescriptToPythonParser.FLOAT = 25;
TypescriptToPythonParser.BOOLEAN = 26;
TypescriptToPythonParser.STRING = 27;
TypescriptToPythonParser.WORD = 28;
TypescriptToPythonParser.WHITESPACE = 29;
TypescriptToPythonParser.NEWLINE = 30;
TypescriptToPythonParser.COMMENT = 31;
TypescriptToPythonParser.EOL = 32;
TypescriptToPythonParser.COMPAREOPERATION = 33;

TypescriptToPythonParser.RULE_program = 0;
TypescriptToPythonParser.RULE_declarations = 1;
TypescriptToPythonParser.RULE_declaration = 2;
TypescriptToPythonParser.RULE_header = 3;
TypescriptToPythonParser.RULE_declarationArgs = 4;
TypescriptToPythonParser.RULE_body = 5;
TypescriptToPythonParser.RULE_statement = 6;
TypescriptToPythonParser.RULE_deepStatement = 7;
TypescriptToPythonParser.RULE_returnFunctionValue = 8;
TypescriptToPythonParser.RULE_resultValue = 9;
TypescriptToPythonParser.RULE_protectedMethod = 10;
TypescriptToPythonParser.RULE_consoleLog = 11;
TypescriptToPythonParser.RULE_variableDeclation = 12;
TypescriptToPythonParser.RULE_conditionIf = 13;
TypescriptToPythonParser.RULE_conditionBar = 14;
TypescriptToPythonParser.RULE_leftBar = 15;
TypescriptToPythonParser.RULE_conditionBarRule = 16;
TypescriptToPythonParser.RULE_rightBar = 17;
TypescriptToPythonParser.RULE_elseCondition = 18;
TypescriptToPythonParser.RULE_objectProperty = 19;
TypescriptToPythonParser.RULE_propertyTitle = 20;
TypescriptToPythonParser.RULE_objectMethodExec = 21;
TypescriptToPythonParser.RULE_methodExec = 22;
TypescriptToPythonParser.RULE_methodArgs = 23;
TypescriptToPythonParser.RULE_comments = 24;
TypescriptToPythonParser.RULE_methodName = 25;
TypescriptToPythonParser.RULE_type = 26;
TypescriptToPythonParser.RULE_variable = 27;
TypescriptToPythonParser.RULE_operationsWithVariable = 28;
TypescriptToPythonParser.RULE_leftOperation = 29;
TypescriptToPythonParser.RULE_rightOperation = 30;
TypescriptToPythonParser.RULE_valueOfVariable = 31;
TypescriptToPythonParser.RULE_structure = 32;
TypescriptToPythonParser.RULE_structureDeclaration = 33;
TypescriptToPythonParser.RULE_structureArguments = 34;

class ProgramContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_program;
    }

	EOF() {
	    return this.getToken(TypescriptToPythonParser.EOF, 0);
	};

	declarations() {
	    return this.getTypedRuleContext(DeclarationsContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterProgram(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitProgram(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitProgram(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class DeclarationsContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_declarations;
    }

	declaration = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(DeclarationContext);
	    } else {
	        return this.getTypedRuleContext(DeclarationContext,i);
	    }
	};

	statement = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StatementContext);
	    } else {
	        return this.getTypedRuleContext(StatementContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterDeclarations(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitDeclarations(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitDeclarations(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class DeclarationContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_declaration;
    }

	header() {
	    return this.getTypedRuleContext(HeaderContext,0);
	};

	body() {
	    return this.getTypedRuleContext(BodyContext,0);
	};

	EOL() {
	    return this.getToken(TypescriptToPythonParser.EOL, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterDeclaration(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitDeclaration(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitDeclaration(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class HeaderContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_header;
    }

	methodName() {
	    return this.getTypedRuleContext(MethodNameContext,0);
	};

	declarationArgs() {
	    return this.getTypedRuleContext(DeclarationArgsContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterHeader(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitHeader(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitHeader(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class DeclarationArgsContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_declarationArgs;
    }

	WORD = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.WORD);
	    } else {
	        return this.getToken(TypescriptToPythonParser.WORD, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterDeclarationArgs(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitDeclarationArgs(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitDeclarationArgs(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class BodyContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_body;
    }

	statement = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StatementContext);
	    } else {
	        return this.getTypedRuleContext(StatementContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterBody(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitBody(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitBody(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class StatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_statement;
    }

	deepStatement() {
	    return this.getTypedRuleContext(DeepStatementContext,0);
	};

	EOL() {
	    return this.getToken(TypescriptToPythonParser.EOL, 0);
	};

	comments() {
	    return this.getTypedRuleContext(CommentsContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitStatement(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitStatement(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class DeepStatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_deepStatement;
    }

	variableDeclation() {
	    return this.getTypedRuleContext(VariableDeclationContext,0);
	};

	operationsWithVariable() {
	    return this.getTypedRuleContext(OperationsWithVariableContext,0);
	};

	conditionIf() {
	    return this.getTypedRuleContext(ConditionIfContext,0);
	};

	comments() {
	    return this.getTypedRuleContext(CommentsContext,0);
	};

	protectedMethod() {
	    return this.getTypedRuleContext(ProtectedMethodContext,0);
	};

	objectMethodExec() {
	    return this.getTypedRuleContext(ObjectMethodExecContext,0);
	};

	objectProperty() {
	    return this.getTypedRuleContext(ObjectPropertyContext,0);
	};

	returnFunctionValue() {
	    return this.getTypedRuleContext(ReturnFunctionValueContext,0);
	};

	methodExec() {
	    return this.getTypedRuleContext(MethodExecContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterDeepStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitDeepStatement(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitDeepStatement(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ReturnFunctionValueContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_returnFunctionValue;
    }

	resultValue() {
	    return this.getTypedRuleContext(ResultValueContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterReturnFunctionValue(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitReturnFunctionValue(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitReturnFunctionValue(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ResultValueContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_resultValue;
    }

	INT = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.INT);
	    } else {
	        return this.getToken(TypescriptToPythonParser.INT, i);
	    }
	};


	BOOLEAN = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.BOOLEAN);
	    } else {
	        return this.getToken(TypescriptToPythonParser.BOOLEAN, i);
	    }
	};


	STRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.STRING);
	    } else {
	        return this.getToken(TypescriptToPythonParser.STRING, i);
	    }
	};


	FLOAT = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.FLOAT);
	    } else {
	        return this.getToken(TypescriptToPythonParser.FLOAT, i);
	    }
	};


	WORD = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.WORD);
	    } else {
	        return this.getToken(TypescriptToPythonParser.WORD, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterResultValue(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitResultValue(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitResultValue(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ProtectedMethodContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_protectedMethod;
    }

	consoleLog() {
	    return this.getTypedRuleContext(ConsoleLogContext,0);
	};

	methodArgs() {
	    return this.getTypedRuleContext(MethodArgsContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterProtectedMethod(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitProtectedMethod(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitProtectedMethod(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ConsoleLogContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_consoleLog;
    }

	CONSOLELOG() {
	    return this.getToken(TypescriptToPythonParser.CONSOLELOG, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterConsoleLog(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitConsoleLog(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitConsoleLog(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class VariableDeclationContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_variableDeclation;
    }

	type() {
	    return this.getTypedRuleContext(TypeContext,0);
	};

	variable() {
	    return this.getTypedRuleContext(VariableContext,0);
	};

	EQ() {
	    return this.getToken(TypescriptToPythonParser.EQ, 0);
	};

	valueOfVariable() {
	    return this.getTypedRuleContext(ValueOfVariableContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterVariableDeclation(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitVariableDeclation(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitVariableDeclation(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ConditionIfContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_conditionIf;
    }

	conditionBar() {
	    return this.getTypedRuleContext(ConditionBarContext,0);
	};

	body() {
	    return this.getTypedRuleContext(BodyContext,0);
	};

	elseCondition() {
	    return this.getTypedRuleContext(ElseConditionContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterConditionIf(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitConditionIf(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitConditionIf(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ConditionBarContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_conditionBar;
    }

	leftBar() {
	    return this.getTypedRuleContext(LeftBarContext,0);
	};

	conditionBarRule() {
	    return this.getTypedRuleContext(ConditionBarRuleContext,0);
	};

	rightBar() {
	    return this.getTypedRuleContext(RightBarContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterConditionBar(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitConditionBar(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitConditionBar(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class LeftBarContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_leftBar;
    }

	IF() {
	    return this.getToken(TypescriptToPythonParser.IF, 0);
	};

	BOOLEAN() {
	    return this.getToken(TypescriptToPythonParser.BOOLEAN, 0);
	};

	STRING() {
	    return this.getToken(TypescriptToPythonParser.STRING, 0);
	};

	WORD() {
	    return this.getToken(TypescriptToPythonParser.WORD, 0);
	};

	INT() {
	    return this.getToken(TypescriptToPythonParser.INT, 0);
	};

	FLOAT() {
	    return this.getToken(TypescriptToPythonParser.FLOAT, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterLeftBar(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitLeftBar(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitLeftBar(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ConditionBarRuleContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_conditionBarRule;
    }

	COMPAREOPERATION() {
	    return this.getToken(TypescriptToPythonParser.COMPAREOPERATION, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterConditionBarRule(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitConditionBarRule(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitConditionBarRule(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class RightBarContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_rightBar;
    }

	BOOLEAN() {
	    return this.getToken(TypescriptToPythonParser.BOOLEAN, 0);
	};

	STRING() {
	    return this.getToken(TypescriptToPythonParser.STRING, 0);
	};

	WORD() {
	    return this.getToken(TypescriptToPythonParser.WORD, 0);
	};

	INT() {
	    return this.getToken(TypescriptToPythonParser.INT, 0);
	};

	FLOAT() {
	    return this.getToken(TypescriptToPythonParser.FLOAT, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterRightBar(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitRightBar(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitRightBar(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ElseConditionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_elseCondition;
    }

	ELSE() {
	    return this.getToken(TypescriptToPythonParser.ELSE, 0);
	};

	body() {
	    return this.getTypedRuleContext(BodyContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterElseCondition(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitElseCondition(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitElseCondition(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ObjectPropertyContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_objectProperty;
    }

	variable() {
	    return this.getTypedRuleContext(VariableContext,0);
	};

	propertyTitle() {
	    return this.getTypedRuleContext(PropertyTitleContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterObjectProperty(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitObjectProperty(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitObjectProperty(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class PropertyTitleContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_propertyTitle;
    }

	WORD() {
	    return this.getToken(TypescriptToPythonParser.WORD, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterPropertyTitle(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitPropertyTitle(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitPropertyTitle(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ObjectMethodExecContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_objectMethodExec;
    }

	variable() {
	    return this.getTypedRuleContext(VariableContext,0);
	};

	methodName() {
	    return this.getTypedRuleContext(MethodNameContext,0);
	};

	methodArgs() {
	    return this.getTypedRuleContext(MethodArgsContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterObjectMethodExec(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitObjectMethodExec(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitObjectMethodExec(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class MethodExecContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_methodExec;
    }

	methodName() {
	    return this.getTypedRuleContext(MethodNameContext,0);
	};

	methodArgs() {
	    return this.getTypedRuleContext(MethodArgsContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterMethodExec(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitMethodExec(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitMethodExec(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class MethodArgsContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_methodArgs;
    }

	BOOLEAN = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.BOOLEAN);
	    } else {
	        return this.getToken(TypescriptToPythonParser.BOOLEAN, i);
	    }
	};


	STRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.STRING);
	    } else {
	        return this.getToken(TypescriptToPythonParser.STRING, i);
	    }
	};


	WORD = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.WORD);
	    } else {
	        return this.getToken(TypescriptToPythonParser.WORD, i);
	    }
	};


	INT = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.INT);
	    } else {
	        return this.getToken(TypescriptToPythonParser.INT, i);
	    }
	};


	FLOAT = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.FLOAT);
	    } else {
	        return this.getToken(TypescriptToPythonParser.FLOAT, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterMethodArgs(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitMethodArgs(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitMethodArgs(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CommentsContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_comments;
    }

	COMMENT() {
	    return this.getToken(TypescriptToPythonParser.COMMENT, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterComments(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitComments(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitComments(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class MethodNameContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_methodName;
    }

	WORD() {
	    return this.getToken(TypescriptToPythonParser.WORD, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterMethodName(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitMethodName(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitMethodName(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class TypeContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_type;
    }


	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterType(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitType(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitType(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class VariableContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_variable;
    }

	WORD() {
	    return this.getToken(TypescriptToPythonParser.WORD, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterVariable(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitVariable(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitVariable(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class OperationsWithVariableContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_operationsWithVariable;
    }

	leftOperation() {
	    return this.getTypedRuleContext(LeftOperationContext,0);
	};

	rightOperation() {
	    return this.getTypedRuleContext(RightOperationContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterOperationsWithVariable(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitOperationsWithVariable(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitOperationsWithVariable(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class LeftOperationContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_leftOperation;
    }

	WORD() {
	    return this.getToken(TypescriptToPythonParser.WORD, 0);
	};

	EQOPS() {
	    return this.getToken(TypescriptToPythonParser.EQOPS, 0);
	};

	EQ() {
	    return this.getToken(TypescriptToPythonParser.EQ, 0);
	};

	INT() {
	    return this.getToken(TypescriptToPythonParser.INT, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterLeftOperation(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitLeftOperation(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitLeftOperation(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class RightOperationContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_rightOperation;
    }

	MATHOPERATION = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.MATHOPERATION);
	    } else {
	        return this.getToken(TypescriptToPythonParser.MATHOPERATION, i);
	    }
	};


	WORD = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.WORD);
	    } else {
	        return this.getToken(TypescriptToPythonParser.WORD, i);
	    }
	};


	INT = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.INT);
	    } else {
	        return this.getToken(TypescriptToPythonParser.INT, i);
	    }
	};


	FLOAT = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.FLOAT);
	    } else {
	        return this.getToken(TypescriptToPythonParser.FLOAT, i);
	    }
	};


	BOOLEAN = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.BOOLEAN);
	    } else {
	        return this.getToken(TypescriptToPythonParser.BOOLEAN, i);
	    }
	};


	STRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.STRING);
	    } else {
	        return this.getToken(TypescriptToPythonParser.STRING, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterRightOperation(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitRightOperation(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitRightOperation(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ValueOfVariableContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_valueOfVariable;
    }

	BOOLEAN = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.BOOLEAN);
	    } else {
	        return this.getToken(TypescriptToPythonParser.BOOLEAN, i);
	    }
	};


	INT = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.INT);
	    } else {
	        return this.getToken(TypescriptToPythonParser.INT, i);
	    }
	};


	FLOAT = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.FLOAT);
	    } else {
	        return this.getToken(TypescriptToPythonParser.FLOAT, i);
	    }
	};


	STRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.STRING);
	    } else {
	        return this.getToken(TypescriptToPythonParser.STRING, i);
	    }
	};


	WORD = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.WORD);
	    } else {
	        return this.getToken(TypescriptToPythonParser.WORD, i);
	    }
	};


	structure() {
	    return this.getTypedRuleContext(StructureContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterValueOfVariable(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitValueOfVariable(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitValueOfVariable(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class StructureContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_structure;
    }

	structureDeclaration() {
	    return this.getTypedRuleContext(StructureDeclarationContext,0);
	};

	structureArguments() {
	    return this.getTypedRuleContext(StructureArgumentsContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterStructure(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitStructure(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitStructure(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class StructureDeclarationContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_structureDeclaration;
    }

	WORD() {
	    return this.getToken(TypescriptToPythonParser.WORD, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterStructureDeclaration(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitStructureDeclaration(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitStructureDeclaration(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class StructureArgumentsContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TypescriptToPythonParser.RULE_structureArguments;
    }

	STRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.STRING);
	    } else {
	        return this.getToken(TypescriptToPythonParser.STRING, i);
	    }
	};


	WORD = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.WORD);
	    } else {
	        return this.getToken(TypescriptToPythonParser.WORD, i);
	    }
	};


	FLOAT = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.FLOAT);
	    } else {
	        return this.getToken(TypescriptToPythonParser.FLOAT, i);
	    }
	};


	BOOLEAN = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.BOOLEAN);
	    } else {
	        return this.getToken(TypescriptToPythonParser.BOOLEAN, i);
	    }
	};


	INT = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TypescriptToPythonParser.INT);
	    } else {
	        return this.getToken(TypescriptToPythonParser.INT, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.enterStructureArguments(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TypescriptToPythonListener ) {
	        listener.exitStructureArguments(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof TypescriptToPythonVisitor ) {
	        return visitor.visitStructureArguments(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




TypescriptToPythonParser.ProgramContext = ProgramContext; 
TypescriptToPythonParser.DeclarationsContext = DeclarationsContext; 
TypescriptToPythonParser.DeclarationContext = DeclarationContext; 
TypescriptToPythonParser.HeaderContext = HeaderContext; 
TypescriptToPythonParser.DeclarationArgsContext = DeclarationArgsContext; 
TypescriptToPythonParser.BodyContext = BodyContext; 
TypescriptToPythonParser.StatementContext = StatementContext; 
TypescriptToPythonParser.DeepStatementContext = DeepStatementContext; 
TypescriptToPythonParser.ReturnFunctionValueContext = ReturnFunctionValueContext; 
TypescriptToPythonParser.ResultValueContext = ResultValueContext; 
TypescriptToPythonParser.ProtectedMethodContext = ProtectedMethodContext; 
TypescriptToPythonParser.ConsoleLogContext = ConsoleLogContext; 
TypescriptToPythonParser.VariableDeclationContext = VariableDeclationContext; 
TypescriptToPythonParser.ConditionIfContext = ConditionIfContext; 
TypescriptToPythonParser.ConditionBarContext = ConditionBarContext; 
TypescriptToPythonParser.LeftBarContext = LeftBarContext; 
TypescriptToPythonParser.ConditionBarRuleContext = ConditionBarRuleContext; 
TypescriptToPythonParser.RightBarContext = RightBarContext; 
TypescriptToPythonParser.ElseConditionContext = ElseConditionContext; 
TypescriptToPythonParser.ObjectPropertyContext = ObjectPropertyContext; 
TypescriptToPythonParser.PropertyTitleContext = PropertyTitleContext; 
TypescriptToPythonParser.ObjectMethodExecContext = ObjectMethodExecContext; 
TypescriptToPythonParser.MethodExecContext = MethodExecContext; 
TypescriptToPythonParser.MethodArgsContext = MethodArgsContext; 
TypescriptToPythonParser.CommentsContext = CommentsContext; 
TypescriptToPythonParser.MethodNameContext = MethodNameContext; 
TypescriptToPythonParser.TypeContext = TypeContext; 
TypescriptToPythonParser.VariableContext = VariableContext; 
TypescriptToPythonParser.OperationsWithVariableContext = OperationsWithVariableContext; 
TypescriptToPythonParser.LeftOperationContext = LeftOperationContext; 
TypescriptToPythonParser.RightOperationContext = RightOperationContext; 
TypescriptToPythonParser.ValueOfVariableContext = ValueOfVariableContext; 
TypescriptToPythonParser.StructureContext = StructureContext; 
TypescriptToPythonParser.StructureDeclarationContext = StructureDeclarationContext; 
TypescriptToPythonParser.StructureArgumentsContext = StructureArgumentsContext; 
