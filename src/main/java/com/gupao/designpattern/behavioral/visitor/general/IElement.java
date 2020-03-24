package com.gupao.designpattern.behavioral.visitor.general;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/24 21:26
 */
public interface IElement {
    void accept(IVisitor visitor);
}
