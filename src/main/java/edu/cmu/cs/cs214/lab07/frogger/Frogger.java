package edu.cmu.cs.cs214.lab07.frogger;

public class Frogger {

    public static void main(String[] args) {

        FroggerID froggerID = new FroggerID(1);

        Road road = new Road("Main Street");

        Records records = new Records();

        records.addScore(100);
        records.addScore(200);

        System.out.println("Frogger ID: " + froggerID.getId());

        road.displayRoad();

        records.printScores();
    }
}