package ru.academitschool.lesson9.tasks.course;

import java.util.Arrays;

// 9.44
public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {2, 3, 2, 4, 5, 6, 7, 8, 11, 12, 23};
        System.out.printf("Average of even numbers for %s: %f", Arrays.toString(array), getArrayAverage(array));
    }

    public static double getArrayAverage(int[] array) {
        int sum = 0;
        int count = 0;
        for (int m : array) {
            if (m % 2 == 0) {
                sum += m;
                ++count;
            }
        }
        return (double) sum / count;
    }
}
