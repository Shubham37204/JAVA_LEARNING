package com.Bhardwaj.SpringBoot_Learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("shubham") //when 2 class has @component at the top and spring is unable to decide which to use
    private Human human;//use of interface  as class is extended by human interface

    public void code(){
        human.compile();
        System.out.println("Hello World");
    }
}

//field injection
//@Autowired //connecting dev to alien
//private Alien al;

//Construction Injection
//    public Dev(Alien al) {
//        this.al = al;
//    }

//Setter Injection
//    @Autowired
//    public void setAlien(Alien al) {
//        this.al = al;
//    }


//See initially we had one class called Dev and it was connecting to
// another class called Alien but what we did next is that we created an
// interface that was extended inside the Alien and we created an object
// of that Now again we created a class that again extended the same interface
// called Human means Alien and Human was two new class which has implemented the
// interface called Human and have at the rate at their top so JavaScript confused
// which one to use so we use this qualifier that this 1 is the primary file and other
// one is not