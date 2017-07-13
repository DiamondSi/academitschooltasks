package ru.academitschool.lesson5.tasks.homework;

import java.util.Scanner;

// 5.36
public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sampleString = "string";

        while (true) {
            System.out.println("Введите строку для сравнения с эталоном:");
            String userString = scanner.nextLine();
            if (userString.equals(sampleString)) {
                break;
            }
            System.out.println("Ваша строка не совпадает с эталоном!");
        }
    }
}
