package com.example.project;

import java.util.Random;

public class Day1 {
    private static String[] elf_names = {"Glitter", "Chocolate", "Tiny", "Snowflake", "Frosty"};

    public static String generateElfName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        Random rand = new Random();
        String elfName = elf_names[rand.nextInt(elf_names.length)];
        return elfName + " " + name;
    }

    public static void main(String[] args) {
        try {
            System.out.println(generateElfName("John"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

