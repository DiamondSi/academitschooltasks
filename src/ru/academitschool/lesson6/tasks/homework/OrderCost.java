package ru.academitschool.lesson6.tasks.homework;

import java.util.Scanner;

// 6.36
public class OrderCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstProductPrice = 10;
        System.out.printf("Товар Первый, цена %10.2f, введите количество: ", firstProductPrice);
        int firstProductCount = scanner.nextInt();

        double secondProductPrice = 100;
        System.out.printf("Товар Второй, цена %10.2f, введите количество: ", secondProductPrice);
        int secondProductCount = scanner.nextInt();

        System.out.printf("Стоимость заказа: %10.2f",
                calcOrderCost(firstProductCount, firstProductPrice, secondProductCount, secondProductPrice));
    }

    public static double calcOrderCost(int firstProductCount, double firstProductPrice,
                                       int secondProductCount, double secondProductPrice) {
        final int QUANTITY_DISCOUNT = 5;
        final int QUANTITY_DISCOUNT_CONDITION = 10;
        final int SUM_DISCOUNT = 5;
        final int WHOLE_DISCOUNT_CONDITION = 1000;
        final int ONE_HUNDRED_PERCENT = 100;

        int resultDiscount = 0;
        double regularPrice = firstProductCount * firstProductPrice + secondProductCount * secondProductPrice;

        if (firstProductCount + secondProductCount >= QUANTITY_DISCOUNT_CONDITION) {
            resultDiscount += QUANTITY_DISCOUNT;
        }
        if (regularPrice >= WHOLE_DISCOUNT_CONDITION) {
            resultDiscount += SUM_DISCOUNT;
        }
        return regularPrice * (ONE_HUNDRED_PERCENT - resultDiscount) / ONE_HUNDRED_PERCENT;
    }
}
