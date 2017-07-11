package ru.academitschool.lesson4.tasks.homework;

import java.util.Scanner;

// 4.35
public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int sum = 0;
        int oddSum = 0;
        int max = number % 10;
        int i = number;

        do {
            int lastDigit = i % 10;
            sum += lastDigit;
            if (lastDigit % 2 != 0) {
                oddSum += lastDigit;
            }
            max = (max > lastDigit) ? max : lastDigit;
            i /= 10;
        } while (i > 0);
        System.out.println("sum: " + sum);
        System.out.println("oddSum: " + oddSum);
        System.out.println("max: " + max);
    }
}
