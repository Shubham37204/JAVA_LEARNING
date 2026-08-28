package org.raman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml") ;//need config file
        Dev obj = (Dev)context.getBean("dev");
        obj.code();

        //System.out.println(obj.getName());Setter Injective

        //below is the code when there is no injection at all
        //        Dev obj = (Dev)context.getBean("dev");
        //        obj.code();

    }
}

