// Generated from D:/Escritorio/UNIVERSIDAD/3º CARRERA/1 CUATRIMESTRE/wPROYECTOS ECLIPSE/EstrategiasCSV/src/gramaticas/SnakecsvParser.g4 by ANTLR 4.7.1

	package gramaticas;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SnakecsvParser}.
 */
public interface SnakecsvParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SnakecsvParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SnakecsvParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(SnakecsvParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(SnakecsvParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#control}.
	 * @param ctx the parse tree
	 */
	void enterControl(SnakecsvParser.ControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#control}.
	 * @param ctx the parse tree
	 */
	void exitControl(SnakecsvParser.ControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#llamadafuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadafuncion(SnakecsvParser.LlamadafuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#llamadafuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadafuncion(SnakecsvParser.LlamadafuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(SnakecsvParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(SnakecsvParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(SnakecsvParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(SnakecsvParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(SnakecsvParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(SnakecsvParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(SnakecsvParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(SnakecsvParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#cuerpo_funcion}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_funcion(SnakecsvParser.Cuerpo_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#cuerpo_funcion}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_funcion(SnakecsvParser.Cuerpo_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#cuerpo_control}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_control(SnakecsvParser.Cuerpo_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#cuerpo_control}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_control(SnakecsvParser.Cuerpo_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#header_funcion}.
	 * @param ctx the parse tree
	 */
	void enterHeader_funcion(SnakecsvParser.Header_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#header_funcion}.
	 * @param ctx the parse tree
	 */
	void exitHeader_funcion(SnakecsvParser.Header_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#header_control}.
	 * @param ctx the parse tree
	 */
	void enterHeader_control(SnakecsvParser.Header_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#header_control}.
	 * @param ctx the parse tree
	 */
	void exitHeader_control(SnakecsvParser.Header_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(SnakecsvParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(SnakecsvParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SnakecsvParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SnakecsvParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#pr_funcion}.
	 * @param ctx the parse tree
	 */
	void enterPr_funcion(SnakecsvParser.Pr_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#pr_funcion}.
	 * @param ctx the parse tree
	 */
	void exitPr_funcion(SnakecsvParser.Pr_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#pr_tipo}.
	 * @param ctx the parse tree
	 */
	void enterPr_tipo(SnakecsvParser.Pr_tipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#pr_tipo}.
	 * @param ctx the parse tree
	 */
	void exitPr_tipo(SnakecsvParser.Pr_tipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#pr_bloque}.
	 * @param ctx the parse tree
	 */
	void enterPr_bloque(SnakecsvParser.Pr_bloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#pr_bloque}.
	 * @param ctx the parse tree
	 */
	void exitPr_bloque(SnakecsvParser.Pr_bloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#pr_control}.
	 * @param ctx the parse tree
	 */
	void enterPr_control(SnakecsvParser.Pr_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#pr_control}.
	 * @param ctx the parse tree
	 */
	void exitPr_control(SnakecsvParser.Pr_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#pr_include}.
	 * @param ctx the parse tree
	 */
	void enterPr_include(SnakecsvParser.Pr_includeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#pr_include}.
	 * @param ctx the parse tree
	 */
	void exitPr_include(SnakecsvParser.Pr_includeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#nombre_funcion}.
	 * @param ctx the parse tree
	 */
	void enterNombre_funcion(SnakecsvParser.Nombre_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#nombre_funcion}.
	 * @param ctx the parse tree
	 */
	void exitNombre_funcion(SnakecsvParser.Nombre_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#nombre_variable}.
	 * @param ctx the parse tree
	 */
	void enterNombre_variable(SnakecsvParser.Nombre_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#nombre_variable}.
	 * @param ctx the parse tree
	 */
	void exitNombre_variable(SnakecsvParser.Nombre_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#nombre_libreria}.
	 * @param ctx the parse tree
	 */
	void enterNombre_libreria(SnakecsvParser.Nombre_libreriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#nombre_libreria}.
	 * @param ctx the parse tree
	 */
	void exitNombre_libreria(SnakecsvParser.Nombre_libreriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(SnakecsvParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(SnakecsvParser.CadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(SnakecsvParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(SnakecsvParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#flotante}.
	 * @param ctx the parse tree
	 */
	void enterFlotante(SnakecsvParser.FlotanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#flotante}.
	 * @param ctx the parse tree
	 */
	void exitFlotante(SnakecsvParser.FlotanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#tipo_devolucion}.
	 * @param ctx the parse tree
	 */
	void enterTipo_devolucion(SnakecsvParser.Tipo_devolucionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#tipo_devolucion}.
	 * @param ctx the parse tree
	 */
	void exitTipo_devolucion(SnakecsvParser.Tipo_devolucionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#basura}.
	 * @param ctx the parse tree
	 */
	void enterBasura(SnakecsvParser.BasuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#basura}.
	 * @param ctx the parse tree
	 */
	void exitBasura(SnakecsvParser.BasuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnakecsvParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(SnakecsvParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnakecsvParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(SnakecsvParser.ParametrosContext ctx);
}