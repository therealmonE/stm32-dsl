// Generated from E:/STM32_projects/Stm32DSL/src/main/resources\Stm32DSL.g4 by ANTLR 4.9.1
package io.github.therealmone.stm32.dsl.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Stm32DSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Stm32DSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(Stm32DSLParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Stm32DSLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#ledOnExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLedOnExpression(Stm32DSLParser.LedOnExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#ledOffExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLedOffExpression(Stm32DSLParser.LedOffExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#delayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelayExpression(Stm32DSLParser.DelayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#blinkExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlinkExpression(Stm32DSLParser.BlinkExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#whileExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpression(Stm32DSLParser.WhileExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(Stm32DSLParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#varExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpression(Stm32DSLParser.VarExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#assignExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(Stm32DSLParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#printExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpression(Stm32DSLParser.PrintExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(Stm32DSLParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(Stm32DSLParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(Stm32DSLParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(Stm32DSLParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(Stm32DSLParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(Stm32DSLParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpression(Stm32DSLParser.ValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#valueExpressionWithBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionWithBrackets(Stm32DSLParser.ValueExpressionWithBracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(Stm32DSLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#isLoudExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsLoudExpression(Stm32DSLParser.IsLoudExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Stm32DSLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(Stm32DSLParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(Stm32DSLParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stm32DSLParser#prefixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpression(Stm32DSLParser.PrefixExpressionContext ctx);
}