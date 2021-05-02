// Generated from E:/STM32_projects/Stm32DSL/src/main/resources\String.g4 by ANTLR 4.9.1
package io.github.therealmone.stm32.dsl.antlr.string;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StringParser}.
 */
public interface StringListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StringParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(StringParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(StringParser.StringContext ctx);
}