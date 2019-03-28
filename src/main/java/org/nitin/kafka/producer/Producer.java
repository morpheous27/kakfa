package org.nitin.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private static final Logger logger = LoggerFactory.getLogger(Producer.class);

    private final String USER_TOPIC = "user.topic";

    @Autowired
    private KafkaTemplate<String,String> template;

    public void sendMessage(String msg) {
        System.out.println("Producer is producing..");
        template.send(USER_TOPIC, msg);

    }

}
