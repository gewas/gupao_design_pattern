package com.gupao.designpattern.behavioral.interpreter;

import com.gupao.designpattern.behavioral.interpreter.nonterminal.IOperatorInterpreter;
import com.gupao.designpattern.behavioral.interpreter.terminal.INumericInterpreter;
import com.gupao.designpattern.behavioral.interpreter.terminal.NumericInterpreter;
import org.apache.commons.lang3.StringUtils;

import java.util.Stack;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/22 13:04
 */
public class Calculator {

    private Stack<INumericInterpreter> numericInterpreters = new Stack<>();
    private Stack<IOperatorInterpreter> operatorInterpreters = new Stack<>();

    public Calculator(String expression) {
        parse(expression);
    }

    private void parse(String expression) {
        String[] symbols = StringUtils.split(expression, " ");
        for (String symbol : symbols) {
            if (ArithmeticInterpreterUtils.isOperator(symbol)) {
                IOperatorInterpreter operator = ArithmeticInterpreterUtils.getOperatorInterpreter(symbol);
                if (!operatorInterpreters.empty()) {
                    // 栈非空则判断优先级
                    if (ArithmeticInterpreterUtils.isPrior(operatorInterpreters.peek(), operator)) {
                        // 操作符栈顶操作符高优先级，则先执行它的计算
                        calcTopAndPush();
                    }
                }
                operatorInterpreters.push(operator);
            } else {
                numericInterpreters.push(new NumericInterpreter(symbol));
            }
        }
    }

    /**
     * 执行当前栈顶操作符的计算并将结果压栈
     */
    private void calcTopAndPush() {
        IOperatorInterpreter topOperator = operatorInterpreters.pop();
        INumericInterpreter right = numericInterpreters.pop();
        INumericInterpreter left = numericInterpreters.pop();
        double result = topOperator.interpret(left, right);
        numericInterpreters.push(new NumericInterpreter(result));
    }

    public double calculate() {
        while (!operatorInterpreters.empty()) {
            calcTopAndPush();
        }
        return numericInterpreters.peek().interpret();
    }
}
