package com.gupao.designpattern.creational.prototype.deep;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 2.原型模式-深克隆（内存中序列化反序列化）
 * 通过序列化手段达到真正的克隆。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/29 22:17
 */
public class HttpRequest implements Serializable {
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

    public HttpRequest deepCloneSerialization() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        HttpRequest clone = (HttpRequest) ois.readObject();

        oos.close();
        ois.close();

        return clone;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HttpRequest request = new HttpRequest();
        request.setPath("/hello");
        request.setRemoteIp("127.0.0.1");
        request.setTags(new ArrayList<>());
        long t0 = System.currentTimeMillis();
        HttpRequest cloneRequest = request.deepCloneSerialization();
        long t1 = System.currentTimeMillis();
        cloneRequest.getTags().add("a");
        System.out.println(request);
        System.out.println(cloneRequest);
        System.out.println(request == cloneRequest);
        System.out.println(request.getTags() == cloneRequest.getTags());
        System.out.println(t1 - t0);
    }
}
