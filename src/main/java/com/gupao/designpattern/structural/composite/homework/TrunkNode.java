package com.gupao.designpattern.structural.composite.homework;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 15:27
 */
public class TrunkNode extends AbstractNode {

    private List<AbstractNode> nodes;
    private int level;

    public TrunkNode(String name, String value, int level) {
        super(name, value);
        this.level = level;
        nodes = new ArrayList<>(16);
    }

    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder().append(getHead()).append("\n");
        if (StringUtils.isNotBlank(value)) {
            sb.append(getLevelPrefix(level + 1)).append(value).append("\n");
        }
        for (AbstractNode node : nodes) {
            sb.append(getLevelPrefix(level + 1)).append(node.getInfo())
                    .append("\n");
        }
        sb.append(getLevelPrefix(level)).append(getTail()).append("\n");
        return sb.toString();
    }

    private String getLevelPrefix(int level) {
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < level; i++) {
            prefix.append("\t");
        }
        return prefix.toString();
    }

    public boolean addNode(AbstractNode node) {
        return nodes.add(node);
    }

    public boolean removeNode(AbstractNode node) {
        return nodes.remove(node);
    }

    public AbstractNode getNode(int index) {
        return nodes.get(index);
    }
}
