package ru.academitschool.lesson11.tasks.course;

import java.util.Arrays;

// 11.23
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {10, 1, 2, 56, 33, 4};
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortArray(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int temp = array[i];
            int j = i;
            while (j > 0 && temp < array[j - 1]) {
                array[j] = array[j - 1];
                --j;
            }
            array[j] = temp;
        }
    }
}

