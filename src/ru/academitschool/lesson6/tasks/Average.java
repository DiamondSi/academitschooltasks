package ru.academitschool.lesson6.tasks;

// 6.28
public class Average {
    public static void main(String[] args) {
        System.out.println(calcAverage(3, 33));
    }

    public static double calcAverage(int begin, int end) {
        int sum = 0;
        int count = 0;
        for (int i = begin; i <= end; i++) {
            sum += i;
            ++count;
        }
        return (double) sum / count;
    }
}
