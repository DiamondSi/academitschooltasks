package ru.academitschool.lesson12.tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//12.43
public class SubstringCount {
    public static void main(String[] args) throws FileNotFoundException {
        String substring = "2017";
        try (Scanner scanner = new Scanner(new FileInputStream("in.txt"))) {
            StringBuilder stringBuilder = new StringBuilder();
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine());
            }
            String string = stringBuilder.toString().toLowerCase();
            System.out.println("inp string:" + string);
            int stringLength = string.length();
            System.out.println("inp str length:" + stringLength);
            System.out.println("substr length:" + substring.length());
            int index = 0;
            int count = 0;
            while (index < stringLength) {
                if (string.indexOf(substring, index) >= 0) {
                    ++count;
                    index += substring.length();
                } else {
                    ++index;
                }
            }
            System.out.println("substr count:" + count);
        }
    }
}
