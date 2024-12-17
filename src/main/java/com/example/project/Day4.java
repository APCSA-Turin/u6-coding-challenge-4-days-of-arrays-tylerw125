package com.example.project;
import java.util.Random;

public class Day4 {

    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer {
        private String name;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int distanceTraveled;

        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            this.distanceTraveled = 0;
        }

        public void simulateSecond() {

            if (runDuration > 0) {
                distanceTraveled += speed;
                runDuration--;
            } else if (restDuration > 0) {
                restDuration--;
            }
        }

        public int getDistanceTraveled() {
            return distanceTraveled;
        }

        public String getName() {
            return name;
        }
    }

    public static String simulateRace(int time, Reindeer[] reindeers) {
        for (int t = 0; t < time; t++) {
            for (Reindeer reindeer : reindeers) {
                reindeer.simulateSecond();
            }
        }

        Reindeer winner = null;
        for (Reindeer reindeer : reindeers) {
            if (winner == null || reindeer.getDistanceTraveled() > winner.getDistanceTraveled()) {
                winner = reindeer;
            }
        }

        return winner.getName();
    }

    public static void main(String[] args) {
        Reindeer[] reindeers = {
            new Reindeer("Dasher", 10, 3, 1),
            new Reindeer("Dancer", 12, 2, 2),
            new Reindeer("Prancer", 15, 1, 1),
            new Reindeer("Vixen", 8, 3, 2)
        };

        String winner = simulateRace(10, reindeers);
        System.out.println("The winner is: " + winner);
    }
}
