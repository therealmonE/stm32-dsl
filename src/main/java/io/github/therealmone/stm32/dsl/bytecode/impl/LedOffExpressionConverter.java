package io.github.therealmone.stm32.dsl.bytecode.impl;

import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.LedOffExpressionContext;
import io.github.therealmone.stm32.dsl.bytecode.ByteCode;
import io.github.therealmone.stm32.dsl.bytecode.Converter;
import io.github.therealmone.stm32.dsl.compiler.Context;

import static io.github.therealmone.stm32.dsl.scecification.Command.LEDOFF;

public class LedOffExpressionConverter implements Converter<LedOffExpressionContext> {

    @Override
    public ByteCode convert(LedOffExpressionContext node, Context context) {
        return new ByteCode().append(LEDOFF);
    }

}
