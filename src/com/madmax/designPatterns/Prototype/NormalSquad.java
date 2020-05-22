package com.madmax.designPatterns.Prototype;

public class NormalSquad extends GameUnit {
    private String state = "idle";

    public void boostUp() {
        this.state = "Drinking boost";

    }

    @Override
    public String toString() {
        return "NormalSquad [state=" + state + getPosition() + "]";
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("opeartion not supported");
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("cannot support clone");
    }

}