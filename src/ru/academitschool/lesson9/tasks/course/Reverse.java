package ru.academitschool.lesson9.tasks.course;

import java.util.Arrays;

// 9.45
public class Reverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverseArray(int[] array) {
        int arrayMiddle = array.length / 2;
        for (int i = 0; i < arrayMiddle; i++) {
            int m = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = m;
        }
    }
}
