package ru.academitschool.lesson4.tasks.homework;

// 4.34
public class TenNumbersInRow {
    public static void main(String[] args) {
        int firstNumber = 1;
        int lastNumber = 100;
        int numbersInRow = 10;
        int column = 1;
        int i = firstNumber;
        while (i <= lastNumber) {
            if (column < numbersInRow) {
                System.out.printf("%5d", i);
                ++column;
            } else {
                System.out.printf("%5d%n", i);
                column = 1;
            }
            ++i;
        }
    }
}
