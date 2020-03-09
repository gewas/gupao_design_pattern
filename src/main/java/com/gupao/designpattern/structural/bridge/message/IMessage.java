package com.gupao.designpattern.structural.bridge.message;

/**
 * 消息分类，邮件/短信/OA通知
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 14:21
 */
public interface IMessage {

    void sendMessage(String content, String to);
}
