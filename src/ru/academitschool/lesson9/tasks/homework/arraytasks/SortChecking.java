package ru.academitschool.lesson9.tasks.homework.arraytasks;

import java.util.Arrays;

// 9.46
public class SortChecking {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 3, 4, 4, 5, 6, 7, 7, 7, 8, 9};
        int[] secondArray = {9, 9, 9, 6, 5, 3, 2, 1, 1, 1};
        int[] thirdArray = {9, 8, 9, 5, 4, 6, 7, 4, 5, 9, 9, 6, 5, 3, 2, 1, 1, 1};
        System.out.printf("%s is sorted in ascending order: %b%n", Arrays.toString(firstArray), isAsc(firstArray));
        System.out.printf("%s is sorted in ascending order: %b%n", Arrays.toString(secondArray), isAsc(secondArray));
        System.out.printf("%s is sorted in ascending order: %b%n", Arrays.toString(thirdArray), isAsc(thirdArray));
        System.out.printf("%s is sorted in descending order: %b%n", Arrays.toString(firstArray), isDesc(firstArray));
        System.out.printf("%s is sorted in descending order: %b%n", Arrays.toString(secondArray), isDesc(secondArray));
        System.out.printf("%s is sorted in descending order: %b%n", Arrays.toString(thirdArray), isDesc(thirdArray));
    }

    public static boolean isAsc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDesc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                return false;
            }
        }
        return true;
    }
}
