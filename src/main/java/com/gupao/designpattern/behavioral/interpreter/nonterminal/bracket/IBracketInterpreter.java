package com.gupao.designpattern.behavioral.interpreter.nonterminal.bracket;

import com.gupao.designpattern.behavioral.interpreter.nonterminal.INonTerminalArithmeticInterpreter;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/22 15:14
 */
public interface IBracketInterpreter extends INonTerminalArithmeticInterpreter {

    /**
     * @return 是否是闭括号
     */
    boolean isClose();

    /**
     * 数字越高越优先
     *
     * @return 优先级
     */
    int getPriority();
}
