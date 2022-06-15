package com.wondertek.service;

import com.wondertek.channel.MySource;
import com.wondertek.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @author: lx
 * @description: SendService
 * @date: 2021/07/29
 */
@EnableBinding(MySource.class)
public class SendService {
    @Autowired
    private MySource mySource;

    public void sendMsg(String msg) {
        mySource.myOutput().send(MessageBuilder.withPayload(msg).build());
    }

    public void sendObj(Book book) {
        mySource.myOutput().send(MessageBuilder.withPayload(book).build());
    }

      public void sendObjJSON(String objJSON) {
        mySource.myOutput().send(MessageBuilder.withPayload(objJSON).
                setHeader("partitionKey",0).build());
    }
}
