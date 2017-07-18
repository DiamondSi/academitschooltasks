package ru.academitschool.lesson8.tasks.course;

// 8.20
public class MaxSubstring {
    public static void main(String[] args) {
        System.out.println(findMaxLenSubstring("0ааадееееееееееееееЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕггггвгггггггг"));
    }

    public static int findMaxLenSubstring(String string) {
        int subStringLength = 1;
        int subStringLengthMax = 1;
        for (int i = 1; i < string.length(); i++) {
            if (Character.toLowerCase(string.charAt(i - 1)) == Character.toLowerCase(string.charAt(i))) {
                ++subStringLength;
                if (subStringLength > subStringLengthMax) {
                    subStringLengthMax = subStringLength;
                }
            } else {
                subStringLength = 1;
            }
        }
        return subStringLengthMax;
    }
}
