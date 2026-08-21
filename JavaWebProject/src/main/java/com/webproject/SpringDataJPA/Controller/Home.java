package com.webproject.SpringDataJPA.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController tells Spring:
//"This Home class contains methods that will handle HTTP requests."
//It is essentially telling Spring to treat this class as a web controller/API controller.
//So Spring will look inside this class for methods that should respond to requests.
@RestController
public class Home {

    //@RequestMapping("/")
    //public String greet(){
    //This tells Spring:
    //"When someone sends an HTTP request to /, execute the greet() method."
    //Here / means the root URL.
    //For example, if your Spring Boot application is running on:
    //http://localhost:8080
    //Then:
    //http://localhost:8080/
    //will match this mapping.
    @RequestMapping("/")
    public String greet(){
        return "welcome!";
    }

    @RequestMapping("/about")
    public String about(){
        return "about!";
    }

}