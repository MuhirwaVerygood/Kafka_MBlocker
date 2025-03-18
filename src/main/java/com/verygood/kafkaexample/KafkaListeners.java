package com.verygood.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "verygood" , groupId = "groupId")
    void listener(String data) {
        System.out.println("Received data: " + data);
    }
}
