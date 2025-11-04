package model;

// demo for class structure
// class gives blueprint.

public class Car {
    // variables
    public int speed;        
    public String model;     
    public String name;      
    public String customer; 

    // method
    public void display() {
        System.out.println("Car Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed);
        System.out.println("Customer: " + customer);
    }
}
