package ru.academitschool.lesson5.tasks.course;

import java.util.Scanner;

// 5.39
public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму первоначального взноса:");

        long primaryPayment = 10000;
        int interestRate = 10;
        int depositTerm = 10;
        final int MONTHS_A_YEAR =12;
        long accountBalance = primaryPayment;
        long incomingBalance = primaryPayment;
        for (int i = 1; i <= depositTerm; i++) {
//            incomingBalance=
            long interest = (incomingBalance * interestRate / 100)/MONTHS_A_YEAR;
            accountBalance += incomingBalance + interest;
            System.out.printf("month: %2d; incoming balance: %10d; interest: %10d; account balance: %10d%n",
                    i, incomingBalance, interest, accountBalance);
            incomingBalance = accountBalance;
        }
    }
}
