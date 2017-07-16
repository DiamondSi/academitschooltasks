package ru.academitschool.lesson6.tasks;

// 6.15
public class SomeCalculate {
    public static void main(String[] args) {
        System.out.println(calc3XPlus4Y(2, 5));
        System.out.println(calc3XPlus4Y(100, 4));
        System.out.println(calc3XPlus4Y(3434, 55));
    }

    public static int calc3XPlus4Y(int x, int y) {
        return 3 * x + 4 * y;
    }
}
