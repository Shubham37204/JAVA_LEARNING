package com.Ranjana.SpringBoot2_Learning.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PwdService {
    public String encryptPws(String pwd) {
        return pwd;
    }
}
