package io.github.therealmone.stm32.dsl.bytecode.impl;

import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.BlinkExpressionContext;
import io.github.therealmone.stm32.dsl.bytecode.ByteCode;
import io.github.therealmone.stm32.dsl.bytecode.Converter;
import io.github.therealmone.stm32.dsl.compiler.Context;
import lombok.val;

import static io.github.therealmone.stm32.dsl.scecification.Command.BLINK;

public class BlinkExpressionConverter implements Converter<BlinkExpressionContext> {

    @Override
    public ByteCode convert(BlinkExpressionContext node, Context context) {
        val timeByteCode = new TimeExpressionConverter().convert(node.timeExpression(), context);

        return new ByteCode()
                .append(timeByteCode)
                .append(BLINK);
    }

}
