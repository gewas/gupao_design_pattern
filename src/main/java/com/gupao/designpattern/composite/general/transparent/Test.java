package com.gupao.designpattern.composite.general.transparent;

/**
 * 组合模式 - 透明方式
 * <p>
 * 树枝节点和叶子节点都继承统一抽象类，方法统一定义在抽象类中。
 * <p>
 * 但这会造成客户端能够错误的调用叶子节点的默认实现方法，造成困扰。
 * <p>
 * 因为叶子节点和树枝节点功能上的确是有区分的。
 * <p>
 * 这就需要参考一下safe方式
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 11:09
 */
public class Test {
    public static void main(String[] args) {
        Component r1 = new Composite("C:/", 1);
        Component c1 = new Leaf("windows");
        Component c2 = new Leaf("program files");
        r1.addChild(new Leaf("notepad.exe"));
        r1.addChild(new Leaf("draw.exe"));
        Component r2 = new Composite("Office/", 2);
        r2.addChild(new Leaf("word.exe"));
        r2.addChild(new Leaf("ppt.exe"));
        r2.addChild(new Leaf("excel.exe"));
        r1.addChild(r2);
        System.out.println(r1.operate());
    }
}
