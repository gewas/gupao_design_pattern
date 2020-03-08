package com.gupao.designpattern.composite.general.transparent;

/**
 * 叶子节点
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 10:58
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public String operate() {
        return name;
    }
}
