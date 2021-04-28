package io.github.therealmone.stm32.dsl.bytecode.impl;

import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.WhileExpressionContext;
import io.github.therealmone.stm32.dsl.bytecode.ByteCode;
import io.github.therealmone.stm32.dsl.bytecode.Converter;
import io.github.therealmone.stm32.dsl.compiler.Context;
import io.github.therealmone.stm32.dsl.utils.RpnConverter;
import lombok.val;

import static io.github.therealmone.stm32.dsl.scecification.Command.JMP;
import static io.github.therealmone.stm32.dsl.scecification.Command.JMPZ;

public class WhileExpressionConverter implements Converter<WhileExpressionContext> {

    @Override
    public ByteCode convert(WhileExpressionContext node, Context context) {

        val returnMarker = context.createMarker();
        val exitMarker = context.createMarker();

        val conditionByteCode = RpnConverter.convert(node.conditionalExpression(), context);
        val bodyByteCode = new BlockConverter().convert(node.block(), context);

        return new ByteCode()
                .append(returnMarker.to())
                .append(conditionByteCode)
                .append(JMPZ)
                .append(exitMarker.from())
                .append(bodyByteCode)
                .append(JMP)
                .append(returnMarker.from())
                .append(exitMarker.to());
    }

}
