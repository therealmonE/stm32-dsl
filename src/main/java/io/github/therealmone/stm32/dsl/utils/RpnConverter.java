package io.github.therealmone.stm32.dsl.utils;

import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.UnaryExpressionContext;
import io.github.therealmone.stm32.dsl.bytecode.ByteCode;
import io.github.therealmone.stm32.dsl.bytecode.impl.UnaryExpressionConverter;
import io.github.therealmone.stm32.dsl.compiler.Context;
import lombok.experimental.UtilityClass;
import lombok.val;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;

import static io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.EQUALITY_OP;
import static io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.IS_LOUD_KW;
import static io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.NUMBER;
import static io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.OP;
import static io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.RELATIONAL_OP;
import static io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.VAR;
import static io.github.therealmone.stm32.dsl.scecification.Command.ICONST;
import static io.github.therealmone.stm32.dsl.scecification.Command.ISLOUD;
import static io.github.therealmone.stm32.dsl.scecification.Command.MLOAD;
import static io.github.therealmone.stm32.dsl.scecification.Operators.getCommand;
import static io.github.therealmone.stm32.dsl.scecification.Operators.getPriority;

@UtilityClass
public class RpnConverter {

    public static ByteCode convert(ParseTree node, Context context) {
        val stack = new Stack<String>();
        val rpn = new ByteCode();

        process(node, stack, rpn, context);

        while (!stack.isEmpty()) {
            rpn.append(getCommand(stack.pop()));
        }

        return rpn;
    }

    private static void process(ParseTree node, Stack<String> stack, ByteCode rpn, Context context) {
        if (node instanceof UnaryExpressionContext) {
            processUnaryOperation(((UnaryExpressionContext) node), stack, rpn, context);
        } else if (node instanceof RuleNode) {
            processRuleNode((RuleNode) node, stack, rpn, context);
        } else if (node instanceof TerminalNode) {
            processTerminalNode((TerminalNode) node, stack, rpn, context);
        }
    }

    private static void processUnaryOperation(UnaryExpressionContext node, Stack<String> stack, ByteCode rpn, Context context) {
        val unaryExpressionBytecode = new UnaryExpressionConverter().convert(node, context);

        if (node.prefixExpression() != null) {
            rpn.append(unaryExpressionBytecode)
                    .append(MLOAD)
                    .append(context.getVariableAddress(node.prefixExpression().VAR().getText()));
        } else if (node.postfixExpression() != null) {
            rpn.append(MLOAD)
                    .append(context.getVariableAddress(node.postfixExpression().VAR().getText()))
                    .append(unaryExpressionBytecode);
        } else {
            throw new RuntimeException("Unknown unary operation");
        }
    }

    private static void processRuleNode(RuleNode node, Stack<String> stack, ByteCode rpn, Context context) {
        for (int i = 0; i < node.getChildCount(); i++) {
            process(node.getChild(i), stack, rpn, context);
        }
    }

    private static void processTerminalNode(TerminalNode node, Stack<String> stack, ByteCode rpn, Context context) {
        if (isVar(node)) {
            rpn.append(MLOAD)
                    .append(context.getVariableAddress(node.getText()));
        } else if (isNumber(node)) {
            rpn.append(ICONST)
                    .append(node.getText());
        } else if (isLoudOp(node)) {
            rpn.append(ISLOUD);
        } else if (isOp(node)) {
            while (!stack.isEmpty() && getPriority(stack.peek()) > getPriority(node.getText())) {
                rpn.append(getCommand(stack.pop()));
            }

            stack.push(node.getText());
        } else if (node.getText().equals("(")) {
            stack.push(node.getText());
        } else if (node.getText().equals(")")) {
            while (!stack.peek().equals("(")) {
                rpn.append(getCommand(stack.pop()));
            }

            stack.pop();
        }
    }

    private static boolean isVar(ParseTree node) {
        return isTerminal(node, VAR);
    }

    private static boolean isNumber(ParseTree node) {
        return isTerminal(node, NUMBER);
    }

    private static boolean isLoudOp(ParseTree node) {
        return isTerminal(node, IS_LOUD_KW);
    }

    private static boolean isOp(ParseTree node) {
        return isTerminal(node, OP)
                || isTerminal(node, RELATIONAL_OP)
                || isTerminal(node, EQUALITY_OP);
    }

    private static boolean isTerminal(ParseTree node, Integer terminal) {
        return node instanceof TerminalNode && ((TerminalNode) node).getSymbol().getType() == terminal;
    }

}
