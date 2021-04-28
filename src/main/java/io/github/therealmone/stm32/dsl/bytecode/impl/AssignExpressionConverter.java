package io.github.therealmone.stm32.dsl.bytecode.impl;

import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.AssignExpressionContext;
import io.github.therealmone.stm32.dsl.bytecode.ByteCode;
import io.github.therealmone.stm32.dsl.bytecode.Converter;
import io.github.therealmone.stm32.dsl.compiler.Context;
import io.github.therealmone.stm32.dsl.utils.RpnConverter;
import lombok.val;

import static io.github.therealmone.stm32.dsl.scecification.Command.MSTORE;

public class AssignExpressionConverter implements Converter<AssignExpressionContext> {

    @Override
    public ByteCode convert(AssignExpressionContext node, Context context) {
        val variable = node.VAR().getText();

        val address = context.getVariableAddress(variable);
        val valueByteCode = RpnConverter.convert(node.valueExpression(), context);

        return valueByteCode
                .append(MSTORE)
                .append(address);
    }

}
