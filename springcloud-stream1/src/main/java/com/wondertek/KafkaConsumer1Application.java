package com.wondertek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: lx
 * @description: 启动类
 * @date: 2021/07/19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class KafkaConsumer1Application {
    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumer1Application.class, args);
    }
}