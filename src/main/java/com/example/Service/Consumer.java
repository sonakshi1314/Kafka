package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "firstTopic", groupId = "first-group")
    public void listenToKafkaTopic(String messageReceived) {
        System.out.println("Message received is " + messageReceived);
    }
}
