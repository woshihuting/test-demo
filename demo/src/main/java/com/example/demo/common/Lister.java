package com.example.demo.common;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

import java.io.UnsupportedEncodingException;


public class Lister  implements MessageListener {

    @Override
    public void onMessage(Message message) {
        try {
            System.out.print("receive msg: "+new String(message.getBody(),"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
