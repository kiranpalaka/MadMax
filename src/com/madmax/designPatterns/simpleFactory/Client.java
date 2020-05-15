package com.madmax.designPatterns.simpleFactory;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle= VehicleFactory.getVehicle("car");
        System.out.println(vehicle.toString());
    }
    
}