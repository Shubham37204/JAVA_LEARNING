package com.shubham;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    static void main() {

        Student student = new Student();
        student.setId(2);
        student.setName("Shubham Bhardwaj");
        student.setAge(24);
        student.setCity("Delhi");


//        //Storing into the Database
//
//        //This creates a Hibernate Configuration object.
//        Configuration config = new Configuration();
//
//
//        //You are basically saying:
//        //"Hibernate, I want you to know about my Student entity."
//        config.addAnnotatedClass(Student.class);
//
//
//        //This tells Hibernate to load the configuration.
//        config.configure();
//
//
//        //Hibernate takes the configuration and prepares itself.
//        //The SessionFactory is basically a Hibernate object that is prepared to create database sessions.
//        SessionFactory factory = config.buildSessionFactory();
//
//
//        //Now we ask the factory : "Give me a Hibernate Session."
//        Session session = factory.openSession();
//
//
//        //We're starting a database transaction before performing the save operation.
//        Transaction transaction = session.beginTransaction();
//
//
//        //you're telling Hibernate:"Save this Student object."
//        session.persist(student);
//
//        transaction.commit();
//        session.close();
//        factory.close();


        //Fetching the Data
//        SessionFactory factory1 = new Configuration().addAnnotatedClass(Student.class).configure().buildSessionFactory();
//        Session session1 = factory1.openSession();
//        Student a2 =  session1.find(Student.class, 1);
//        System.out.print(a2);
//        session1.close();
//        factory1.close();


        //Updating The data
//        SessionFactory factory2 = new Configuration().addAnnotatedClass(Student.class).configure().buildSessionFactory();
//        Session session2 = factory2.openSession();
//        Transaction transaction = session2.beginTransaction();
//        Student a2 =  session2.merge(student);
//        System.out.print(a2);
//        transaction.commit();
//        session2.close();
//        factory2.close();
//

        //Deleting the data
        SessionFactory factory3 = new Configuration().addAnnotatedClass(Student.class).configure().buildSessionFactory();
        Session session3 = factory3.openSession();
        Transaction transaction = session3.beginTransaction();

        session3.remove(student);

        //Student a2 =  session1.find(Student.class, 1);
        //session3.remove(a2);

        System.out.print(student);
        transaction.commit();
        session3.close();
        factory3.close();

    }
}

