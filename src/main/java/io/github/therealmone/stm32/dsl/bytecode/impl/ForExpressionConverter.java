package io.github.therealmone.stm32.dsl.bytecode.impl;

import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.ForExpressionContext;
import io.github.therealmone.stm32.dsl.bytecode.ByteCode;
import io.github.therealmone.stm32.dsl.bytecode.Converter;
import io.github.therealmone.stm32.dsl.compiler.Context;
import io.github.therealmone.stm32.dsl.utils.RpnConverter;
import lombok.val;

import static io.github.therealmone.stm32.dsl.scecification.Command.JMP;
import static io.github.therealmone.stm32.dsl.scecification.Command.JMPZ;

public class ForExpressionConverter implements Converter<ForExpressionContext> {

    @Override
    public ByteCode convert(ForExpressionContext node, Context context) {
        context.enterBlock();

        val varByteCode = new VarExpressionConverter().convert(node.varExpression(), context);
        val conditionByteCode = RpnConverter.convert(node.conditionalExpression(), context);
        val postExecutionByteCode = node.assignExpression() != null
                ? new AssignExpressionConverter().convert(node.assignExpression(), context)
                : new UnaryExpressionConverter().convert(node.unaryExpression(), context);
        val blockByteCode = new BlockConverter().convert(node.block(), context);

        val returnMarker = context.createMarker();
        val exitMarker = context.createMarker();

        val byteCode = new ByteCode();

        byteCode.append(varByteCode)
                .append(returnMarker.to())
                .append(conditionByteCode)
                .append(JMPZ)
                .append(exitMarker.from())
                .append(blockByteCode)
                .append(postExecutionByteCode)
                .append(JMP)
                .append(returnMarker.from())
                .append(exitMarker.to());

        context.exitBlock();

        return byteCode;
    }

}
