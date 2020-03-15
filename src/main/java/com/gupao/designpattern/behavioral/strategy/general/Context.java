package com.gupao.designpattern.behavioral.strategy.general;

/**
 * 上下文环境
 * <p>
 * 客户端只需与上下文交互（选择某一策略），无需关心具体策略的细节。
 * <p>
 * 通常，可以让上下文持有一个默认策略，在用户不关心用那种策略时也能够保障执行。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/15 13:58
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm() {
        strategy.algorithm();
    }
}
