package com.gupao.designpattern.structural.bridge.message;

/**
 * 桥
 * <p>
 * 消息紧急分级，P1/P2/P3....
 * <p>
 * 当然也可以将分类作桥分级作组合复用，具体业务具体分析。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 14:24
 */
public abstract class AbstractUrgentMessage {

    protected IMessage message;

    public AbstractUrgentMessage(IMessage message) {
        this.message = message;
    }

    public abstract void sendUrgentMessage(String content, String to);
}
