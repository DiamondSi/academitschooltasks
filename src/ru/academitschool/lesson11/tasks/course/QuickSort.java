package ru.academitschool.lesson11.tasks.course;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {10, 1, 3, 2, 56, 33, 4, 55, 11};
        System.out.println(Arrays.toString(array));
        int left = 0;
        int right = array.length - 1;
        quickSort(array, left, right);
        System.out.println(Arrays.toString(array));
    }

    static void quickSort(int[] a, int left, int right) {
        int partLength = right - left + 1;

        if (partLength == 1) {
            return;
        }

        if (partLength == 2) {
            if (a[left] > a[right]) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
            }
            return;
        }

        int i = left;
        int j = right;
        int x = a[left];

        while (i <= j) {
            while (a[i] < x) {
                ++i;
            }
            while (a[j] > x) {
                --j;
            }
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                ++i;
                --j;
            }
        }
        if (i < right) {
            quickSort(a, i, right);
        }
        if (j > left) {
            quickSort(a, left, j);
        }
    }
}