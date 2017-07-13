package ru.academitschool.lesson5.tasks;

// 5.17
public class ForOneHundredStopIfThirty {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i >= 30) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}
