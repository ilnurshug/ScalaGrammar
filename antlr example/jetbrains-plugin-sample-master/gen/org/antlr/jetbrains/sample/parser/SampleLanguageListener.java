// Generated from /home/user/Documents/antlr example/jetbrains-plugin-sample-master/src/grammars/org/antlr/jetbrains/sample/parser/SampleLanguage.g4 by ANTLR 4.5.3
package org.antlr.jetbrains.sample.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SampleLanguageParser}.
 */
public interface SampleLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(SampleLanguageParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(SampleLanguageParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SampleLanguageParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SampleLanguageParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#formal_args}.
	 * @param ctx the parse tree
	 */
	void enterFormal_args(SampleLanguageParser.Formal_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#formal_args}.
	 * @param ctx the parse tree
	 */
	void exitFormal_args(SampleLanguageParser.Formal_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#formal_arg}.
	 * @param ctx the parse tree
	 */
	void enterFormal_arg(SampleLanguageParser.Formal_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#formal_arg}.
	 * @param ctx the parse tree
	 */
	void exitFormal_arg(SampleLanguageParser.Formal_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SampleLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SampleLanguageParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SampleLanguageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SampleLanguageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SampleLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SampleLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(SampleLanguageParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(SampleLanguageParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SampleLanguageParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SampleLanguageParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(SampleLanguageParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(SampleLanguageParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void enterCall_expr(SampleLanguageParser.Call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void exitCall_expr(SampleLanguageParser.Call_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(SampleLanguageParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(SampleLanguageParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(SampleLanguageParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(SampleLanguageParser.PrimaryContext ctx);
}