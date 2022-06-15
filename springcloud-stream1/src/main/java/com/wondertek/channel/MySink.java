package com.wondertek.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

/**
 * @author: lx
 * @description: 输入管道接口
 * @date: 2021/07/29
 */
public interface MySink {
    // 管道名称为"myInput"
    String myInput = "myInput";

    // 绑定输入管道
    @Input(myInput)
    MessageChannel myInput();
}
