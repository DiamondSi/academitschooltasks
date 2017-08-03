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
        for (int i = 0; i < array.length; ++i) {
            int minIndex = getMinIndex(array, i);
            if (array[i] > array[minIndex]) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static int getMinIndex(int[] array, int startIndex) {
        int min = array[startIndex];
        int index = startIndex;
        for (int i = startIndex + 1; i < array.length; ++i) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
