package com.gupao.designpattern.behavioral.state.general;

/**
 * 状态模式
 * <p>
 * 当对象的行为与对象内部状态绑定时，使用该模式可以显著减少分支代码的出现。
 * <p>
 * 实例只是很简单的模式实现，记住核心思想：将状态和行为绑定，客户端代码只需要调用执行并不需要关注实现逻辑。
 * 状态间的切换通常也不会如main方法中这样由客户端来操作，而是根据一套规则：A状态下执行了x()，就自动切换状态到B。
 * 有了配套状态流转规则后，就可以称之为状态机模式。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/21 18:57
 */
public class Test {

    public static void main(String[] args) {
        Context context = new Context();
        context.action();
        context.setState(Context.STATE_B);
        context.action();
    }
}
