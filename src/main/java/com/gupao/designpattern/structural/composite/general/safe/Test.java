package com.gupao.designpattern.structural.composite.general.safe;

/**
 * 组合模式 - 安全方式
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 11:39
 */
public class Test {
    public static void main(String[] args) {
        Composite r1 = new Composite("c:/", 1);
        Composite r2 = new Composite("windows/", 2);
        Composite r3 = new Composite("program files/", 2);
        Composite r4 = new Composite("wps/", 3);
        r1.addChild(r2);
        r1.addChild(r3);
        Component l1 = new Leaf("regedit.exe");
        Component l2 = new Leaf("cmd.exe");
        Component l3 = new Leaf("misc.exe");
        r2.addChild(l1);
        r2.addChild(l2);
        r2.addChild(l3);
        Component l4 = new Leaf("qq.exe");
        r3.addChild(l4);
        r4.addChild(new Leaf("doc.exe"));
        r4.addChild(new Leaf("wpt.exe"));
        r4.addChild(new Leaf("excel.exe"));
        r3.addChild(r4);

        System.out.println(r1.operate());
    }
}
