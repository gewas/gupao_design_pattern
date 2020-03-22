package com.gupao.designpattern.behavioral.interpreter;

import com.gupao.designpattern.behavioral.interpreter.nonterminal.bracket.BraceInterpreter;
import com.gupao.designpattern.behavioral.interpreter.nonterminal.bracket.BracketInterpreter;
import com.gupao.designpattern.behavioral.interpreter.nonterminal.bracket.IBracketInterpreter;
import com.gupao.designpattern.behavioral.interpreter.nonterminal.bracket.ParenInterpreter;
import com.gupao.designpattern.behavioral.interpreter.nonterminal.operator.*;

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

    public static boolean isBracket(String symbol) {
        return "(".equals(symbol) ||
                ")".equals(symbol) ||
                "[".equals(symbol) ||
                "]".equals(symbol) ||
                "{".equals(symbol) ||
                "}".equals(symbol);
    }

    public static IBracketInterpreter getBracketInterpreter(String symbol) {
        switch (symbol) {
            case "(":
                return new ParenInterpreter();
            case ")":
                return new ParenInterpreter(true);
            case "[":
                return new BracketInterpreter();
            case "]":
                return new BracketInterpreter(true);
            case "{":
                return new BraceInterpreter();
            case "}":
                return new BraceInterpreter(true);
            default:
                return null;
        }
    }

    /**
     * 判断是否为一对括号
     *
     * @param open  左括号
     * @param close 右括号
     * @return
     */
    public static boolean isBrackets(IBracketInterpreter open, IBracketInterpreter close) {
        return !open.isClose() && close.isClose() && open.getPriority() == close.getPriority();
    }

    public static boolean isPrior(IOperatorInterpreter o1, IOperatorInterpreter o2) {
        return o1.getPriority() - o2.getPriority() > 0;
    }

    public static boolean isPrior(IBracketInterpreter b1, IBracketInterpreter b2) {
        return b1.getPriority() - b2.getPriority() > 0;
    }
}
