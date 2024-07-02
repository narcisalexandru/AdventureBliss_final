package com.example.adventurebliss.controller;

import com.example.adventurebliss.model.EmailRequest;
import com.example.adventurebliss.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "http://localhost:5173")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public String sendEmail(@RequestBody EmailRequest emailRequest) {
        String subject = "Formular de contactare de la " + emailRequest.getName();
        emailService.sendEmail(emailRequest.getEmail(), subject, emailRequest.getMessage());
        return "Email trimis cu succes";
    }
}
