package io.github.therealmone.stm32.dsl.scecification;

import lombok.Getter;

@Getter
public enum Command {

    HALT(0),
    ICONST(1),
    IADD(2),
    ISUB(3),
    IMULT(4),
    IDIV(5),
    IMOD(6),
    ICMPRL(7),
    ICMPRG(8),
    ICMPRNE(9),
    ICMPRE(10),
    LEDON(11),
    LEDOFF(12),
    BLINK(13),
    DELAY(14),
    JMP(15),
    JMPZ(16),
    MSTORE(17),
    MLOAD(18),
    IDEC(19),
    IINC(20),
    ISLOUD(21),
    PRINT(22);

    private final Integer code;

    Command(int code) {
        this.code = code;
    }

    public static boolean isCommand(String command) {
        for (Command value : values()) {
            if (value.name().equals(command)) {
                return true;
            }
        }

        return false;
    }
}
