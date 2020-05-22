package com.madmax.designPatterns.Prototype;

public class GunMen extends GameUnit {

    private String state = "idle";

    @Override
    public String toString() {
        return "GunMen [state=" + state + getPosition() + "]";
    }

    public void attack() {
        this.state = "attacking";
    }

    @Override
    protected void reset() {
        this.state = "idle";

    }

}