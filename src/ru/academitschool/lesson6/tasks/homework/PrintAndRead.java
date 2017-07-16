package ru.academitschool.lesson6.tasks.homework;

import java.util.Scanner;

// 6.29
public class PrintAndRead {
    public static void main(String[] args) {
        int firstInt = printAndRead("Введите целое число: ");
        int secondInt = printAndRead("Введите второе целое число: ");
        int thirdInt = printAndRead("Введите третье целое число: ");
        System.out.println(firstInt);
        System.out.println(secondInt);
        System.out.println(thirdInt);
    }

    public static int printAndRead(String prompt) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(prompt);
        return scanner.nextInt();
    }
}
