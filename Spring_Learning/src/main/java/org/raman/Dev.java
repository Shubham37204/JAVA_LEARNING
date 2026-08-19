package org.raman;

public class Dev {

// Doing without the interface ie no computer interface
//    private Laptop laptop;

//    //setter Injection
//    public Dev() {System.out.println("Dev Constructor"); }
//    private String name;
//    public String getName() {return name; }
//    public void setName(String name) {
//        this.name = name;
//    }

//    //Construction Injection
//    public Dev(String name) {
//        this.name = name;
//        System.out.print("Dev1 has been created");
//    }

//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//        System.out.print("Dev1 has been created");
//    }

//    //getter and setter for Laptop
//    public Laptop getLaptop() {
//        return laptop;
//    }

//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

//    public void code(){
//        laptop.compile();
//        System.out.println("ddd");
//    }

// Doing with the interface ie computer interface
    private Computer computer;

    public Dev(){
        System.out.println("Dev constructor");
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code(){
        computer.compile();
        System.out.print("computer inside of code");
    }
}

