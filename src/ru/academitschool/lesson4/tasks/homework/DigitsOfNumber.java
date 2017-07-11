package ru.academitschool.lesson4.tasks.homework;

import java.util.Scanner;

// 4.35
//TODO доделать задачу
public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int i = number;
        do {
            i /= 10;
        } while (i / 10 > 0);
    }
}
