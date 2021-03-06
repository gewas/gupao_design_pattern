package com.gupao.designpattern.structural.bridge.message;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 14:22
 */
public class EmailMessage implements IMessage {
    @Override
    public void sendMessage(String content, String to) {
        System.out.println("Send email: <" + content + "> to " + to);
    }
}
