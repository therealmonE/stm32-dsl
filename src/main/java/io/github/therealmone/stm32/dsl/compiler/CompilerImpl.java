package io.github.therealmone.stm32.dsl.compiler;

import io.github.therealmone.stm32.dsl.antlr.Stm32DSLLexer;
import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser;
import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.ScriptContext;
import io.github.therealmone.stm32.dsl.bytecode.impl.BlockConverter;
import io.github.therealmone.stm32.dsl.utils.ByteCodeUtils;
import lombok.val;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import static io.github.therealmone.stm32.dsl.scecification.Command.HALT;

public class CompilerImpl implements Compiler {

    @Override
    public String compile(String dsl) {
        val script = parse(dsl);
        val byteCode = new BlockConverter().convert(script.block(), new Context());

        byteCode.append(HALT);
        ByteCodeUtils.processMarkers(byteCode);

        return byteCode.toString();
    }

    private ScriptContext parse(String dsl) {
        val lexer = new Stm32DSLLexer(CharStreams.fromString(dsl));
        val parser = new Stm32DSLParser(new CommonTokenStream(lexer));

        return parser.script();
    }

}
