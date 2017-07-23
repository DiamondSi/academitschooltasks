package ru.academitschool.lesson9.tasks.homework.arraytasks;

import java.util.Arrays;

// 9.43
public class StringArray {
    public static void main(String[] args) {
        String[] strings = {"string1", "string2", "string3"};
        System.out.println(Arrays.toString(strings));
        stringArrayToUpperCase(strings);
        System.out.println(Arrays.toString(strings));
    }

    public static void stringArrayToUpperCase(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].toUpperCase();
        }
    }
}
