package com.wondertek.config;

import com.wondertek.receiver.MyAckReceiver;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: lx
 * @description: 监听信息发送配置类
 * @date: 2021/07/20
 */
@Configuration
public class MessageListenerConfig {

    @Autowired
    private CachingConnectionFactory connectionFactory;

    // 消息接收处理类
    @Autowired
    private MyAckReceiver myAckReceiver;

    /**
     * ConcurrentConsumers:并发消费者
     * ConcurrentConsumers:最大并发消费者
     * Acknowledge:承认,告知已收到
     * MANUAL:手动
     * AUTO:自动
     */
    @Bean
    public SimpleMessageListenerContainer simpleMessageListenerContainer() {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory);
        container.setConcurrentConsumers(1);
        container.setMaxConcurrentConsumers(1);
        // RabbitMQ默认是自动确认,这里改为手动确认消息
        container.setAcknowledgeMode(AcknowledgeMode.MANUAL);
        // 设置一个队列
//        container.setQueueNames("testDirectQueue");
        // 如果同时设置多个如下:前提是队列都是必须已经创建存在的
        container.setQueueNames("testDirectQueue", "fanout.A");

//        //另一种设置队列的方法,如果使用这种情况,那么要设置多个,就使用addQueues
//        container.setQueues(new Queue("TestDirectQueue",true));
//        container.addQueues(new Queue("TestDirectQueue2",true));
//        container.addQueues(new Queue("TestDirectQueue3",true));

        container.setMessageListener(myAckReceiver);

        return container;
    }
}
