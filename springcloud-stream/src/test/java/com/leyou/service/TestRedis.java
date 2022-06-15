package com.leyou.service;

import com.wondertek.pojo.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @author lx
 * @description
 * @date 2021/08/05
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestRedis {
//    @Autowired
//    RedisTemplate redisTemplate;
    @Test
    public void testRedis(){
        Book book = new Book("001","《活着》",new Date(),"余华","活着的意义");
    }
}