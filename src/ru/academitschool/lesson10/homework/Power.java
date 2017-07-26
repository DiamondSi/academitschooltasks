package ru.academitschool.lesson10.homework;

// 10.22
public class Power {
    public static void main(String[] args) {
        int number = 2;
        int power = 10;
        System.out.printf("%d ^ %d = %d%n", number, power, calculatePower(number, power));
        System.out.printf("%d ^ %d = %d%n", number, power, calculatePowerByRecursion(number, power));
    }

    public static int calculatePower(int number, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        return result;
    }

    public static int calculatePowerByRecursion(int number, int power) {
        if (power == 0) {
            return 1;
        }
        return number * calculatePowerByRecursion(number, power - 1);
    }
}
