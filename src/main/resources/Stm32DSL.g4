grammar Stm32DSL;

SCRIPT_KW : 'script';
LFB : '{';
RFB : '}';
LB : '(';
RB : ')';
LED_ON_KW : 'ledon';
LED_OFF_KW : 'ledoff';
BLINK_KW : 'blink';
DELAY_KW : 'delay';
IS_LOUD_KW : 'isloud';
PRINT_KW : 'print';
WHILE_KW : 'while';
DEL : ';';
FOR_KW : 'for';
IF_KW : 'if';
ELSE_KW : 'else';
RELATIONAL_OP : '<' | '>';
EQUALITY_OP :  '==' | '!=';
LOGICAL_OR_OP : '||';
LOGICAL_AND_OP : '&&';
VAR_KW : 'var';
VAR : [a-zA-Z]+;
INCREMENT : '++';
DECREMENT : '--';
OP : '+' | '-' | '*' | '%' | '/';
NUMBER : [0-9]+;
CHAR_LITERAL : '\''~[']'\'';
STRING_LITERAL : '"'(~["])+'"';
WS : [\n\t\r ]+ -> skip;

script
    : SCRIPT_KW block;

expression
    : blinkExpression
    | ledOnExpression
    | ledOffExpression
    | delayExpression
    | whileExpression
    | forExpression
    | varExpression
    | assignExpression
    | unaryExpression
    | printExpression
    | ifExpression;

ledOnExpression
    : LED_ON_KW
    ;

ledOffExpression
    : LED_OFF_KW
    ;

delayExpression
    : DELAY_KW valueExpression
    ;

blinkExpression
    : BLINK_KW valueExpression
    ;

whileExpression
    : WHILE_KW LB conditionalExpression RB block
    ;

forExpression
    : FOR_KW LB
    varExpression DEL
    conditionalExpression DEL
    (assignExpression | unaryExpression) RB
    block
    ;

varExpression
    : VAR_KW VAR '=' valueExpression
    ;

assignExpression
    : VAR '=' valueExpression
    ;

printExpression
    : PRINT_KW (STRING_LITERAL | CHAR_LITERAL)
    ;

ifExpression
    : IF_KW LB conditionalExpression RB block (ELSE_KW block)?
    ;

conditionalExpression
    : logicalOrExpression
    ;

logicalOrExpression
    : logicalAndExpression (LOGICAL_OR_OP logicalAndExpression)*
    ;

logicalAndExpression
    : equalityExpression (LOGICAL_AND_OP equalityExpression)*
    ;

equalityExpression
    : relationalExpression (EQUALITY_OP relationalExpression)*
    ;

relationalExpression
    : valueExpression (RELATIONAL_OP valueExpression)*
    ;

valueExpression
    : (value | valueExpressionWithBrackets) (OP valueExpression)*
    ;

valueExpressionWithBrackets
    : LB valueExpression RB
    ;

value
    : isLoudExpression
    | NUMBER
    | VAR
    | unaryExpression
    ;

isLoudExpression
    : IS_LOUD_KW;

block
    : LFB expression* RFB
    ;

unaryExpression
    : prefixExpression
    | postfixExpression
    ;

postfixExpression
    : VAR (INCREMENT | DECREMENT)
    ;

prefixExpression
    : (INCREMENT | DECREMENT) VAR
    ;