package ru.academitschool.lesson11.tasks.course;
// 11.23
public class InsertionSort {
    public static void sortArray(int[] array) {
//        boolean isSorted = false;
        for (int i = 1; i < array.length - 1; ++i) {
//            isSorted = true;
            int temp=array[i];

            for (int j = i-1; j>0; --j) {
                if (j==0 || temp >= array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
//                    isSorted = false;
                }
            }
        }
    }
}
