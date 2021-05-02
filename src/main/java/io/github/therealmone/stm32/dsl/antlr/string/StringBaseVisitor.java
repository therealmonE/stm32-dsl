// Generated from E:/STM32_projects/Stm32DSL/src/main/resources\String.g4 by ANTLR 4.9.1
package io.github.therealmone.stm32.dsl.antlr.string;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link StringVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class StringBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements StringVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitString(StringParser.StringContext ctx) { return visitChildren(ctx); }
}