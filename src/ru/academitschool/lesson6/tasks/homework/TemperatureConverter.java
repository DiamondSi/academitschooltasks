package ru.academitschool.lesson6.tasks.homework;

import java.util.Scanner;

// 6.30
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();
        System.out.printf("%10.2f F%n",convertCelsiusToFahrenheit(celsius));
        System.out.printf("%10.2f K%n",convertCelsiusToKelvin(celsius) );
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double convertCelsiusToKelvin(double celsius) {
        final double ABSOLUTE_ZERO = 273.15;
        return celsius + ABSOLUTE_ZERO;
    }
}
