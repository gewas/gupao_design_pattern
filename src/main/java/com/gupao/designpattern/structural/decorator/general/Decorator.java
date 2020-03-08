package com.gupao.designpattern.structural.decorator.general;

/**
 * 装饰器
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/4 21:40
 */
public abstract class Decorator extends Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }
}
