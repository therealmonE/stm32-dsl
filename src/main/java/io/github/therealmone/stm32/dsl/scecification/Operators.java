package io.github.therealmone.stm32.dsl.scecification;

import lombok.experimental.UtilityClass;

import java.util.List;

import static io.github.therealmone.stm32.dsl.scecification.Command.IADD;
import static io.github.therealmone.stm32.dsl.scecification.Command.ICMPRE;
import static io.github.therealmone.stm32.dsl.scecification.Command.ICMPRG;
import static io.github.therealmone.stm32.dsl.scecification.Command.ICMPRL;
import static io.github.therealmone.stm32.dsl.scecification.Command.ICMPRNE;
import static io.github.therealmone.stm32.dsl.scecification.Command.IDIV;
import static io.github.therealmone.stm32.dsl.scecification.Command.IMOD;
import static io.github.therealmone.stm32.dsl.scecification.Command.IMULT;
import static io.github.therealmone.stm32.dsl.scecification.Command.ISUB;

@UtilityClass
public class Operators {

    private static final List<Operator> OPERATORS = List.of(
            new Operator("*", 3, IMULT),
            new Operator("%", 3, IMOD),
            new Operator("/", 3, IDIV),
            new Operator("+", 2, IADD),
            new Operator("-", 2, ISUB),
            new Operator("<", 1, ICMPRL),
            new Operator(">", 1, ICMPRG),
            new Operator("==", 0, ICMPRE),
            new Operator("!=", 0, ICMPRNE),


            new Operator("(", -1, null),
            new Operator(")", -1, null)
    );

    public static int getPriority(String operation) {
        return OPERATORS.stream()
                .filter(op -> op.getValue().equals(operation))
                .findFirst()
                .orElseThrow()
                .getPriority();
    }

    public static Command getCommand(String operation) {
        return OPERATORS.stream()
                .filter(op -> op.getValue().equals(operation))
                .findFirst()
                .orElseThrow()
                .getCommand();
    }

}
