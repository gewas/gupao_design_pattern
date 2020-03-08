package com.gupao.designpattern.structural.composite.general.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * todo 简要信息
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 11:35
 */
public class Composite extends Component {

    private int level;
    private List<Component> components;

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

    public boolean addChild(Component component) {
        return components.add(component);
    }

    public boolean removeChild(Component component) {
        return components.remove(component);
    }

    public Component getChild(int index) {
        return components.get(index);
    }
}
