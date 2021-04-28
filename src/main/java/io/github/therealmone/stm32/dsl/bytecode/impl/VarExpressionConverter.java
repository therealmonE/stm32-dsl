package io.github.therealmone.stm32.dsl.bytecode.impl;

import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.VarExpressionContext;
import io.github.therealmone.stm32.dsl.bytecode.ByteCode;
import io.github.therealmone.stm32.dsl.bytecode.Converter;
import io.github.therealmone.stm32.dsl.compiler.Context;
import io.github.therealmone.stm32.dsl.utils.RpnConverter;
import lombok.val;

import static io.github.therealmone.stm32.dsl.scecification.Command.MSTORE;

public class VarExpressionConverter implements Converter<VarExpressionContext> {

    @Override
    public ByteCode convert(VarExpressionContext node, Context context) {
        val variable = node.VAR().getText();

        val address = context.defineVariable(variable);
        val valueByteCode = RpnConverter.convert(node.valueExpression(), context);

        return valueByteCode
                .append(MSTORE)
                .append(address);
    }

}
