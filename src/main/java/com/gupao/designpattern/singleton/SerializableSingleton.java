package com.gupao.designpattern.singleton;

import java.io.*;

/**
 * 序列化+反序列化 破坏单例的实验。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/27 1:10
 */
public class SerializableSingleton implements Serializable {

    private static final SerializableSingleton INSTANCE = new SerializableSingleton();

    private SerializableSingleton() {
    }

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }


    /**
     * 防止反序列化破坏单例，要加上这个方法，返回单例即可。
     *
     * @return
     */
    private Object readResolve() {
        return INSTANCE;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableSingleton s1 = null;
        SerializableSingleton s2 = SerializableSingleton.getInstance();

        FileOutputStream fos = new FileOutputStream("SerializableSingleton.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s2);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("SerializableSingleton.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        s1 = (SerializableSingleton) ois.readObject();
        ois.close();

        System.out.println(s1);
        System.out.println(s2);
    }
}
