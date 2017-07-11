package ru.academitschool.lesson4.tasks.homework;

import java.util.Scanner;

// 4.15
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первый операнд: ");
        double firstOperand = scanner.nextDouble();
        System.out.print("Введите второй операнд: ");
        double secondOperand = scanner.nextDouble();
        System.out.print("Введите команду (1 сложение, 2 вычитание, 3 умножение, 4 деление): ");
        int command = scanner.nextInt();

        switch (command) {
            case 1:
                System.out.printf("%f + %f = %f", firstOperand, secondOperand, firstOperand + secondOperand);
                break;
            case 2:
                System.out.printf("%f - %f = %f", firstOperand, secondOperand, firstOperand - secondOperand);
                break;
            case 3:
                System.out.printf("%f * %f = %f", firstOperand, secondOperand, firstOperand * secondOperand);
                break;
            case 4:
                System.out.printf("%f / %f = %f", firstOperand, secondOperand, firstOperand / secondOperand);
                break;
            default:
                System.out.println("Неизвестная операция");
        }
    }
}
