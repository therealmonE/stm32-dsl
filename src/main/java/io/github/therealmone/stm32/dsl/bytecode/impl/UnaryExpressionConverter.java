package io.github.therealmone.stm32.dsl.bytecode.impl;

import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.UnaryExpressionContext;
import io.github.therealmone.stm32.dsl.bytecode.ByteCode;
import io.github.therealmone.stm32.dsl.bytecode.Converter;
import io.github.therealmone.stm32.dsl.compiler.Context;
import lombok.val;
import org.antlr.v4.runtime.tree.TerminalNode;

import static io.github.therealmone.stm32.dsl.scecification.Command.IDEC;
import static io.github.therealmone.stm32.dsl.scecification.Command.IINC;
import static io.github.therealmone.stm32.dsl.scecification.Command.MLOAD;
import static io.github.therealmone.stm32.dsl.scecification.Command.MSTORE;

public class UnaryExpressionConverter implements Converter<UnaryExpressionContext> {

    @Override
    public ByteCode convert(UnaryExpressionContext node, Context context) {
        if (node.prefixExpression() != null) {
            val prefixExpression = node.prefixExpression();

            return convert(context, prefixExpression.VAR(), prefixExpression.INCREMENT(), prefixExpression.DECREMENT());
        } else if (node.postfixExpression() != null) {
            val postfixExpression = node.postfixExpression();

            return convert(context, postfixExpression.VAR(), postfixExpression.INCREMENT(), postfixExpression.DECREMENT());
        } else {
            throw new RuntimeException("Can't convert unary expression");
        }
    }

    private ByteCode convert(Context context, TerminalNode var, TerminalNode increment, TerminalNode decrement) {
        val varAddress = context.getVariableAddress(var.getText());

        val bytecode = new ByteCode()
                .append(MLOAD)
                .append(varAddress);

        if (increment != null) {
            bytecode.append(IINC);
        } else if (decrement != null) {
            bytecode.append(IDEC);
        } else {
            throw new RuntimeException("Can't convert unary expression");
        }

        bytecode.append(MSTORE)
                .append(varAddress);

        return bytecode;
    }

}
