package com.madmax.designPatterns.simpleFactory;

public class Bus extends Vehicle {

    private String modelName;
    private int capacity;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    
}