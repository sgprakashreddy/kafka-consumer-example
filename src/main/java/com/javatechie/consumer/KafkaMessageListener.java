package com.javatechie.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger logger= LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "javatechie-demo3",groupId = "jt-group")
    public void consumer1(String message){
        logger.info("Consumer-1 consume the message {} ", message);

    }
    @KafkaListener(topics = "javatechie-demo3",groupId = "jt-group")
    public void consumer2(String message){
        logger.info("Consumer-2 consume the message {} ", message);

    }
    @KafkaListener(topics = "javatechie-demo3",groupId = "jt-group")
    public void consumer3(String message){
        logger.info("Consumer-3 consume the message {} ", message);

    }
    @KafkaListener(topics = "javatechie-demo3",groupId = "jt-group")
    public void consumer4(String message){
        logger.info("Consumer-4 consume the message {} ", message);

    }
    @KafkaListener(topics = "javatechie-demo3",groupId = "jt-group")
    public void consumer5(String message){
        logger.info("Consumer-5 consume the message {} ", message);

    }
    @KafkaListener(topics = "javatechie-demo3",groupId = "jt-group")
    public void consumer6(String message){
        logger.info("Consumer-6 consume the message {} ", message);

    }
}
