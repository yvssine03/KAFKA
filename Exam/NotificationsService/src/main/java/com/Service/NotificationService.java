package com.Service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void sendNotification(String message) {
        // Logic pour envoyer une notification (email/SMS/etc.)
        System.out.println("Notification envoyée : " + message);
    }
}

