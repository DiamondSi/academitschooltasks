package ru.academitschool.lesson5.tasks;

// 5.13
public class MultipleFour {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int n = 20;
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();

        int x = 10;
        int y = 200;
        int count = 0;
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
            ++count;
        }
        double average = (double) sum / count;
        System.out.println(average);
    }
}
