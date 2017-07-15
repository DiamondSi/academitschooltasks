package ru.academitschool.lesson5.tasks.course;

import java.util.Scanner;

// 5.39
public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму первоначального взноса:");
        long primaryPayment = scanner.nextLong();
        long primaryPaymentCent = primaryPayment * 100;
        System.out.print("Введите процентную ставку (%% в год):");
        int interestRate = scanner.nextInt();
        System.out.print("Введите срол депозита (месяцев):");
        int depositTerm = scanner.nextInt();

        final int MONTHS_OF_THE_YEAR = 12;
        long accountBalance = primaryPaymentCent;
        long incomingBalance = 0;

        System.out.printf("           остаток на начало месяца: %10.2f;      первоначальный взнос: %10.2f;" +
                        " остаток по вкладу: %10.2f%n", (double) incomingBalance, (double) primaryPayment,
                (double) accountBalance / 100);
        incomingBalance = accountBalance;
        for (int i = 1; i <= depositTerm; i++) {
            long interest = incomingBalance * interestRate / 100 / MONTHS_OF_THE_YEAR;
            accountBalance = incomingBalance + interest;
            System.out.printf("месяц: %2d; остаток на начало месяца: %10.2f; ежемесячная капитализация: %10.2f;" +
                            " остаток по вкладу: %10.2f%n", i, (double) incomingBalance / 100, (double) interest / 100,
                    (double) accountBalance / 100);
            incomingBalance = accountBalance;
        }
        long profit = accountBalance - primaryPaymentCent;
        System.out.printf("Прибыль: %10.2f", (double) profit / 100);
    }
}
