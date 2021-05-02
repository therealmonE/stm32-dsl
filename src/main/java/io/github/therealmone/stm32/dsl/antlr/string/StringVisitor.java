// Generated from E:/STM32_projects/Stm32DSL/src/main/resources\String.g4 by ANTLR 4.9.1
package io.github.therealmone.stm32.dsl.antlr.string;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StringParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StringVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StringParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(StringParser.StringContext ctx);
}