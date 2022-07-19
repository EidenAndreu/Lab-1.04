package com.ironhack;

// Write a method in Java to get the difference between the largest and smallest values in an array of integers.
// The length of the array must be 1 and above.

public class Largest_Smallest {
    public static int getDifference(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        return max - min;
    }

}
