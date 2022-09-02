package com.example.demo.common;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Sender {
    @Resource
    private AmqpTemplate rabbitTemplate;
    public   void sendQueue(String msg ) {
        this.rabbitTemplate.convertAndSend(msg);
    }


}
