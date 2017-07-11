package ru.academitschool.lesson3.tasks.home;

import java.util.Scanner;

// 3.35
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d isn't a leap year", year);
        }
    }
}
