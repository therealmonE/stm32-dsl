package io.github.therealmone.stm32.dsl.bytecode.impl;

import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.IfExpressionContext;
import io.github.therealmone.stm32.dsl.bytecode.ByteCode;
import io.github.therealmone.stm32.dsl.bytecode.Converter;
import io.github.therealmone.stm32.dsl.compiler.Context;
import io.github.therealmone.stm32.dsl.utils.RpnConverter;
import lombok.val;

import static io.github.therealmone.stm32.dsl.scecification.Command.JMP;
import static io.github.therealmone.stm32.dsl.scecification.Command.JMPZ;

public class IfExpressionConverter implements Converter<IfExpressionContext> {

    @Override
    public ByteCode convert(IfExpressionContext node, Context context) {
        if (node.ELSE_KW() == null) {
            return convertWithoutElse(node, context);
        } else {
            return convertWithElse(node, context);
        }
    }

    private ByteCode convertWithoutElse(IfExpressionContext node, Context context) {
        val exitIfMarker = context.createMarker();

        val conditionByteCode = RpnConverter.convert(node.conditionalExpression(), context);
        val bodyByteCode = new BlockConverter().convert(node.block(0), context);

        return new ByteCode()
                .append(conditionByteCode)
                .append(JMPZ)
                .append(exitIfMarker.from())
                .append(bodyByteCode)
                .append(exitIfMarker.to());
    }

    private ByteCode convertWithElse(IfExpressionContext node, Context context) {
        val jumpToElseMarker = context.createMarker();
        val exitIfMarker = context.createMarker();

        val conditionByteCode = RpnConverter.convert(node.conditionalExpression(), context);
        val bodyByteCode = new BlockConverter().convert(node.block(0), context);
        val elseByteCode = new BlockConverter().convert(node.block(1), context);

        return new ByteCode()
                .append(conditionByteCode)
                .append(JMPZ)
                .append(jumpToElseMarker.from())
                .append(bodyByteCode)
                .append(JMP)
                .append(exitIfMarker.from())
                .append(jumpToElseMarker.to())
                .append(elseByteCode)
                .append(exitIfMarker.to());
    }


}
