package io.github.therealmone.stm32.dsl.bytecode.impl;

import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.LedOnExpressionContext;
import io.github.therealmone.stm32.dsl.bytecode.ByteCode;
import io.github.therealmone.stm32.dsl.bytecode.Converter;
import io.github.therealmone.stm32.dsl.compiler.Context;

import static io.github.therealmone.stm32.dsl.scecification.Command.LEDON;

public class LedOnExpressionConverter implements Converter<LedOnExpressionContext> {

    @Override
    public ByteCode convert(LedOnExpressionContext node, Context context) {
        return new ByteCode().append(LEDON);
    }

}
