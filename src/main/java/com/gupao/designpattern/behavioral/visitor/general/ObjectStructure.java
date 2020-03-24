package com.gupao.designpattern.behavioral.visitor.general;

import java.util.ArrayList;
import java.util.List;

/**
 * 结构稳定的数据结构
 * <p>
 * 稳定，指的是IElement类型确定，增/删/改它实现类几率很低。
 * <p>
 * 举例：
 * 数据结构：计算机组成结构，冯诺依曼体系十分稳定。
 * 元素：CPU，主板，内存，外部存储器，IO设备。
 * 访问者：健康状态Visitor，只关注自检是否正常；硬件信息Visitor，只关注生产厂家/生产日期/规格等信息；使用率Visitor，只关注使用率情况。
 * <p>
 * 核心思想——稳定的数据结构（数据结构中有多种元素），（对数据结构中的元素）存在多变的操作行为。
 * 访问者模式，解耦了数据结构与数据操作
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/24 22:09
 */
public class ObjectStructure {

    private List<IElement> elements = new ArrayList<>();

    public void addElement(IElement element) {
        elements.add(element);
    }

    public void removeElement(IElement element) {
        elements.remove(element);
    }

    public void accept(IVisitor visitor) {
        for (IElement element : elements) {
            element.accept(visitor);
        }
    }
}
