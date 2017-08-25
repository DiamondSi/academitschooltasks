package ru.academitschool.lesson11.tasks.course;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {10, 1, 2, 56, 33, 4};
        System.out.println(Arrays.toString(array));
        quickSort(array,0,array.length);
        System.out.println(Arrays.toString(array));
    }
    static void quickSort(int[] a, int left, int right) {
        while ()
        if (a.length == 2 && a[0] > a[1]) {
            int temp = a[0];
            a[0] = a[1];
            a[1] = temp;
        }
        }
    }
}
