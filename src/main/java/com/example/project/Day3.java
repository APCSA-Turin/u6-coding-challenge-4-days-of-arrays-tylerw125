package com.example.project;

public class Day3 {
    public static String[][] generateSnowflake(int size) {
        if (size % 2 == 0) {
            throw new IllegalArgumentException("Size must be an odd number.");
        }

        String[][] grid = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = " ";
            }
        }

        int center = size / 2;
        for (int i = 0; i < size; i++) {
            grid[i][center] = "*";
            grid[center][i] = "*";
        }
        for (int i = 0; i < size; i++) {
            grid[i][i] = "*";
            grid[i][size - 1 - i] = "*";
        }

        return grid;
    }
    public static void printSnowflake(String[][] snowflake) {
        for (int i = 0; i < snowflake.length; i++) {
            for (int j = 0; j < snowflake[i].length; j++) {
                System.out.print(snowflake[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[][] snowflake = generateSnowflake(5);
        printSnowflake(snowflake);
    }
}
