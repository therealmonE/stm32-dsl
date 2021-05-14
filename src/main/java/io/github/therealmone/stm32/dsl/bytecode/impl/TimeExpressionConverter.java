package io.github.therealmone.stm32.dsl.bytecode.impl;

import io.github.therealmone.stm32.dsl.antlr.Stm32DSLParser.TimeExpressionContext;
import io.github.therealmone.stm32.dsl.bytecode.ByteCode;
import io.github.therealmone.stm32.dsl.bytecode.Converter;
import io.github.therealmone.stm32.dsl.compiler.Context;
import io.github.therealmone.stm32.dsl.utils.RpnConverter;
import lombok.val;

import java.util.Map;

import static io.github.therealmone.stm32.dsl.scecification.Command.ICONST;
import static io.github.therealmone.stm32.dsl.scecification.Command.IMULT;

public class TimeExpressionConverter implements Converter<TimeExpressionContext> {

    public static final Map<String, Integer> UNIT_MULTIPLIERS = Map.of(
            "ms", 1,
            "s", 1000,
            "m", 1_000_000,
            "h", 1_000_000_000
    );

    @Override
    public ByteCode convert(TimeExpressionContext node, Context context) {
        val byteCode = new ByteCode();
        val unitMultiplier = UNIT_MULTIPLIERS.get(node.TIME_UNIT().getText());

        if (node.NUMBER() != null) {
            byteCode.append(ICONST)
                    .append(node.NUMBER().getText());
        } else {
            val valueByteCode = RpnConverter.convert(node.valueExpressionWithBrackets(), context);

            byteCode.append(valueByteCode);
        }

        if (unitMultiplier != 1) {
            byteCode.append(ICONST)
                    .append(unitMultiplier)
                    .append(IMULT);
        }

        return byteCode;
    }

}
