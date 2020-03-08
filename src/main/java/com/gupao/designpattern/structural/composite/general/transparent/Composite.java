package com.gupao.designpattern.structural.composite.general.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 10:58
 */
public class Composite extends Component {

    private List<Component> components;
    private int level;

    public Composite(String name, int level) {
        super(name);
        this.level = level;
        components = new ArrayList<>(16);
    }

    @Override
    public String operate() {
        StringBuilder builder = new StringBuilder(this.name);

        for (Component c : components) {
            builder.append("\n");
            for (int i = 0; i < level; i++) {
                builder.append("\t");
            }
            builder.append(c.operate());
        }
        return builder.toString();
    }


    @Override
    public boolean addChild(Component component) {
        return components.add(component);
    }

    @Override
    public boolean removeChild(Component component) {
        return components.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return components.get(index);
    }
}
