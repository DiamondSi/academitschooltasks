package ru.academitschool.lesson9.tasks;

import java.util.Arrays;

// 9.9
public class ArrayOneHundred {
    public static void main(String[] args) {
        int[] hundred = new int[100];
        for (int i = 0; i < hundred.length; i++) {
            hundred[i] = i + 1;
        }
        for (int i = 0; i < hundred.length; i++) {
            System.out.printf("hundred[%d]=%d; ", i, hundred[i]);
        }
        for (int e : hundred) {
            System.out.println(e);
        }
        System.out.println(Arrays.toString(hundred));
    }
}
