package edu.cmu.cs.cs214.lab07.drawing;

public abstract class Shape implements Drawable {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}