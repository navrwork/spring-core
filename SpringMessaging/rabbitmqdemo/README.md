# Spring Boot And Rabbit MQ - Demo App

## Rabbit MQ

### RabbitMQ Setup
* Download RabbitMQ image from Docker hub
* Use Docker Desktop and run the image. Make sure to map 5672 and 15672 ports when you run the image.
* Reference command to run the image from CLI: 
  * docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.13.2-management


### RabbitMQ Management Console
* Console: http://localhost:15672/
* Create a new queue with same name as the one configured in application.properties file.
* Create a new exchange as well
* Create a binding using the routing key

## REST API
* Start SpringBoot app.
* To produce a message, use any RestClient and invoke the api: http://localhost:8080/api/v1/message/hello
* MessageConsumer will automatically consume the message, once produced. 