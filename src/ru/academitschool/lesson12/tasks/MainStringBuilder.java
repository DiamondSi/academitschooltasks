package ru.academitschool.lesson12.tasks;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

// 12.3
public class MainStringBuilder {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(new FileInputStream("in.txt"))) {
//            int numbersCount = scanner.nextInt();
//            double[] numbers = new double[numbersCount];
//            for (int i = 0; i < numbersCount; ++i) {
//                numbers[i] = scanner.nextDouble();
//            }
//            System.out.println(Arrays.toString(numbers));
            double[] numbers = new double[100];
            int i = 0;
            while (scanner.hasNextDouble()) {
                numbers[i] = scanner.nextDouble();
                ++i;
            }
            int numbersCount = i;
            for (int j = 0; j < numbersCount; ++j) {
                System.out.println(numbers[j] + ", ");
            }
        }
        try (PrintWriter writer = new PrintWriter(new FileWriter("out.txt", true))) {
            writer.println("OK");
        }
    }
}
