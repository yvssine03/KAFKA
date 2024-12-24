package com.consumer;

import com.Service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@KafkaListener(topics = "order-topic", groupId = "notification-group")
public class OrderConsumer {

    @Autowired
    private NotificationService notificationService;

    public void consumeMessage(String message) {
        notificationService.sendNotification(message);
    }
}
