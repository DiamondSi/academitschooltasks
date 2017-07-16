package ru.academitschool.lesson5.tasks.course;

import java.util.Scanner;

// 5.39
public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму первоначального взноса:");
        long primaryPayment = scanner.nextLong();

        System.out.print("Введите процентную ставку (%% в год):");
        int interestRate = scanner.nextInt();
        System.out.print("Введите срол депозита (месяцев):");
        int depositTerm = scanner.nextInt();

        final int MONTHS_OF_YEAR = 12;
        final int ONE_HOUNDRED_PERCENTS = 100;
        final int CENTS = 100;
        long primaryPaymentCent = primaryPayment * CENTS;
        long accountBalance = primaryPaymentCent;
        long incomingBalance = 0;

        System.out.printf("           остаток на начало месяца: %10.2f;      первоначальный взнос: %10.2f;" +
                        " остаток по вкладу: %10.2f%n",
                (double) incomingBalance / CENTS, (double) primaryPayment, (double) accountBalance / CENTS);
        incomingBalance = accountBalance;
        for (int i = 1; i <= depositTerm; i++) {
            long interest = incomingBalance * interestRate / ONE_HOUNDRED_PERCENTS / MONTHS_OF_YEAR;
            accountBalance = incomingBalance + interest;
            System.out.printf("месяц: %2d; остаток на начало месяца: %10.2f; ежемесячная капитализация: %10.2f;" +
                            " остаток по вкладу: %10.2f%n",
                    i, (double) incomingBalance / CENTS, (double) interest / CENTS, (double) accountBalance / CENTS);
            incomingBalance = accountBalance;
        }
        long profit = accountBalance - primaryPaymentCent;
        System.out.printf("Прибыль: %10.2f", (double) profit / CENTS);
    }
}
