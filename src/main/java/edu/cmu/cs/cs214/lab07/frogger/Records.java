package edu.cmu.cs.cs214.lab07.frogger;

import java.util.ArrayList;
import java.util.List;

public class Records {

    private List<Integer> scores;

    public Records() {
        scores = new ArrayList<>();
    }

    public void addScore(int score) {
        scores.add(score);
    }

    public void printScores() {
        System.out.println("Scores:");
        for (int score : scores) {
            System.out.println(score);
        }
    }
}