package io.github.therealmone.stm32.dsl.scecification;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Operator {

    private String value;
    private Integer priority;
    private Command command;

}
