package ru.academitschool.lesson6.tasks.homework;

import java.util.Scanner;

// 6.30
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру в градусах Цельсия: ");
        int celsius = scanner.nextInt();
        System.out.println(convertCelsiusToFahrenheit(celsius) + "F");
        System.out.println(convertCelsiusToKelvin(celsius) + "K");
    }
    public static int convertCelsiusToFahrenheit(int celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static int convertCelsiusToKelvin(int celsius) {
        final int ABSOLUTE_ZERO = 273;
        return celsius + ABSOLUTE_ZERO;
    }
}
