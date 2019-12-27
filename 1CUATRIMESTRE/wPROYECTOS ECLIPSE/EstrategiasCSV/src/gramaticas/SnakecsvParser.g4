parser grammar SnakecsvParser;

options {
	tokenVocab = SnakecsvLexer;
	language = Java;
}

@header {
	package gramaticas;
}

prog: ((funcion|control|llamadafuncion|asignacion|declaracion|include) NEWLINE?)* ;

//FUNCIONES
//Prog
funcion: header_funcion NEWLINE* cuerpo_funcion;
control: header_control NEWLINE* cuerpo_control; 
llamadafuncion : nombre_funcion parametros basura ;
declaracion : pr_tipo nombre_variable ASIGNAR expr basura ; //la primera vez que instanciamos una variable
asignacion: nombre_variable ASIGNAR expr basura ; //asignar un valor a una variable
include: pr_include nombre_libreria basura ;

//Bloque
bloque : pr_bloque ;

//Body y header
cuerpo_funcion: pr_bloque NEWLINE* ((llamadafuncion|asignacion|control|declaracion)NEWLINE*)* pr_bloque ;
cuerpo_control: pr_bloque NEWLINE* ((llamadafuncion|asignacion|control|declaracion)NEWLINE*)* pr_bloque ;
header_funcion : pr_funcion nombre_funcion parametros tipo_devolucion ;
header_control: pr_control parametros? ;


//EXPRESIONES
arg: (TIPO ID(COMA TIPO ID)*)? ;
expr: expr OPERACION expr
    | expr OPERACION expr
    | expr OPERACION expr
    | expr COMA expr
    | ID parametros
    | llamadafuncion//ID PI ((numero|ID|cadena|flotante)((','|', ')(numero|ID|cadena|flotante))*)? PD NEWLINE?
    | numero NEWLINE?            //
    | cadena NEWLINE?           // Los NEWLINE? son para el caso en el cual haya varias lineas para refernciar   
    | flotante NEWLINE?        // a parametros, asignaciones de variables...
    | ID NEWLINE?             //            
    ;

//Palabras reservadas
pr_funcion: FUNCTION ;
pr_tipo: TIPO ;
pr_bloque: BEGIN | END ;
pr_control: IF | ELSE | WHILE ;
pr_include: INCLUDE ;

//Nombres
nombre_funcion: ID ;
nombre_variable: ID ;
nombre_libreria: ID ;

//Tipo de datos
cadena: STRING ;
numero: INT ;
flotante: FLOAT;
tipo_devolucion: basura pr_tipo ;

//Caracteres no importantes
basura: DOBLEPUNTO | FINAL | NEWLINE | ASIGNAR;

//Parametros
parametros: PI expr PD | PI arg PD;
