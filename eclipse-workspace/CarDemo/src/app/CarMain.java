package app;

import model.Car; // importing Car from the main

// execute class for Car
public class CarMain {
    public static void main(String[] args) {
        // create instance of a class
        // classname objectname = new constructor();
        Car c = new Car();
        c.name = "Range Rover";
        c.model = "Petrol";
        c.speed = 200;
        c.customer = "Ramesh";

        // call method
        c.display();
    }
}
