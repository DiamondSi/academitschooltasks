package ru.academitschool.lesson9.tasks.homework.arraytasks;

import java.util.Arrays;

// 9.41
public class ElementIndex {
    public static void main(String[] args) {
        double[] array = {2.2, 6.5, 2.2, 6.45, 4, 5};
        double element = 4;
        System.out.println(Arrays.toString(array));
        System.out.println(findElementIndex(element, array));
    }

    public static int findElementIndex(double element, double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
