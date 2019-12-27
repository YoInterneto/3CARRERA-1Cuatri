parser grammar GramaticaFibParser;
options{
    tokenVocab = GramaticaFibLexer;
    language = Java;
}

init        : ((prog|args|basura)NEWLINE?)*;

comentarios : comentar_bloque
            | comentar_linea
            ;


prog    :   funcion
        |   include* end_exp 
        |   basura prog
        |   prog basura
        ;

args:   basura args
    |   args basura
    |   asignacion_var end_exp
  //  |   declaracion end_exp
    |   variable_declaracion end_exp
    |   llamada_funcion end_exp
    |   funcion_sistema 
    |   funcion_conif 
    |   funcion_for 

    ;

exp :   basura exp
    |   exp basura
  //  |   parametro
    |   parentesis_der exp parentesis_izq
    |   exp mul exp
    |	exp div exp
    |   exp suma exp
    |	exp resta exp
    |   exp logica exp
    |   literal
    |   var_nombre
    |   llamada_funcion
    ;

//Operadores
mul         : (MUL);
div         : (DIV);
suma        : (ADD);
resta       : (SUB);
logica      : (MIN|MAX|MINEQ|MAXEQ|EQ|NEQ);

//Comentarios
comentar_bloque     : COMENTAR_BLOQUE;
comentar_linea      : COMENTARIO_LINEA;

include             : include_inicio basura* library;
asignacion_var      : tipo_variable* var_nombre variable exp;
//declaracion         : tipo_variable* variable var_nombre;
variable_declaracion: tipo_variable (var_nombre  (coma var_nombre)*) variable* exp*;
var_nombre          : VAR;
literal             : numero | cadena;
numero              : INT | FLOAT;
cadena              : CADENA;

llamada_funcion     : nombre_funcion parentesis_der (parametro  (coma parametro)*)? parentesis_izq;
nombre_funcion      : VAR;

//Funcion sistema
funcion_sistema     : cabecera_fun_sis cuerpo_fun_sis;                   
cabecera_fun_sis    : palabra_reservada parentesis_der exp* parentesis_izq ;
cuerpo_fun_sis      : inicio_cuerpo* args* funcion_conif* fin_cuerpo*;
palabra_reservada   : basura* WHILE  basura*; 

//Funcion for
funcion_for         : cabecera_fun_for cuerpo_fun_for;
cabecera_fun_for    : bucle exp palabras_for (numero | var_nombre ) palabras_for (numero | var_nombre ) (opcion (numero | var_nombre))? palabras_for;
cuerpo_fun_for      : inicio_cuerpo args*  finfor;
palabras_for        : basura* (FROM | TO | DO) basura*;
opcion       : basura* STEP basura*;
//Funciones personalizadas
funcion             :   cabecera_funcion_pers cuerpo_funcion_pers;                   
cabecera_funcion_pers:  declarar_funcion nombre_fun_pers parentesis_der 
                        (parametro_cab (coma parametro_cab)*)?
                        parentesis_izq return_type tipo_fun;
cuerpo_funcion_pers : inicio_cuerpo args* funcion_conif* dev? fin_cuerpo;
nombre_fun_pers     : basura* VAR basura*;
parametro          : (var_nombre | literal);
parametro_cab       : tipo_variable var_nombre ;
tipo_fun            : tipo_variable;
dev                 : retornar parentesis_der exp parentesis_izq end_exp;

//Condicional
funcion_conif    : cabecera_fun_conif cuerpo_fun_conif;                   
cabecera_fun_conif    : palabra_condicional parentesis_der* exp* parentesis_izq* ENTONCES?;
cuerpo_fun_conif      : inicio_cuerpo* args* funcion_conElse* finif;
palabra_condicional   : basura* IF basura*; 
condicional         : basura* AELSE basura*;

funcion_conElse : condicional cuerpo_conElse;
cuerpo_conElse  : args*;


//tokens
coma                : COMA;
end_exp             : basura* END basura*;
include_inicio      : basura* INCLUDE_START basura*;
library             : basura* VAR basura*;
tipo_variable       : basura* (INTEGER | STRING | VOID) basura* ;
return_type         : basura* RETURN_TYPE basura*;
retornar            : basura* RETURN basura*;
declarar_funcion    : basura* FUNCION basura*;
parentesis_der      : basura* PARENTESIS_DER basura*;
parentesis_izq      : basura* PARENTESIS_IZQ basura*;
inicio_cuerpo       : NEWLINE* basura* INICIO basura*;
fin_cuerpo          : basura* FINAL basura*;
variable            : basura* VARIABLE basura*;
basura              : comentarios | WS | NEWLINE;
finif               : basura* AEND_IF basura*;
bucle               : basura* FOR basura*;
finfor         : basura * ENDDO basura*;

