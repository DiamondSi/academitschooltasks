package ru.academitschool.lesson3.tasks.course;

import java.util.Scanner;

// 3.38
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координату x точки A: ");
        double x1 = scanner.nextDouble();
        System.out.print("Введите координату y точки A: ");
        double y1 = scanner.nextDouble();
        System.out.print("Введите координату x точки B: ");
        double x2 = scanner.nextDouble();
        System.out.print("Введите координату y точки B: ");
        double y2 = scanner.nextDouble();
        System.out.print("Введите координату x точки C: ");
        double x3 = scanner.nextDouble();
        System.out.print("Введите координату y точки C: ");
        double y3 = scanner.nextDouble();

        double epsilon = 1.0e-10;
        if (Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) <= epsilon) {
            System.out.println("Точки лежат на одной прямой!");
        } else {
            double lineAB = Math.sqrt(Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2));
            double lineBC = Math.sqrt(Math.pow((y3 - y2), 2) + Math.pow((x3 - x2), 2));
            double lineCA = Math.sqrt(Math.pow((y1 - y3), 2) + Math.pow((x1 - x3), 2));
            double semiPerimeter = (lineAB + lineBC + lineCA) / 2;
            double area = Math.sqrt(semiPerimeter * (semiPerimeter - lineAB) * (semiPerimeter - lineBC) * (semiPerimeter - lineCA));
            System.out.printf("Площадь треугольника: %f", area);
        }
    }
}
