package ru.academitschool.lesson10.homework;
// 10.23
public class EuclideanAlgorithm {
    public static void main(String[] args) {
        int firstNumber = 3100;
        int secondNumber = 4440;
        System.out.printf("first number: %d, second number: %d, Greatest Common Divisor: %d",
                firstNumber, secondNumber, greatestCommonDivisor(firstNumber, secondNumber));
    }

    public static int greatestCommonDivisor(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return greatestCommonDivisor(b, a % b);
    }
}
