package ru.academitschool.lesson11.tasks.course;
// 11.16

import java.util.Arrays;

public class ChoiceSort {
    public static void main(String[] args) {
        int[] array = {4, 3, 5, 6, 6, 77, 7};
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; ++j) {
                if (array[i] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
