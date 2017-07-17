package ru.academitschool.lesson6.tasks.homework;

// 6.35
public class Overload {
    public static void main(String[] args) {
        byte firstVariable = 0;
        short secondVariable = 0;
        int thirdVariable = 0;
        long fourthVariable = 0;
        float fifthVariable = 0;
        double sixthVariable = 0;
        System.out.printf("firstVariable needs %d bytes%n", getTypeSize(firstVariable));
        System.out.printf("secondVariable needs %d bytes%n", getTypeSize(secondVariable));
        System.out.printf("thirdVariable needs %d bytes%n", getTypeSize(thirdVariable));
        System.out.printf("fourthVariable needs %d bytes%n", getTypeSize(fourthVariable));
        System.out.printf("fifthVariable needs %d bytes%n", getTypeSize(fifthVariable));
        System.out.printf("sixthVariable needs %d bytes%n", getTypeSize(sixthVariable));
    }

    public static int getTypeSize(byte arg) {
        return 1;
    }

    public static int getTypeSize(short arg) {
        return 2;
    }

    public static int getTypeSize(int arg) {
        return 4;
    }

    public static int getTypeSize(long arg) {
        return 8;
    }

    public static int getTypeSize(float arg) {
        return 4;
    }

    public static int getTypeSize(double arg) {
        return 8;
    }
}
