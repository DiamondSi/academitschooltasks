package ru.academitschool.lesson4.tasks.homework;

// 4.33
public class ArithmeticalMeanDoWhile {
    public static void main(String[] args) {
        int firstNumber = 3;
        int lastNumber = 17;
        int sum = 0;
        int numberOfNumbers = 0;
        int i = firstNumber;
        do {
            sum += firstNumber;
            ++i;
            ++numberOfNumbers;
        } while (i <= lastNumber);
        double arithmeticalMean = (double) sum / numberOfNumbers;
        System.out.println(arithmeticalMean);
    }
}
