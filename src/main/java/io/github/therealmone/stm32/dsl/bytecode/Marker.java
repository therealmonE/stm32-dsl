package io.github.therealmone.stm32.dsl.bytecode;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import static java.lang.Integer.valueOf;

@RequiredArgsConstructor
public class Marker {

    @Getter
    private final Integer value;

    public String to() {
        return "@" + value;
    }

    public String from() {
        return "!@" + value;
    }

    public static boolean isToMarker(String value) {
        return value.startsWith("@");
    }

    public static boolean isFromMarker(String value) {
        return value.startsWith("!@");
    }

    public static Marker parse(String value) {
        return new Marker(valueOf(value.substring(value.startsWith("!") ? 2 : 1)));
    }

}
