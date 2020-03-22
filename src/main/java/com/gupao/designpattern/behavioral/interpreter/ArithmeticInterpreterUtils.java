package com.gupao.designpattern.behavioral.interpreter;

import com.gupao.designpattern.behavioral.interpreter.nonterminal.*;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/22 13:09
 */
public class ArithmeticInterpreterUtils {

    private ArithmeticInterpreterUtils() {
    }

    public static boolean isOperator(String symbol) {
        return "+".equals(symbol) ||
                "-".equals(symbol) ||
                "*".equals(symbol) ||
                "/".equals(symbol);
    }

    public static IOperatorInterpreter getOperatorInterpreter(String symbol) {
        switch (symbol) {
            case "+":
                return new AddInterpreter();
            case "-":
                return new SubInterpreter();
            case "*":
                return new MulInterpreter();
            case "/":
                return new DivInterpreter();
            default:
                return null;
        }
    }

    public static boolean isPrior(IOperatorInterpreter o1, IOperatorInterpreter o2) {
        return o1.getPriority() - o2.getPriority() > 0;
    }
}
