package com.wondertek.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: lx
 * @description: 直连交换机
 * @date: 2021/07/19
 */
@Configuration
public class DirectRabbitConfig {
    /**
     * 创建队列
     * durable:是否持久化,默认是false。持久化队列：会被存储在磁盘上,当消息代理重启时仍然存在。暂存队列：当前连接有效
     * exclusive:默认是false,只能被当前创建的连接使用,而且当连接关闭后队列即被删除。此参考优先级高于durable
     * autoDelete:是否自动删除,当没有生产者或者消费者使用此队列,该队列会自动删除。
     */
    @Bean
    public Queue testDirectQueue() {
        // return new Queue("TestDirectQueue",true,true,false);
        // 一般设置一下队列的持久化就好,其余两个就是默认false
        return new Queue("testDirectQueue", true);
    }

    /**
     * 创建交换机,交换机名TestDirectExchange(直连交换机)
     */
    @Bean
    DirectExchange testDirectExchange() {
        // return new DirectExchange("TestDirectExchange",true,true);
        return new DirectExchange("testDirectExchange", true, false);
    }

    // 队列绑定交换机,并设置用于匹配键:TestDirectRouting
    @Bean
    Binding bindingDirect() {
        return BindingBuilder.bind(testDirectQueue()).to(testDirectExchange()).with("testDirectRouting");
    }

    /**
     * 创建一个交换机不绑定队列
     */
    @Bean
    DirectExchange lonelyDirectExchange() {
        return new DirectExchange("lonelyDirectExchange");
    }
}
