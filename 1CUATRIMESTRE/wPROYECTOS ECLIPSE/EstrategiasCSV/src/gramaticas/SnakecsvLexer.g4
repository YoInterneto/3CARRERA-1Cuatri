lexer grammar SnakecsvLexer;

// import SnakecsvFragments;

@header {
	package gramaticas;
}

//PALABRAS RESERVADAS
FUNCTION: 'function';
INCLUDE: 'include' ;
WHILE: 'while' ;
IF: 'if' ;
ELSE: 'else' ;
BEGIN: 'begin' ;
END: 'end' ;
TIPO: ('numero'|'cadena'|'void') ;


//IDENTIFICADORES
ID: ID_LETRA(ID_LETRA|DIGITO)*;
fragment ID_LETRA: [a-zA-Z];
fragment DIGITO: [0-9];


//VARIABLES
INT: DIGITO+;
FLOAT: DIGITO+ '.' DIGITO*
        | '.' DIGITO+
        ;
STRING: '"' .*? '"';


//COMENTARIOS
COMENTARIO_LINEA: ('//' .*? '\n') -> skip ;
COMENTARIO_BLOQUE: ('/*' .*? '*/' NEWLINE) -> skip ;


//SALTO DE LINEA
NEWLINE: [\r\n]+;


//CARACTERES ESPECIALES
PI: '(' ;
PD: ')' ;
COMA: (','|', ');
OPERACION: ('*'|'/'|'+'|'-'|'=='|'!='|'<'|'>'|'<='|'>=');
FINAL: ';' ;
ASIGNAR: ':=' ;
DOBLEPUNTO: ':';
WS: ' '+ -> skip;
TAB: '\t'+ -> skip;