package io.github.therealmone.stm32.dsl.bytecode;

import io.github.therealmone.stm32.dsl.scecification.Command;
import lombok.Getter;
import lombok.val;

import java.util.ArrayList;
import java.util.List;

import static io.github.therealmone.stm32.dsl.scecification.Command.isCommand;

public class ByteCode {

    @Getter
    private final List<String> bytecode = new ArrayList<>();

    public ByteCode append(String command) {
        bytecode.add(command);
        return this;
    }

    public ByteCode append(Integer value) {
        bytecode.add(String.valueOf(value));
        return this;
    }

    public ByteCode append(Command command) {
        bytecode.add(command.name());
        return this;
    }

    public ByteCode append(ByteCode anotherByteCode) {
        bytecode.addAll(anotherByteCode.getBytecode());
        return this;
    }

    public Integer size() {
        return bytecode.size();
    }

    public String get(Integer index) {
        return bytecode.get(index);
    }

    @Override
    public String toString() {
        val builder = new StringBuilder();

        for (String code : bytecode) {
            if (isCommand(code)) {
                builder.append(",\n");
            } else {
                builder.append(", ");
            }

            builder.append(code);
        }

        builder.replace(0, 2, "");

        return builder.toString();
    }

}
