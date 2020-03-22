package com.gupao.designpattern.behavioral.interpreter.nonterminal;

import com.gupao.designpattern.behavioral.interpreter.terminal.INumericInterpreter;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/22 12:32
 */
public interface IOperatorInterpreter {

    double interpret(INumericInterpreter left, INumericInterpreter right);

    /**
     * 数值越大越优先
     *
     * @return 操作符优先级
     */
    int getPriority();
}
