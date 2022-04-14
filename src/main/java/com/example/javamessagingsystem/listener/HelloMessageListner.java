package com.example.javamessagingsystem.listener;

import com.example.javamessagingsystem.config.JmsConfig;
import com.example.javamessagingsystem.model.HelloWorldMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * Created by yera soni on 2022-04-14.
 */
@Component
public class HelloMessageListner {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage,
                       @Headers MessageHeaders headers, HelloWorldMessage message){

        System.out.println("I Got a Message!!!!!");

        System.out.println(helloWorldMessage);


        // uncomment and view to see retry count in debugger
        // throw new RuntimeException("foo");

    }

}