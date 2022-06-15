package com.wondertek.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wondertek.pojo.Book;
import com.wondertek.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author: lx
 * @description: ProducerController
 * @date: 2021/07/29
 */
@RestController
public class ProducerController {
    @Autowired
    private SendService sendService;

    @Autowired
    private ObjectMapper objectMapper;

    @RequestMapping("/send/{msg}")
    public String send(@PathVariable("msg") String msg) {
        sendService.sendMsg(msg);
        return "success";
    }

  @RequestMapping("/sendObj")
    public String sendObj() {
        Book book = new Book("1", "《活着》", new Date(), "余华","活着");
        sendService.sendObj(book);
        return "success";
    }

    @RequestMapping("/sendObjJSON")
    public String send() throws JsonProcessingException {
        Book book = new Book("1", "《活着》", new Date(), "余华","活着");
        String boodJSON = objectMapper.writeValueAsString(book);
        sendService.sendObjJSON(boodJSON);
        return "success";
    }
}
