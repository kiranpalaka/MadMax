package com.madmax.designPatterns.Prototype;

import javafx.geometry.Point3D;

public abstract class GameUnit implements Cloneable {

    private Point3D position;

    public GameUnit() {
        this.position = Point3D.ZERO;
    }

    public GameUnit(double x, double y, double z) {
        this.position = new Point3D(x, y, z);
    }

    public void move(Point3D direction, Double distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);

    }

    public Point3D getPosition() {
        return position;
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit) super.clone();
        unit.intialize();
        return unit;
    }

    protected void intialize() {
        this.position = Point3D.ZERO;
        reset();
    }

    protected abstract void reset();

}