package com.madmax.designPatterns.simpleFactory;

public class Vehicle {

    private int wheels;
    private int size;
    private int height;
    private String color;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
     
    
}