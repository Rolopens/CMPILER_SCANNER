lexer grammar SHJava;
// Lexer Rules

// KEYWORDS
KEYWORD: ABSTRACT | ASSERT | BOOLEAN | BREAK | CASE | CHAR | CLASS | CONST | DEFAULT | DO | ELSE | ENUM | EXTENDS | FINAL | FLOAT | FOR | IF | IMPLEMENTS | INSTANCEOF | INT | INTERFACE | NEW | NULL | PRIVATE | PRINT | PROTECTED | PUBLIC | RETURN | SCAN | STATIC | STRING | SUPER | SWITCH | THIS | VOID | WHILE;
ABSTRACT:           'abs';
ASSERT:             'ass';
BOOLEAN:            'boo';
BREAK:              'brk';
CASE:               'cas';
CHAR:               'cha';
CLASS:              'cla';
CONST:              'con';
DEFAULT:            'def';
DO:                 'ddo';
ELSE:               'els';
ENUM:               'enu';
EXTENDS:            'ext';
FINAL:              'fin';
FLOAT:              'flo';
FOR:                'dur';
IF:                 'iif';
IMPLEMENTS:         'imp';
INSTANCEOF:         'iof';
INT:                'dec';
INTERFACE:          'ifa';
NEW:                'cre';
NULL:               'nul';
PRIVATE:            'pri';
PRINT:		        'out';
PROTECTED:          'pro';
PUBLIC:             'pub';
RETURN:             'ret';
SCAN:		        'inp';
STATIC:             'sta';
STRING:             'str';
SUPER:              'sup';
SWITCH:             'swi';
THIS:               'thi';
VOID:               'voi';
WHILE:              'whi';

//LITERALS
DECIMAL_LITERAL
:    ('0' | [1-9] (Digits? | '_'+ Digits)) [IL]?
;

FLOAT_LITERAL
 :      (Digits '.' Digits? | '.' Digits) ExponentPart? [fF]?
             |       Digits (ExponentPart [fF]? | [fF])
             ;

BOOL_LITERAL
:       'true'
            |       'false'
            ;

CHAR_LITERAL
:       '\'' (~['\\\r\n] | EscapeSequence) '\''
;

STRING_LITERAL
:     '"' (~["\\\r\n] | EscapeSequence)* '"'
;

NULL_LITERAL
:       'null'
;
PRINTABLE_LITERALS
	: DECIMAL_LITERAL
	| FLOAT_LITERAL
	| CHAR_LITERAL
	| STRING_LITERAL
;


//SEPARATORS
SEPARATOR: LPAREN | RPAREN | LBRACE | RBRACE | LBRACK | RBRACK | SEMI | COMMA | DOT;
LPAREN:             '(';
RPAREN:             ')';
LBRACE:             '{';
RBRACE:             '}';
LBRACK:             '[';
RBRACK:             ']';
SEMI:               ';';
COMMA:              ',';
DOT:                '.';

//OPERATORS
OPERATORS: ASSIGN | GT | LT | BANG | TILDE | QUESTION | COLON | EQUAL | LE | GE | NOTEQUAL | AND | OR | INC | DEC | ADD | SUB | MUL | DIV | MOD | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN;
ASSIGN:             '=';
GT:                 '>';
LT:                 '<';
BANG:               '!';
TILDE:              '~';
QUESTION:           '?';
COLON:              ':';
EQUAL:              '==';
LE:                 '<=';
GE:                 '>=';
NOTEQUAL:           '!=';
AND:                '&&';
OR:                 '||';
INC:                '++';
DEC:                '--';
ADD:                '+';
SUB:                '-';
MUL:                '*';
DIV:                '/';
MOD:                '%';
ADD_ASSIGN:         '+=';
SUB_ASSIGN:         '-=';
MUL_ASSIGN:         '*=';
DIV_ASSIGN:         '/=';

//TOKENS
TOKEN: AT;
AT:                 '@';

//WHITESPACE AND COMMENTS
//WS : [ \t\r\n]+ -> skip ;
WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);

//IDENTIFIERS
IDENTIFIER
:         Letter LetterOrDigit*
;

//FRAGMENTS
fragment ExponentPart
    : [eE] [+-]? Digits
    ;

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    ;

fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;
fragment LetterOrDigit
    : Letter
    | [0-9]
    ;
fragment Letter
    : [a-zA-Z$_]
    ;

//Error Handling
INVALIDCHAR_LITERAL: '\'' (~['\\\r\n] | EscapeSequence)* '\'';
INVALIDIDENTIFIER:Digits LetterOrDigit*;
UnknownToken: .; //unrecognized
