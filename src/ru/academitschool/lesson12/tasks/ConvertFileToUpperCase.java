package ru.academitschool.lesson12.tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ConvertFileToUpperCase {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"));
             PrintWriter writer = new PrintWriter("output.txt")) {
            while (scanner.hasNextLine()) {
                writer.println(scanner.nextLine().toUpperCase());
            }
        }
    }
}
