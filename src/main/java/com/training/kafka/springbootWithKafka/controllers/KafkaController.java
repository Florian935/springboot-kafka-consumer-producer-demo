package com.training.kafka.springbootWithKafka.controllers;

import com.training.kafka.springbootWithKafka.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1.0/producer")
public class KafkaController {

    @Autowired
    private KafkaProducer producer;

    @PostMapping("/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        producer.produce(message);
    }
}
