## Demo of Spring Boot with basic Kafka Producer / Consumer

This project is a basic demo of how to produces a message with `Kafka Producer` and consumes this message with a `Kafka Consumer`.

To run this project, you need first to launch a `docker-compose up` at the root of this project to have a `zookeeper and topic up` and
then launch the application with `mvn spring-boot:run`.

After that, make a ___POST___ request on `http://localhost:8080/kafka/producer/messages?message={yourMessage}` and consult the log to see the message produced.

In a real application, the producer and consumer aren't in the same application.