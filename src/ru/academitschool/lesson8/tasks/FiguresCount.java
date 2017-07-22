package ru.academitschool.lesson8.tasks;

import java.util.Scanner;

// 8.9
public class FiguresCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String string = scanner.nextLine();
        int lettersCount = 0;
        int digitsCount = 0;
        int whiteSpacesCount = 0;
        int otherFiguresCount = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                ++lettersCount;
            } else if (Character.isDigit(string.charAt(i))) {
                ++digitsCount;
            } else if (Character.isWhitespace(string.charAt(i))) {
                ++whiteSpacesCount;
            } else {
                ++otherFiguresCount;
            }
        }

        System.out.println("Length of string: " + string.length());
        System.out.println("Letters: " + lettersCount);
        System.out.println("Digits: " + digitsCount);
        System.out.println("White Spaces: " + whiteSpacesCount);
        System.out.println("Other Figures: " + otherFiguresCount);
    }
}
