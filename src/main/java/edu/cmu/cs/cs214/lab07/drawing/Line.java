package edu.cmu.cs.cs214.lab07.drawing;

public class Line extends Shape {

    private int length;

    public Line(String color, int length) {
        super(color);
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " line with length " + length);
    }
}