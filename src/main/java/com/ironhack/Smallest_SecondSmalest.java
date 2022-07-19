package com.ironhack;
// Write a method in Java to find the smallest and second smallest elements of a given array and print it in the console.

public class Smallest_SecondSmalest {
    public static void print2Smallest(int[] arr) {
        int first, second, arr_size = arr.length;

        // There should be at least two elements
        if (arr_size < 2)
        {
            System.out.print(" Invalid Input ");
            return;
        }

        first = second = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size ; i ++)
        {
            //If current element is smaller than firs then update both first and second
            if (arr[i] < first)
            {
                second = first;
                first = arr[i];
            }

            // If arr[i] is in between first and second then update second
            else if (arr[i] < second && arr[i] != first)
                second = arr[i];
        }

        if (second == Integer.MAX_VALUE)
            System.out.print("There is no second smallest element");
        else
            System.out.print(second);
    }
}
