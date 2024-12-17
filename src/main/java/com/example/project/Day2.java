package com.example.project;

import java.util.Random;

public class Day2 {
    public static String[][] nameSort(String[] names) {
        Random rand = new Random();
    
        boolean[] isNice = new boolean[names.length];
        for (int i = 0; i < names.length; i++) {
            isNice[i] = rand.nextBoolean();
        }

        String[] niceList = new String[names.length];
        String[] naughtyList = new String[names.length];
    
        int niceIndex = 0, naughtyIndex = 0;
        for (int i = 0; i < names.length; i++) {
            if (isNice[i]) {
                niceList[niceIndex++] = names[i];
            } else {
                naughtyList[naughtyIndex++] = names[i];
            }
        }
    
        return new String[][] {niceList, naughtyList};
    }
    

    public static void main(String[] args) {
        String[] names = {"John", "Matt", "Lucy", "Nina", "Roxy", "Andrew", "Henry", "Donnie", "Sasha", "Mohammad", "Elsa", "Ruby"};
        String[][] sortedNames = nameSort(names);

        System.out.println("Nice List: ");
        for (String name : sortedNames[0]) {
            System.out.print(name + " ");
        }

        System.out.println("\nNaughty List: ");
        for (String name : sortedNames[1]) {
            System.out.print(name + " ");
        }
    }
}
