package io.github.therealmone.stm32.dsl;

import io.github.therealmone.stm32.dsl.compiler.CompilerImpl;
import lombok.val;

public class Main {

    public static final String PROGRAM = """
            script {
                var n = 13
                var result = 1
                
                for (var i = 2; i < (n + 1); i++) {
                    result = result * i
                }
                
                print "${n}! = ${result}"
            }
            """;

    public static void main(String[] args) {
        val compiler = new CompilerImpl();

        System.out.println(compiler.compile(PROGRAM));
    }

}
