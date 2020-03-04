package com.gupao.designpattern.decorator.general;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/4 21:39
 */
public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        System.out.println("ConcreteComponent.operate()");
    }
}
