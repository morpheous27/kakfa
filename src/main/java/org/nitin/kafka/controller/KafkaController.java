package org.nitin.kafka.controller;


import org.nitin.kafka.producer.Producer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "kafka")
public class KafkaController {

    private final Producer producer;

    public KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping("/publish")
    public void sendMessage(@RequestBody String message) {

        producer.sendMessage(message);
    }


}
