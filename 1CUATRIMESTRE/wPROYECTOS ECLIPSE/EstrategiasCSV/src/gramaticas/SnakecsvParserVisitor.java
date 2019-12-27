// Generated from D:/Escritorio/UNIVERSIDAD/3º CARRERA/1 CUATRIMESTRE/wPROYECTOS ECLIPSE/EstrategiasCSV/src/gramaticas/SnakecsvParser.g4 by ANTLR 4.7.1

	package gramaticas;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SnakecsvParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SnakecsvParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SnakecsvParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(SnakecsvParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl(SnakecsvParser.ControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#llamadafuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadafuncion(SnakecsvParser.LlamadafuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(SnakecsvParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(SnakecsvParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(SnakecsvParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(SnakecsvParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#cuerpo_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo_funcion(SnakecsvParser.Cuerpo_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#cuerpo_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo_control(SnakecsvParser.Cuerpo_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#header_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader_funcion(SnakecsvParser.Header_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#header_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader_control(SnakecsvParser.Header_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(SnakecsvParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SnakecsvParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#pr_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPr_funcion(SnakecsvParser.Pr_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#pr_tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPr_tipo(SnakecsvParser.Pr_tipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#pr_bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPr_bloque(SnakecsvParser.Pr_bloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#pr_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPr_control(SnakecsvParser.Pr_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#pr_include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPr_include(SnakecsvParser.Pr_includeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#nombre_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombre_funcion(SnakecsvParser.Nombre_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#nombre_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombre_variable(SnakecsvParser.Nombre_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#nombre_libreria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombre_libreria(SnakecsvParser.Nombre_libreriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#cadena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena(SnakecsvParser.CadenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(SnakecsvParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#flotante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlotante(SnakecsvParser.FlotanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#tipo_devolucion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_devolucion(SnakecsvParser.Tipo_devolucionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#basura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasura(SnakecsvParser.BasuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnakecsvParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(SnakecsvParser.ParametrosContext ctx);
}