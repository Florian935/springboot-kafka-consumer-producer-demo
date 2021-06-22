package com.training.kafka.springbootWithKafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageConsumer implements Consumer {

    private final Logger logger = LoggerFactory.getLogger(KafkaMessageConsumer.class);

    @KafkaListener(topics = "messages", groupId = "group_id")
    public void consume(String message) {
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }
}
