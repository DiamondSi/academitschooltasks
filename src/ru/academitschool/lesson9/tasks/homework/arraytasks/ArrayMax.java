package ru.academitschool.lesson9.tasks.homework.arraytasks;

import java.util.Arrays;

// 9.41
public class ArrayMax {
    public static void main(String[] args) {
        double[] array = {7, 1.5, 6.5, 2.2, 6.5, 2.2, 4.0};
        System.out.println(Arrays.toString(array));
        System.out.println(getArrayMax(array));
    }

    public static double getArrayMax(double[] array) {
        double max = array[0];
        for (double number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
