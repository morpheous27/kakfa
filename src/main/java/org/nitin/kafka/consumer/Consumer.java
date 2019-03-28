package org.nitin.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "user.topic", groupId = "group_id")
    public String consumer(String message)
    {
        System.out.println("message consumer- "+ message);
        return message;
    }

}
