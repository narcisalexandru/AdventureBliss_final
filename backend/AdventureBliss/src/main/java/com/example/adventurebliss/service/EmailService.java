package com.example.adventurebliss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("adventure.bliss@outlook.com");
        message.setTo("adventure.bliss@outlook.com");
        message.setSubject(subject);
        message.setText(text + "\nDe la: " + to);
        mailSender.send(message);
    }
}
