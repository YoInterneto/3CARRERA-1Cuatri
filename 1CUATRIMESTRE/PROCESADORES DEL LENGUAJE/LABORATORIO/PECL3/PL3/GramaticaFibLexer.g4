lexer grammar GramaticaFibLexer;

//tokens:

INCLUDE_START   : 'include';
VARIABLE        : ':=';
END             : ';';
RETURN_TYPE     : ':';
RETURN          : 'devolver';
FUNCION         : 'function';
INICIO          : 'begin';
FINAL           : 'end';
ENTONCES        : 'then';
AELSE            : 'else';
AEND_IF          : 'endif';
INTEGER         : 'numero';
STRING          : 'cadena';
VOID            : 'void';
WHILE           : 'while';
FOR             : 'for';
FROM            : 'from';
TO              : 'to';
STEP            : 'step';
DO              : 'do';
ENDDO           : 'enddo ';
IF              : 'if';
MUL             : '*';
DIV             : '/';
ADD             : '+';
SUB             : '-';
MIN             : '<';
MAX             : '>';
MINEQ           : '<=';
MAXEQ           : '>=';
EQ              : '==';
NEQ             : '!=';
PARENTESIS_DER  : '(';
PARENTESIS_IZQ  : ')';
COMA            : ',';
BARRA           : ('-' | '_');
INT             : DIGITO+ ;
FLOAT           : (DIGITO+'.'DIGITO*)|(DIGITO*'.'DIGITO+);
VAR             : LETRA(LETRA|DIGITO|BARRA)*;
fragment LETRA  : [a-zA-Z];
fragment DIGITO : [0-9];

// cadenas de caracteres

CADENA          : '"' (ESC|.)*? '"';
fragment ESC    :  '\\'[btrn"\\];

// comentarios 

COMENTAR_BLOQUE : '/*' .*? '*/' NEWLINE*-> skip;
COMENTARIO_LINEA: '//' .*? '\n' ->skip;

NEWLINE         : [\r\n]+ ->skip;
WS              : [ \t\r\n]+ ->skip;
