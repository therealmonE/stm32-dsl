package io.github.therealmone.stm32.dsl.compiler;

import io.github.therealmone.stm32.dsl.bytecode.Marker;
import lombok.Getter;
import lombok.val;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Context {

    private final Stack<Map<String, Integer>> variablesAddresses = new Stack<>();

    @Getter
    private Integer markerCount = 0;

    public Integer defineVariable(String variable) {
        if (variablesAddresses.peek().containsKey(variable)) {
            throw new IllegalStateException("Variable " + variable + " already exists");
        }

        val address = variablesAddresses.peek().size();
        variablesAddresses.peek().put(variable, address);

        return address;
    }

    public Integer getVariableAddress(String variable) {
        if (!variablesAddresses.peek().containsKey(variable)) {
            throw new IllegalStateException("Variable " + variable + " does not exist");
        }

        return variablesAddresses.peek().get(variable);
    }

    @SuppressWarnings("unchecked")
    public void enterBlock() {
        if (variablesAddresses.isEmpty()) {
            variablesAddresses.push(new HashMap<>());
        } else {
            val parentVariables = ((HashMap<String, Integer>) variablesAddresses.peek());

            variablesAddresses.push(((HashMap<String, Integer>) parentVariables.clone()));
        }
    }

    public void exitBlock() {
        variablesAddresses.pop();
    }

    public Marker createMarker() {
        return new Marker(markerCount++);
    }
}
