package com.sda.vehicles;

public class Car extends Vehicle {
    int passengers;

    public Car() {
        super(4);
        System.out.println("Car constructor");
        super.run(10);
    }

    void addPassenger() {
        ++passengers;
        System.out.println("Adding new passenger. Current number: " + passengers);
    }

    void removePassenger() {
        --passengers;
        System.out.println("Removing a passenger. Current number: " + passengers);
    }
}
