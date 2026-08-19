package com.Bhardwaj.SpringBoot_Learning;

import org.springframework.stereotype.Component;

@Component
public class Alien implements Human {
    public void compile(){
        System.out.println("yo yo Alien");
    }
}
