package com.madmax.designPatterns.Prototype;

import javafx.geometry.Point3D;

public class Pclient {
    public static void main(String[] args)  throws CloneNotSupportedException {
        GunMen g1 = new GunMen();
        g1.move(new Point3D(-10,0,0), 20.0);
        g1.attack();
        System.out.println(g1);

        GunMen g2= (GunMen) g1.clone();
        System.out.println(g2);
    }
    
}