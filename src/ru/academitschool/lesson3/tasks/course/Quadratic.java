package ru.academitschool.lesson3.tasks.course;

import java.util.Scanner;

// 3.39
public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кооэффициент a квадратного уравнения: ");
        double a = scanner.nextDouble();
        System.out.print("Введите кооэффициент b квадратного уравнения: ");
        double b = scanner.nextDouble();
        System.out.print("Введите кооэффициент c квадратного уравнения: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;
        double epsilon = 1.0e-10;
        boolean isANull = (Math.abs(a) <= epsilon);
        boolean isBNull = (Math.abs(b) <= epsilon);
        boolean isCNull = (Math.abs(c) <= epsilon);

        if (isANull && isBNull && isCNull) {
            System.out.printf("%f*x^2 + %f*x * %f = 0 -> 0 = 0. Это не квадратное уравнение. x - любоe число.",
                    a, b, c);
        } else if (isANull && isBNull) {
            System.out.printf("%f*x^2 + %f*x * %f = 0 -> %f = 0 неверное математическое выражение", a, b, c, c);
        } else if (isANull) {
            double x = -c / b;
            if (Math.abs(x) <= epsilon) {
                x = 0;
            }
            System.out.printf("%f*x^2 + %f*x * %f = 0 -> %f*x + %f = 0 Это не квадратное уравнение. x = %f",
                    a, b, c, b, c, x);
        } else if (discriminant < -epsilon) {
            System.out.printf("Дискриминант = %f%n", discriminant);
            System.out.println("Корней, на множестве действительных чисел, нет.");
        } else if (Math.abs(discriminant) <= epsilon) {
            System.out.printf("Дискриминант = %f%n", discriminant);
            double x = -b / (2 * a);
            if (Math.abs(b) <= epsilon) {
                x = 0;
            }
            System.out.printf("x1 = x2 = %f", x);
        } else {
            System.out.printf("Дискриминант = %f%n", discriminant);
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("x1 = %f, x2 = %f", x1, x2);
        }
    }
}
