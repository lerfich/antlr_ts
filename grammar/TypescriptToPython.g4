grammar TypescriptToPython;

// правила для парсера
program: declarations? EOF;
declarations: (declaration | statement)+;
declaration: header body EOL?;
header: 'function' methodName '(' declarationArgs? ')';
declarationArgs: WORD (',' WORD)*;
body: '{' statement* '}';
statement: deepStatement EOL? comments?;
deepStatement:
	variableDeclation
	| operationsWithVariable
	| conditionIf
	| comments
	| protectedMethod
	| objectMethodExec
	| objectProperty
	| returnFunctionValue
	| methodExec;
returnFunctionValue: 'return' resultValue;
resultValue: (
		INT
		| BOOLEAN
		| STRING
		| FLOAT
		| WORD
		| '[' (INT | BOOLEAN | STRING | FLOAT | WORD)? (
			',' (WORD | INT | FLOAT | BOOLEAN | STRING)
		)* ']'
	)+;
protectedMethod: consoleLog '(' methodArgs? ')';
consoleLog: CONSOLELOG;
variableDeclation: type variable (EQ valueOfVariable)?;
conditionIf: conditionBar body elseCondition?;
conditionBar: leftBar conditionBarRule rightBar;
leftBar: IF '(' (BOOLEAN | STRING | WORD | INT | FLOAT);
conditionBarRule: COMPAREOPERATION;
rightBar: (BOOLEAN | STRING | WORD | INT | FLOAT) ')';
elseCondition: ELSE body;
objectProperty: variable '.' propertyTitle;
propertyTitle: WORD;
objectMethodExec: variable '.' methodName '(' methodArgs? ')';
methodExec: methodName '(' methodArgs ')';
methodArgs: (BOOLEAN | STRING | WORD | INT | FLOAT) (
		',' (BOOLEAN | STRING | WORD | INT | FLOAT)
	)*;
comments: COMMENT;
methodName: WORD;
type: 'const' | 'let';
variable: WORD;
operationsWithVariable: leftOperation rightOperation;
leftOperation: WORD ('[' INT ']')? (EQOPS | EQ);
rightOperation: (
		(
			'('? (
				MATHOPERATION
				| (
					WORD ('[' INT ']')?
					| INT
					| FLOAT
					| BOOLEAN
					| STRING
				)
			) ')'?
		)
		| '('
		| ')'
		| (
			'('? (
				MATHOPERATION
				| '[' (FLOAT | BOOLEAN | STRING | INT | WORD)? (
					',' (FLOAT | INT | WORD | BOOLEAN | STRING)
				)* ']'
			) ')'?
		)
	)*;
valueOfVariable:
	BOOLEAN
	| INT
	| FLOAT
	| STRING
	| WORD
	| structure
	| '[' (INT | BOOLEAN | STRING | FLOAT | WORD)? (
		',' (WORD | STRING | FLOAT | BOOLEAN | INT)
	)* ']';
structure: structureDeclaration '(' structureArguments ')';
structureDeclaration: 'new' WORD;
structureArguments: (STRING | WORD | FLOAT | BOOLEAN | INT)? (
		',' (STRING | WORD | FLOAT | BOOLEAN | INT)
	)*;

// Лексические правила
CONSOLELOG: 'console.log';
IF: 'if';
ELSE: 'else';

COMPAREOPERATION:
	EQUALITY
	| STREQUALITY
	| INEQUALITY
	| STRINEQUALITY
	| LESS
	| LARGER
	| LESSOREQ
	| MOREOREQ;

fragment MULTEQ: '*=';
fragment DIVEQ: '/=';
fragment EQUALITY: '==';
fragment STREQUALITY: '===';
fragment INEQUALITY: '!=';
fragment STRINEQUALITY: '!==';
fragment LESS: '<';
fragment PLUS: '+';
fragment MINUS: '-';
fragment MULT: '*';
fragment POWER: '**';
fragment DIV: '/';
fragment INTDIV: '//';
fragment PLUSEQ: '+=';
fragment MINUSEQ: '-=';

fragment AND: '&&';
fragment OR: '||';

fragment LARGER: '>';
fragment LESSOREQ: '<=';
fragment MOREOREQ: '>=';

EQ: '=';
EQOPS: PLUSEQ | MINUSEQ | MULTEQ | DIVEQ;
MATHOPERATION: PLUS | MINUS | MULT | POWER | DIV | INTDIV;
INT: '-'? [0-9]+;
FLOAT: '-'? [0-9]+ '.' [0-9]+;
BOOLEAN: 'true' | 'false';
//получилось только с двойными
STRING: '"' .*? '"';
WORD: [a-zA-Z_] [a-zA-Z0-9_]*;
WHITESPACE: (' ' | '\t')+ -> skip;
NEWLINE: ('\r'? '\n' | '\r')+ -> skip;
COMMENT: '//' ~[\r\n\f]*;
EOL: ';';