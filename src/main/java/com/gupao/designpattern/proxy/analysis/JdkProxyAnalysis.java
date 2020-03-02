package com.gupao.designpattern.proxy.analysis;

import com.gupao.designpattern.proxy.dynamic.jdk.IUserService;
import com.gupao.designpattern.proxy.dynamic.jdk.LoggerProxy;
import com.gupao.designpattern.proxy.dynamic.jdk.UserService;
import sun.misc.ProxyGenerator;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Jdk动态代理 获取字节码分析
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/1 22:53
 */
public class JdkProxyAnalysis {
    public static void main(String[] args) {
        // 获取$Proxy0
        getProxyClassFile(new Class[]{ICommentService.class}, "./$Proxy0.class");
    }

    private static void getProxyClassFile(Class<?>[] interfaces, String filepath) {
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy", interfaces);
        try (FileOutputStream outputStream = new FileOutputStream(filepath)) {
            outputStream.write(bytes);
            outputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
