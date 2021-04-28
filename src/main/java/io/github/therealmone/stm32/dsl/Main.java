package io.github.therealmone.stm32.dsl;

import io.github.therealmone.stm32.dsl.compiler.CompilerImpl;
import lombok.val;

public class Main {

    public static final String PROGRAM = """
            script {
                while (1) {
                    if (isloud) {
                        print "Too loud!\n"
            
                        for (var i = 0; i < 5; i++) {
                            blink 1000000
                            delay 1000000
                        }
                    }
                }
            }
            """;

    public static void main(String[] args) {
        val compiler = new CompilerImpl();

        System.out.println(compiler.compile(PROGRAM));
    }

}
