package ru.academitschool.lesson4.tasks.course;

import java.util.Scanner;

// 4.29
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввведите номер числа Фибоначчи: ");
        int n = scanner.nextInt();

        int fibonacci = 0;
        if (n == 1) {
            fibonacci = 1;
        } else if (n > 1) {
            int fibonacciLast = 1;
            int fibonacciLastBefore = 0;
            int i = 2;
            while (i <= n) {
                fibonacci = fibonacciLast + fibonacciLastBefore;
                fibonacciLastBefore = fibonacciLast;
                fibonacciLast = fibonacci;
                ++i;
            }
        }
        System.out.printf("F%d = %d", n, fibonacci);
    }
}
