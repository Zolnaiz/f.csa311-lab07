package edu.cmu.cs.cs214.lab07.frogger;

public class Road {

    private String name;

    public Road(String name) {
        this.name = name;
    }

    public void displayRoad() {
        System.out.println("Road: " + name);
    }
}