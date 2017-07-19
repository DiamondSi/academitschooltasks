package ru.academitschool.lesson8.tasks.course;

import java.util.Scanner;

// 8.20
public class MaxSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String string = scanner.nextLine();
        System.out.printf("Максимальная длина подстроки одинаковых символов, без учета регистра: %d",
                findMaxLenSubstring(string));
    }

    public static int findMaxLenSubstring(String string) {
        if (string.length() == 0) {
            return 0;
        }
        int subStringLength = 1;
        int subStringLengthMax = 1;
        for (int i = 1; i < string.length(); i++) {
            if (Character.toLowerCase(string.charAt(i - 1)) == Character.toLowerCase(string.charAt(i))) {
                ++subStringLength;
                if (subStringLength > subStringLengthMax) {
                    subStringLengthMax = subStringLength;
                }
            } else {
                subStringLength = 1;
            }
        }
        return subStringLengthMax;
    }
}
