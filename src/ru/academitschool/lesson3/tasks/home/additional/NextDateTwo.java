package ru.academitschool.lesson3.tasks.home.additional;

import java.util.Scanner;

// 3.37
public class NextDateTwo {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите дату в формате dd.MM.yyyy: ");
//        String dateString = scanner.nextLine();
        int day = 31;
        int month = 5;
        int year = 1;

        boolean isLeap = false;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            isLeap = true;
        }

        System.out.println(isLeap);

        if (year < 1 || month < 1 || month > 12 || day < 0 || day > 31 ||
                ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) ||
                (month == 2 && day > 28 && !isLeap) ||
                (month == 2 && day > 29 && isLeap)) {
            System.out.println("Нереальная дата!");
        } else if (day == 31 && (month == 12)) {
            day = 1;
            month = 1;
            year++;
        } else if ((day == 31) ||
                (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) ||
                (day == 29 && month == 2)) {
            day = 1;
            month++;
        } else if ((day == 28) &&
                (month == 2) &&
                !isLeap) {
            day = 1;
            month++;
        } else {
            day++;
        }
//        System.out.println(dateString);
        System.out.printf("%02d.%02d.%d", day, month, year);
    }
}
