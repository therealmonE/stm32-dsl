package io.github.therealmone.stm32.dsl.bytecode.impl;

import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.PrintExpressionContext;
import io.github.therealmone.stm32.dsl.antlr.string.StringLexer;
import io.github.therealmone.stm32.dsl.antlr.string.StringParser;
import io.github.therealmone.stm32.dsl.bytecode.ByteCode;
import io.github.therealmone.stm32.dsl.bytecode.Converter;
import io.github.therealmone.stm32.dsl.compiler.Context;
import lombok.val;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import static io.github.therealmone.stm32.dsl.antlr.string.StringParser.CHAR;
import static io.github.therealmone.stm32.dsl.antlr.string.StringParser.PLACEHOLDER;
import static io.github.therealmone.stm32.dsl.scecification.Command.PRNTCHR;
import static io.github.therealmone.stm32.dsl.scecification.Command.PRNTVAR;

public class PrintExpressionConverter implements Converter<PrintExpressionContext> {

    @Override
    public ByteCode convert(PrintExpressionContext node, Context context) {
        if (node.CHAR_LITERAL() != null) {
            return convertWithChar(node);
        } else {
            return convertWithString(node, context);
        }
    }

    private ByteCode convertWithChar(PrintExpressionContext node) {
        return new ByteCode()
                .append(PRNTCHR)
                .append((int) node.CHAR_LITERAL().getText().charAt(1));
    }

    private ByteCode convertWithString(PrintExpressionContext node, Context context) {
        val byteCode = new ByteCode();
        val str = node.STRING_LITERAL().getText().replaceAll("\"", "");

        val strLexer = new StringLexer(CharStreams.fromString(str));
        val strTree = new StringParser(new CommonTokenStream(strLexer)).string();

        for (ParseTree child : strTree.children) {
            if (isChar(child)) {
                byteCode.append(PRNTCHR)
                        .append((int) ((TerminalNode) child).getSymbol().getText().charAt(0));
            } else if (isPlaceholder(child)) {
                val placeholder = ((TerminalNode) child).getSymbol().getText();
                val varName = placeholder.substring(2, placeholder.length() - 1);

                byteCode.append(PRNTVAR)
                        .append(context.getVariableAddress(varName));
            } else {
                throw new RuntimeException("Invalid node in string");
            }
        }

        return byteCode;
    }

    private boolean isChar(ParseTree node) {
        return node instanceof TerminalNode && ((TerminalNode) node).getSymbol().getType() == CHAR;
    }

    private boolean isPlaceholder(ParseTree node) {
        return node instanceof TerminalNode && ((TerminalNode) node).getSymbol().getType() == PLACEHOLDER;
    }

}
