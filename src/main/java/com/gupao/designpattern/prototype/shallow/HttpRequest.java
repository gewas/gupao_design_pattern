package com.gupao.designpattern.prototype.shallow;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式，不用构造器而是通过实例的方法克隆出新的实例。
 * 可以隐藏大量的繁琐构建细节。让客户端代码优雅。
 * <p>
 * 1.原型模式-浅克隆
 * <p>
 * 实现Cloneable接口，都是浅克隆。
 * 浅克隆无法对毫无克隆准备的引用类型对象（String不算）做到真的克隆，只是复制了一个指针。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/29 22:17
 */
public class HttpRequest implements Cloneable {
    private String remoteIp;
    private String path;
    private List<String> tags;

    public String getRemoteIp() {
        return remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "remoteIp='" + remoteIp + '\'' +
                ", path='" + path + '\'' +
                ", tags=" + tags +
                '}';
    }

    @Override
    protected HttpRequest clone() throws CloneNotSupportedException {
        return (HttpRequest) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        HttpRequest request = new HttpRequest();
        request.setPath("/hello");
        request.setRemoteIp("127.0.0.1");
        request.setTags(new ArrayList<>());

        HttpRequest cloneRequest = request.clone();
        cloneRequest.getTags().add("a");
        System.out.println(request);
        System.out.println(cloneRequest);
        System.out.println(request == cloneRequest);
        System.out.println(request.getTags() == cloneRequest.getTags());
    }
}
