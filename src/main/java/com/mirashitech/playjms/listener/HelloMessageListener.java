package com.mirashitech.playjms.listener;

import com.mirashitech.playjms.config.JmsConfig;
import com.mirashitech.playjms.model.HelloWorldMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class HelloMessageListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage,
                       @Headers MessageHeaders headers, Message message){
        System.out.println("I got a message");
        System.out.println(helloWorldMessage);
//        throw new RuntimeException("foo");
    }
}
