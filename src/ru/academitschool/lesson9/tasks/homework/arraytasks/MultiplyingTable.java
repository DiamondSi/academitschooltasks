package ru.academitschool.lesson9.tasks.homework.arraytasks;

// 9.47

import java.util.Arrays;

public class MultiplyingTable {
    public static void main(String[] args) {
        int tableSize = 10;
        int[][] multiplyingTable = createTable(tableSize);
        for (int[] s : multiplyingTable) {
            System.out.println(Arrays.toString(s));
        }
    }

    public static int[][] createTable(int tableSize) {
        int[][] table = new int[tableSize][tableSize];
        for (int i = 0; i < tableSize; i++) {
            for (int j = 0; j < tableSize; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
