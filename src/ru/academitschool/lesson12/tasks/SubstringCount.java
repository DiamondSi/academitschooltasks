package ru.academitschool.lesson12.tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//12.43
public class SubstringCount {
    public static void main(String[] args) throws FileNotFoundException {
        String substring = "summer";
        String inputFile = "in.txt";
        int count = countSubstr(inputFile, substring);
        System.out.printf("File \"%s\" contains %d \"%s\"", inputFile, count, substring);

    }

    public static int countSubstr(String inputFile, String substring) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream(inputFile))) {
            StringBuilder stringBuilder = new StringBuilder();
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine());
            }
            String string = stringBuilder.toString().toLowerCase();
            int count = 0;
            int index = string.indexOf(substring.toLowerCase());
            while (index >= 0 && index < string.length()) {
                ++count;
                index = string.indexOf(substring.toLowerCase(), index + 1);
            }
            return count;
        }
    }
}
