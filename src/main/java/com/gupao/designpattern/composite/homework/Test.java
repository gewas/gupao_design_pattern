package com.gupao.designpattern.composite.homework;

/**
 * 用组合模式实现一个无限级扩展的树
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 15:14
 */
public class Test {
    public static void main(String[] args) {
        TrunkNode html = new TrunkNode("html", "", 0);

        TrunkNode head = new TrunkNode("head", "", 1);
        TrunkNode body = new TrunkNode("body", "body!body!body!body!body!", 1);
        html.addNode(head);
        html.addNode(body);

        head.addNode(new LeafNode("meta", "").addProperty("charset", "utf-8"));
        head.addNode(new LeafNode("title", "hello world"));

        body.addNode(new LeafNode("h1", "这是一级标题"));
        body.addNode(new LeafNode("h2", "这是二级标题"));
        body.addNode(new LeafNode("a", "").addProperty("href", "http://www.baidu.com"));
        body.addNode(new LeafNode("script", "(function());").addProperty("type", "text/javascript").addProperty("kkk", "vvv"));

        TrunkNode form = (TrunkNode) new TrunkNode("form", "", 2).addProperty("action", "");
        form.addNode(new LeafNode("input", "").addProperty("type", "text").addProperty("id", "name"));
        form.addNode(new LeafNode("input", "").addProperty("type", "text").addProperty("id", "age"));
        form.addNode(new LeafNode("input", "").addProperty("type", "text").addProperty("id", "gender"));
        body.addNode(form);

        System.out.println(html.getInfo());
    }
}
