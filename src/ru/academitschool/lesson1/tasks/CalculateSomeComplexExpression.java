package ru.academitschool.lesson1.tasks;

/**
 * Created by dubchak-da on 21.06.2017.
 */
public class CalculateSomeComplexExpression {
    public static void main(String[] args) {
        int firstVariable = 10;
        int secondVariable = 12;
        int thirdVariable = 3;
        System.out.println("Calculating (" + firstVariable + " + " + secondVariable + ") * " + thirdVariable + " - " + thirdVariable + " ...");
        int result = (firstVariable + secondVariable) * thirdVariable - thirdVariable;
        System.out.println("= " + result);
    }
}
