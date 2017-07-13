package ru.academitschool.lesson5.tasks.course;

// 5.37
public class EuclideanAlgorithmOne {
    public static void main(String[] args) {
        int firstNumber = 3100;
        int secondNumber = 4440;
        int a = firstNumber;
        int b = secondNumber;
        int greatestCommonDivisor;
        do {
            if (a % b == 0) {
                greatestCommonDivisor = b;
            } else {
                greatestCommonDivisor = a % b;
                a = b;
                b = greatestCommonDivisor;
            }
        } while (a % b != 0);

        System.out.printf("first number: %d, second number: %d, Greatest Common Divisor: %d",
                firstNumber, secondNumber, greatestCommonDivisor);
    }
}
