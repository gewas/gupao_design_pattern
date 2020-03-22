package com.gupao.designpattern.behavioral.interpreter.nonterminal.operator;

import com.gupao.designpattern.behavioral.interpreter.terminal.INumericInterpreter;

/**
 * 除法
 * <p>
 * 非终结符表达式
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/22 12:41
 */
public class DivInterpreter implements IOperatorInterpreter {

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    public double interpret(INumericInterpreter left, INumericInterpreter right) {
        return left.interpret() / right.interpret();
    }
}
