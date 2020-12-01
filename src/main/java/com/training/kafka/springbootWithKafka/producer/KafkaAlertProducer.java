package com.training.kafka.springbootWithKafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaAlertProducer implements Producer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaMessageProducer.class);
    private static final String TOPIC = "alerts";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void produce(String alert) {
        logger.info(String.format("#### -> Producing alert -> %s", alert));
        this.kafkaTemplate.send(TOPIC, alert);
    }
}
