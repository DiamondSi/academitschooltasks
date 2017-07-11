package ru.academitschool.lesson4.tasks.homework;

// 4.28
public class ArithmeticalMean {
    public static void main(String[] args) {
        int firstNumber = 3;
        int lastNumber = 17;
        int sum = 0;
        int numberOfNumbers = 0;
        int i = firstNumber;
        while (i <= lastNumber) {
            sum += firstNumber;
            ++i;
            ++numberOfNumbers;
        }
        double arithmeticalMean = (double) sum / numberOfNumbers;
        System.out.println(arithmeticalMean);
    }
}
