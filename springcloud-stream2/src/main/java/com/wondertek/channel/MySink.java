package com.wondertek.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

/**
 * @author: lx
 * @description: Sink
 * @date: 2021/07/29
 */
public interface MySink {
    // 管道名称为"myInput"
    String myInput = "myInput";

    @Input(myInput)
    MessageChannel myInput();
}
