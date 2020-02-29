package com.gupao.designpattern.prototype.deep;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 深克隆
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/29 22:17
 */
public class HttpRequestJson {
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

    public HttpRequestJson deepCloneJson() {
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(this);
        HttpRequestJson clone = gson.fromJson(json, HttpRequestJson.class);
        return clone;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HttpRequestJson request = new HttpRequestJson();
        request.setPath("/hello");
        request.setRemoteIp("127.0.0.1");
        request.setTags(new ArrayList<>());
        long t0 = System.currentTimeMillis();
        HttpRequestJson cloneRequest = request.deepCloneJson();
        long t1 = System.currentTimeMillis();
        cloneRequest.getTags().add("a");
        System.out.println(request);
        System.out.println(cloneRequest);
        System.out.println(request == cloneRequest);
        System.out.println(request.getTags() == cloneRequest.getTags());
        System.out.println(t1 - t0);
    }
}
