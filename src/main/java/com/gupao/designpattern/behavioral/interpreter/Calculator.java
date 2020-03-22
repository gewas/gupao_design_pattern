package com.gupao.designpattern.behavioral.interpreter;

import com.gupao.designpattern.behavioral.interpreter.nonterminal.INonTerminalArithmeticInterpreter;
import com.gupao.designpattern.behavioral.interpreter.nonterminal.bracket.IBracketInterpreter;
import com.gupao.designpattern.behavioral.interpreter.nonterminal.operator.IOperatorInterpreter;
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
    private Stack<INonTerminalArithmeticInterpreter> nonTerminalArithmeticInterpreters = new Stack<>();

    public Calculator(String expression) {
        parse(expression);
    }

    private void parse(String expression) {
        String[] symbols = StringUtils.split(expression, " ");
        for (String symbol : symbols) {
            if (ArithmeticInterpreterUtils.isOperator(symbol)) {
                IOperatorInterpreter operator = ArithmeticInterpreterUtils.getOperatorInterpreter(symbol);
                if (!nonTerminalArithmeticInterpreters.empty()) {
                    if (nonTerminalArithmeticInterpreters.peek() instanceof IOperatorInterpreter) {
                        IOperatorInterpreter topOperator = (IOperatorInterpreter) nonTerminalArithmeticInterpreters.peek();
                        // 栈非空则判断优先级
                        if (ArithmeticInterpreterUtils.isPrior(topOperator, operator)) {
                            // 操作符栈顶操作符高优先级，则先执行它的计算
                            calcOperator((IOperatorInterpreter) nonTerminalArithmeticInterpreters.pop());
                        }
                    }
                }
                nonTerminalArithmeticInterpreters.push(operator);
            } else if (ArithmeticInterpreterUtils.isBracket(symbol)) {
                IBracketInterpreter bracket = ArithmeticInterpreterUtils.getBracketInterpreter(symbol);
                if (bracket.isClose()) {
                    calcBrackets(bracket);
                } else {
                    nonTerminalArithmeticInterpreters.push(bracket);
                }
            } else {
                numericInterpreters.push(new NumericInterpreter(symbol));
            }
        }
    }

    /**
     * 执行当前栈顶操作符的计算并将结果压栈
     */
    private void calc() {
        INonTerminalArithmeticInterpreter interpreter = nonTerminalArithmeticInterpreters.pop();
        if (interpreter instanceof IOperatorInterpreter) {
            calcOperator((IOperatorInterpreter) interpreter);
        }
        if (interpreter instanceof IBracketInterpreter) {
            calcBrackets((IBracketInterpreter) interpreter);
        }
    }

    private void calcOperator(IOperatorInterpreter topOperator) {
        INumericInterpreter right = numericInterpreters.pop();
        INumericInterpreter left = numericInterpreters.pop();
        double result = topOperator.interpret(left, right);
        numericInterpreters.push(new NumericInterpreter(result));
    }

    private void calcBrackets(IBracketInterpreter close) {
        while (true) {
            INonTerminalArithmeticInterpreter interpreter = nonTerminalArithmeticInterpreters.pop();
            if (interpreter instanceof IBracketInterpreter) {
                IBracketInterpreter bracket = (IBracketInterpreter) interpreter;
                if (!ArithmeticInterpreterUtils.isBrackets(bracket, close)) {
                    calcBrackets(bracket);
                } else {
                    break;
                }
            } else if (interpreter instanceof IOperatorInterpreter) {
                calcOperator((IOperatorInterpreter) interpreter);
            }
        }
    }

    /**
     * 计算最终结果
     *
     * @return
     */
    public double calculate() {
        while (!nonTerminalArithmeticInterpreters.empty()) {
            calc();
        }
        return numericInterpreters.peek().interpret();
    }
}
