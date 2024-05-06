package com.navr.demo.rabbitmqdemo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);

    @RabbitListener(queues = {"${rabbitmqdemo.queue.name}"})
    public void consumeMessage(String message) {
        LOGGER.info(String.format("MessageConsumer consumed new message -> %s", message));
    }
}
