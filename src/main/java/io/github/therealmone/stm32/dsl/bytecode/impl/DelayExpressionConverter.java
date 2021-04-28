package io.github.therealmone.stm32.dsl.bytecode.impl;

import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.DelayExpressionContext;
import io.github.therealmone.stm32.dsl.bytecode.ByteCode;
import io.github.therealmone.stm32.dsl.bytecode.Converter;
import io.github.therealmone.stm32.dsl.compiler.Context;
import io.github.therealmone.stm32.dsl.scecification.Command;
import io.github.therealmone.stm32.dsl.utils.RpnConverter;
import lombok.val;

public class DelayExpressionConverter implements Converter<DelayExpressionContext> {

    @Override
    public ByteCode convert(DelayExpressionContext node, Context context) {
        val valueByteCode = RpnConverter.convert(node.valueExpression(), context);

        return new ByteCode()
                .append(valueByteCode)
                .append(Command.DELAY);
    }

}
