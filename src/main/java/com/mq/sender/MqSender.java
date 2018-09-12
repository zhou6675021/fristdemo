package com.mq.sender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  
public class MqSender {  
  
    @Autowired  
    private RabbitTemplate rabbitTemplate;  
  
    public void send(String queueName, Object msg) {
        this.rabbitTemplate.convertAndSend(queueName, msg);  
    }  
}  
