package com.sda.vehicles;

public class VehicleApp {
    public static void main(String[] args) {
        System.out.println("Vehicle");
        Vehicle vehicle = new Vehicle();
        vehicle.run(100);

        System.out.println("Car");
        vehicle = new Car();
        vehicle.run(66);

        System.out.println("Truck");
        vehicle = new Truck();
        vehicle.run(100);
    }

    public static void runThisVehicle (Vehicle vehicle) {
        System.out.println("Running vehicle");
        vehicle.run(150);
    }
}
