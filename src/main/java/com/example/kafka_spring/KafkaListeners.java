package com.example.kafka_spring;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics = "LOL",
            groupId = "groupID"
    )
    void listener(String data){
        System.out.println("Received:" + data);
    }
}
