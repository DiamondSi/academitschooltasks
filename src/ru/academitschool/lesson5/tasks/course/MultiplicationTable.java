package ru.academitschool.lesson5.tasks.course;

// 5.38
public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 10;

        System.out.printf("%4s", "|");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }

        System.out.printf("%n--------------------------------------------%n");

        for (int i = 1; i <= number; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.printf("%4d", result);
            }
            System.out.println();
        }
    }
}
