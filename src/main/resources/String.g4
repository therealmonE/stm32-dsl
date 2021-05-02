grammar String;

CHAR : .;
PLACEHOLDER : '${' VAR '}';

fragment
VAR : [a-z]+;

string
    : (CHAR | PLACEHOLDER)+
    ;