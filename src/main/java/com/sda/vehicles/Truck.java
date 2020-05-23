package com.sda.vehicles;

public class Truck extends Vehicle {
    public Truck() {
        System.out.println("Truck constructor");
    }
    @Override
    public void run (double velocity) {
        if (velocity > 80) {
            System.out.println("I can`t run "
                    + velocity + ". It is too fast.");
            velocity = 80;
        }
        System.out.println("Truck running at " +
                velocity + "km/h");
    }
}
