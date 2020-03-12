package com.gupao.designpattern.behavioral.template.general;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/12 20:55
 */
public class TemplateB extends AbstractTemplate {

    @Override
    protected boolean needMiddle() {
        return true;
    }
}
