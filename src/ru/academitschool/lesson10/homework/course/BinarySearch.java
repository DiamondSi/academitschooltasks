package ru.academitschool.lesson10.homework.course;

// 10.33
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int x = 40;
        int left = 0;
        int right = array.length - 1;
        System.out.println(binarySearch(array, left, right, x));
        System.out.println(binarySearch(array, x));
    }

    public static int binarySearch(int[] array, int left, int right, int x) {
        if (left > right) {
            return -1;
        }
        int middle = (right + left) / 2;
        if (x == array[middle]) {
            return middle;
        } else if (x > array[middle]) {
            return binarySearch(array, middle + 1, right, x);
        }
        return binarySearch(array, left, middle - 1, x);
    }

    public static int binarySearch(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;
        while (right >= left) {
            int middle = (right + left) / 2;
            if (x == array[middle]) {
                return middle;
            } else if (x > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
