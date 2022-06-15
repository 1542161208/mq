package com.wondertek.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author: lx
 * @description: 输出通道
 * @date: 2021/07/29
 */
public interface MySource {
    // 管道名称为"myOutput"
    String myOutput = "myOutput";

    @Output(myOutput)
    MessageChannel myOutput();
}
