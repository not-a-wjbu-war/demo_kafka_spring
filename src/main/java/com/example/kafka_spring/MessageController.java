package com.example.kafka_spring;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/messages")
public class MessageController {

    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public void publish(){
        kafkaTemplate.send("LOL", "DELL DI PHAU GI HET CAM LUC LEN!!");
    }
}
