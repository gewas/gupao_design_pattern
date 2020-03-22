package com.gupao.designpattern.behavioral.interpreter.nonterminal;

import com.gupao.designpattern.behavioral.interpreter.terminal.INumericInterpreter;

/**
 * 加法
 * <p>
 * 非终结符表达式
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/22 12:41
 */
public class AddInterpreter implements IOperatorInterpreter {

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public double interpret(INumericInterpreter left, INumericInterpreter right) {
        return left.interpret() + right.interpret();
    }
}
