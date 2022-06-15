package com.wondertek.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author: lx
 * @description: 消费
 * @date: 2021/07/19
 */
@Component
// 监听的队列名称 TestDirectQueue
@RabbitListener(queues = "testDirectQueue")
public class DirectReceiver {
    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("DirectReceiver消费者收到消息  : " + testMessage.toString());
    }
}
