package com.gupao.designpattern.behavioral.interpreter.nonterminal.bracket;

/**
 * ( or )
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/22 15:18
 */
public class ParenInterpreter implements IBracketInterpreter {

    private boolean close;

    public ParenInterpreter() {
    }

    public ParenInterpreter(boolean close) {
        this.close = close;
    }

    @Override
    public boolean isClose() {
        return close;
    }

    @Override
    public int getPriority() {
        return 2;
    }
}
