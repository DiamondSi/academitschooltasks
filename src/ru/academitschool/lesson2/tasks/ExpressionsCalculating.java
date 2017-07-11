package ru.academitschool.lesson2.tasks;

/**
 * Created by dubchak-da on 22.06.2017.
 */
public class ExpressionsCalculating {
    public static void main(String[] args) {
        double x = 3.0 - (56.0 - 12.0) / 44.0 * 4.0 / 2.0;
        double y = 2.0 * x / (33.0 - x);
        double z = -1.0 * x / (2.0 * y);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
