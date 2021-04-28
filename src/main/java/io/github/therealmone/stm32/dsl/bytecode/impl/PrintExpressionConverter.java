package io.github.therealmone.stm32.dsl.bytecode.impl;

import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.PrintExpressionContext;
import io.github.therealmone.stm32.dsl.bytecode.ByteCode;
import io.github.therealmone.stm32.dsl.bytecode.Converter;
import io.github.therealmone.stm32.dsl.compiler.Context;
import lombok.val;

import static io.github.therealmone.stm32.dsl.scecification.Command.ICONST;
import static io.github.therealmone.stm32.dsl.scecification.Command.PRINT;

public class PrintExpressionConverter implements Converter<PrintExpressionContext> {

    @Override
    public ByteCode convert(PrintExpressionContext node, Context context) {
        if (node.CHAR() != null) {
            return convertWithChar(node);
        } else {
            return convertWithString(node);
        }
    }

    private ByteCode convertWithChar(PrintExpressionContext node) {
        return new ByteCode()
                .append(ICONST)
                .append((int) node.CHAR().getText().charAt(1))
                .append(PRINT)
                .append(1);
    }

    private ByteCode convertWithString(PrintExpressionContext node) {
        val byteCode = new ByteCode();
        val str = node.STRING().getText().replaceAll("\"", "");

        for (int i = str.length() - 1; i >= 0; i--) {
            byteCode.append(ICONST)
                    .append((int) str.charAt(i));
        }

        byteCode.append(PRINT)
                .append(str.length());

        return byteCode;
    }

}
