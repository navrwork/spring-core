package com.navr.demo.rabbitmqdemo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    // Below objects are automatically created
    // by the Spring Boot container.
    // We just need to inject and make use of it.
    //
    // ConnectionFactory
    // RabbitTemplate
    // RabbitAdmin
    //

    @Value("${rabbitmqdemo.queue.name}")
    private String queueName;

    @Value("${rabbitmqdemo.exchange.name}")
    private String exchangeName;

    @Value("${rabbitmqdemo.routing.key}")
    private String routingKey;

    public Queue queue() {
        return new Queue(queueName);
    }

    public TopicExchange topicExchange() {
        return new TopicExchange(exchangeName);
    }

    public Binding binding() {
        return BindingBuilder
                .bind(queue())
                .to(topicExchange())
                .with(routingKey);
    }
}
