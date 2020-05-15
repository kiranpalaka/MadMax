package com.madmax.designPatterns.simpleFactory;

public class VehicleFactory {

    public static Vehicle getVehicle(String type)
    {
        switch(type){
            case "car" :
                return new Car();
            case "Bus" :
                return new Bus();
            default :
                throw new IllegalArgumentException("unsupported type");

        }
    }
    
}