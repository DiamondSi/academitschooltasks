package ru.academitschool.lesson12.tasks;


import java.util.Arrays;

// 12.44
public class SplitString {
    public static void main(String[] args) {
        String string = "1, 2, 3, 4, 5";
        String[] numberLines = string.split(", ");
        int[] numbersArray = new int[numberLines.length];
        for (int i = 0; i < numberLines.length; i++) {
            numbersArray[i] = Integer.parseInt(numberLines[i]);
        }
        int sum = 0;
        for (int a : numbersArray) {
            sum += a;
        }
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(sum);
    }
}
