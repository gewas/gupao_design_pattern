package com.gupao.designpattern.composite.general.safe;

/**
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 11:35
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
