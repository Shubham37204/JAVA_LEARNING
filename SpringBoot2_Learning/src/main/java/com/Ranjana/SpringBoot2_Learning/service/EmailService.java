package com.Ranjana.SpringBoot2_Learning.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service //user for business layer
public class EmailService {
    public boolean sendEmail(String to, String subject, String body) {
        System.out.println("Sending email");
        return true;
    }
}
