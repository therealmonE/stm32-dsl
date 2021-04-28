package io.github.therealmone.stm32.dsl.bytecode;

import io.github.therealmone.stm32.dsl.compiler.Context;

public interface Converter<T> {

    ByteCode convert(T node, Context context);

}
