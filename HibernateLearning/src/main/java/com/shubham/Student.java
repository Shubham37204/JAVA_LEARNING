package com.shubham;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity essentially tells Hibernate:
//"Hibernate, this Java class is something that you should manage as a database entity."
//or
//@Entity tells Hibernate that this Java class should participate in ORM and be mapped to database data.

//there may be other java like student.java, they do can have @entity

@Entity
public class Student {

    @Id
    private int id;
    private String name;
    private int age;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

