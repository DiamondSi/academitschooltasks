package ru.academitschool.lesson8.tasks.course;

// 8.20
// TODO доделать задачу
public class MaxSubstring {
    public static int findMaxLenSubstring(String string) {
        int subStringLength = 1;
        int subStringLengthMax = 1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i + 1) == string.charAt(i)) {
                ++subStringLength;
            } else {
                subStringLength=1;
            }
            if (subStringLength > subStringLengthMax) {
                subStringLengthMax = subStringLength;
                subStringLength = 1;
            }
        }
    }
}
