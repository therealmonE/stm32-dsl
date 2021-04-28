// Generated from E:/STM32_projects/Stm32DSL/src/main/resources\Stm32DSL.g4 by ANTLR 4.9.1
package io.github.therealmone.stm32.dsl.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Stm32DSLParser}.
 */
public interface Stm32DSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(Stm32DSLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(Stm32DSLParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Stm32DSLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Stm32DSLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#ledOnExpression}.
	 * @param ctx the parse tree
	 */
	void enterLedOnExpression(Stm32DSLParser.LedOnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#ledOnExpression}.
	 * @param ctx the parse tree
	 */
	void exitLedOnExpression(Stm32DSLParser.LedOnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#ledOffExpression}.
	 * @param ctx the parse tree
	 */
	void enterLedOffExpression(Stm32DSLParser.LedOffExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#ledOffExpression}.
	 * @param ctx the parse tree
	 */
	void exitLedOffExpression(Stm32DSLParser.LedOffExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#delayExpression}.
	 * @param ctx the parse tree
	 */
	void enterDelayExpression(Stm32DSLParser.DelayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#delayExpression}.
	 * @param ctx the parse tree
	 */
	void exitDelayExpression(Stm32DSLParser.DelayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#blinkExpression}.
	 * @param ctx the parse tree
	 */
	void enterBlinkExpression(Stm32DSLParser.BlinkExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#blinkExpression}.
	 * @param ctx the parse tree
	 */
	void exitBlinkExpression(Stm32DSLParser.BlinkExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#whileExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpression(Stm32DSLParser.WhileExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#whileExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpression(Stm32DSLParser.WhileExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(Stm32DSLParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(Stm32DSLParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#varExpression}.
	 * @param ctx the parse tree
	 */
	void enterVarExpression(Stm32DSLParser.VarExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#varExpression}.
	 * @param ctx the parse tree
	 */
	void exitVarExpression(Stm32DSLParser.VarExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(Stm32DSLParser.AssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(Stm32DSLParser.AssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#printExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpression(Stm32DSLParser.PrintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#printExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpression(Stm32DSLParser.PrintExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(Stm32DSLParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(Stm32DSLParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(Stm32DSLParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(Stm32DSLParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(Stm32DSLParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(Stm32DSLParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(Stm32DSLParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(Stm32DSLParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(Stm32DSLParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(Stm32DSLParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(Stm32DSLParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(Stm32DSLParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpression(Stm32DSLParser.ValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpression(Stm32DSLParser.ValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#valueExpressionWithBrackets}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionWithBrackets(Stm32DSLParser.ValueExpressionWithBracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#valueExpressionWithBrackets}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionWithBrackets(Stm32DSLParser.ValueExpressionWithBracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(Stm32DSLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(Stm32DSLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#isLoudExpression}.
	 * @param ctx the parse tree
	 */
	void enterIsLoudExpression(Stm32DSLParser.IsLoudExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#isLoudExpression}.
	 * @param ctx the parse tree
	 */
	void exitIsLoudExpression(Stm32DSLParser.IsLoudExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Stm32DSLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Stm32DSLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(Stm32DSLParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(Stm32DSLParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(Stm32DSLParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(Stm32DSLParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stm32DSLParser#prefixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpression(Stm32DSLParser.PrefixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stm32DSLParser#prefixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpression(Stm32DSLParser.PrefixExpressionContext ctx);
}