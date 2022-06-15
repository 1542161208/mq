package com.wondertek.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wondertek.channel.MySink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import java.io.IOException;

/**
 * @author: lx
 * @description: 消息接收类
 * @date: 2021/07/29
 */
@EnableBinding(MySink.class)
public class RecieveService {

    @Autowired
    private ObjectMapper objectMapper;

/*    @StreamListener(MySink.myInput)
    public void recieve(String payload) {
        System.out.println(payload);
    }*/

/*    @StreamListener(MySink.myInput)
    public void recieve(Book book) {
        System.out.println(book);
    }*/

    @StreamListener(MySink.myInput)
    public void recieve(String book) throws IOException {
        System.out.println("接收者1:" + book);
    }
}
