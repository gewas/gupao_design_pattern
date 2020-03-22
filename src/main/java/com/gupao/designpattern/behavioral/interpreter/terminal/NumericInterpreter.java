package com.gupao.designpattern.behavioral.interpreter.terminal;

/**
 * 数字
 * <p>
 * 终结符表达式
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/22 12:39
 */
public class NumericInterpreter implements INumericInterpreter {

    private double value;

    public NumericInterpreter(String symbol) {
        this.value = Double.parseDouble(symbol);
    }

    public NumericInterpreter(double value) {
        this.value = value;
    }

    @Override
    public double interpret() {
        return value;
    }
}
