package io.github.therealmone.stm32.dsl;

import io.github.therealmone.stm32.dsl.compiler.CompilerImpl;
import lombok.val;

public class Main {

    public static final String PROGRAM = """
            script {
                var i = 10
                blink (i * 10)h
            }
            """;

    public static void main(String[] args) {
        val compiler = new CompilerImpl();

        System.out.println(compiler.compile(PROGRAM));
    }

}
