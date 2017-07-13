package ru.academitschool.lesson5.tasks.course;

// 5.37
public class EuclideanAlgorithm {
    public static void main(String[] args) {
        int firstNumber = 3100;
        int secondNumber = 4440;
        int a = firstNumber;
        int b = secondNumber;
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        int greatestCommonDivisor = a + b;
        System.out.printf("first number: %d, second number: %d, Greatest Common Divisor: %d",
                firstNumber, secondNumber, greatestCommonDivisor);
    }
}
