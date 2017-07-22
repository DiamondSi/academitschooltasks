package ru.academitschool.lesson7.tasks.homework.range;

// 7.50
public class RangeMain {
    public static void main(String[] args) {
        Range range = new Range(10, 20);
        System.out.println(range.getLength());
        System.out.println(range.isInside(15));
        range.setFrom(15);
        range.setTo(30);
        System.out.println(range.getLength());
        System.out.println(range.isInside(30));
    }
}
