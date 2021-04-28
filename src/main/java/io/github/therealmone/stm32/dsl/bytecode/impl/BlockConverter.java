package io.github.therealmone.stm32.dsl.bytecode.impl;

import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.BlockContext;
import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.ExpressionContext;
import io.github.therealmone.stm32.dsl.bytecode.ByteCode;
import io.github.therealmone.stm32.dsl.bytecode.Converter;
import io.github.therealmone.stm32.dsl.compiler.Context;
import lombok.val;

public class BlockConverter implements Converter<BlockContext> {

    @Override
    public ByteCode convert(BlockContext node, Context context) {
        context.enterBlock();

        try {
            val byteCode = new ByteCode();

            for (ExpressionContext expressionContext : node.expression()) {
                byteCode.append(new ExpressionConverter().convert(expressionContext, context));
            }

            return byteCode;
        } finally {
            context.exitBlock();
        }
    }

}
