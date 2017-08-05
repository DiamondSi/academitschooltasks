package ru.academitschool.lesson11.tasks.course;

import java.util.Arrays;

// 11.19
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {21, 10, 123, 13, 14, 15, 16};
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortArray(int[] array) {
        boolean isSorted = false;
        for (int i = 0; i < array.length - 1 && !isSorted; ++i) {
            isSorted = true;
            for (int j = 0; j < array.length - 1 - i; ++j) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}
