package ru.academitschool.lesson6.tasks;

//
public class MinMax {
    public static void main(String[] args) {
        int firstNumber = 100;
        int seconfNumber = 200;
        System.out.println(getMax(firstNumber, seconfNumber));
        System.out.println(getMin(firstNumber, seconfNumber));
    }

    public static int getMax(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public static int getMin(int x, int y) {
        return x < y ? x : y;
    }
}
