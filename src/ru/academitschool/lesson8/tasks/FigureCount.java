package ru.academitschool.lesson8.tasks;

import java.util.Scanner;

// 8.9
public class FigureCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String string = scanner.nextLine();
        int lettersCount = 0;
        int digitsCount = 0;
        int whiteSpases = 0;
        int otherFigures = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                ++lettersCount;
            } else if (Character.isDigit(string.charAt(i))) {
                ++digitsCount;
            } else if (Character.isWhitespace(string.charAt(i))) {
                ++whiteSpases;
            } else {
                ++otherFigures;
            }
        }

        System.out.println("Length of string: " + string.length());
        System.out.println("Letters: " + lettersCount);
        System.out.println("Digits: " + digitsCount);
        System.out.println("White Spaces: " + whiteSpases);
        System.out.println("Other Figures: " + otherFigures);
    }
}
