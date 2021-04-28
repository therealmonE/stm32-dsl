package io.github.therealmone.stm32.dsl.scecification;

import lombok.Getter;

@Getter
public enum Command {

    HALT(1),
    ICONST(2),
    IADD(3),
    ISUB(4),
    IMULT(5),
    IDIV(6),
    IMOD(7),
    ICMPRL(8),
    ICMPRG(9),
    ICMPRNE(10),
    ICMPRE(11),
    LEDON(12),
    LEDOFF(13),
    BLINK(14),
    DELAY(15),
    JMP(16),
    JMPZ(17),
    MSTORE(18),
    MLOAD(19),
    IDEC(20),
    IINC(21),
    ISLOUD(22),
    PRINT(23);

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
