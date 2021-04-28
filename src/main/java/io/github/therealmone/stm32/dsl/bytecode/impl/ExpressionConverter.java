package io.github.therealmone.stm32.dsl.bytecode.impl;

import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.ExpressionContext;
import io.github.therealmone.stm32.dsl.bytecode.ByteCode;
import io.github.therealmone.stm32.dsl.bytecode.Converter;
import io.github.therealmone.stm32.dsl.compiler.Context;

public class ExpressionConverter implements Converter<ExpressionContext> {

    @Override
    public ByteCode convert(ExpressionContext node, Context context) {
        if (node.varExpression() != null) {
            return new VarExpressionConverter().convert(node.varExpression(), context);
        }

        if (node.whileExpression() != null) {
            return new WhileExpressionConverter().convert(node.whileExpression(), context);
        }

        if (node.assignExpression() != null) {
            return new AssignExpressionConverter().convert(node.assignExpression(), context);
        }

        if (node.blinkExpression() != null) {
            return new BlinkExpressionConverter().convert(node.blinkExpression(), context);
        }

        if (node.ifExpression() != null) {
            return new IfExpressionConverter().convert(node.ifExpression(), context);
        }

        if (node.ledOnExpression() != null) {
            return new LedOnExpressionConverter().convert(node.ledOnExpression(), context);
        }

        if (node.ledOffExpression() != null) {
            return new LedOffExpressionConverter().convert(node.ledOffExpression(), context);
        }

        if (node.delayExpression() != null) {
            return new DelayExpressionConverter().convert(node.delayExpression(), context);
        }

        if (node.printExpression() != null) {
            return new PrintExpressionConverter().convert(node.printExpression(), context);
        }

        if (node.unaryExpression() != null) {
            return new UnaryExpressionConverter().convert(node.unaryExpression(), context);
        }

        if (node.forExpression() != null) {
            return new ForExpressionConverter().convert(node.forExpression(), context);
        }

        throw new RuntimeException();
    }

}
