package com.wondertek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: lx
 * @description: 启动类
 * @date: 2021/07/19
 */
@SpringBootApplication
@EnableEurekaClient
public class KafkaProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaProviderApplication.class,args);
    }
}

