package com.training.kafka.springbootWithKafka.controllers;

import com.training.kafka.springbootWithKafka.producer.KafkaAlertProducer;
import com.training.kafka.springbootWithKafka.producer.KafkaMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
public class KafkaController {

    @Autowired
    private KafkaMessageProducer kafkaMessageProducer;

    @Autowired
    private KafkaAlertProducer kafkaAlertProducer;

    @PostMapping("/messages")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        kafkaMessageProducer.produce(message);
    }

    @PostMapping("/alerts")
    public void sendMessageToKafkaTopicUser(@RequestBody String alert) {
        kafkaAlertProducer.produce(alert);
    }
}
