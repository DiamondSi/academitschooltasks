package ru.academitschool.lesson8.tasks.course;

// 8.21
public class Palindrome {
    public static void main(String[] args) {
        String string1 = "Аргентина манит негра.";
        String string2 = "А, Роза упала на лапу Азора!";
        String string3 = "Мама мыла раму.";
        System.out.printf("\"%s\" - is palindrome: %b%n", string1, isPalindrome(string1));
        System.out.printf("\"%s\" - is palindrome: %b%n", string2, isPalindrome(string2));
        System.out.printf("\"%s\" - is palindrome: %b%n", string3, isPalindrome(string3));
    }

    public static boolean isPalindrome(String string) {
        for (int i = 0, j = string.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetter(string.charAt(i))) {
                ++i;
            }
            while (i < j && !Character.isLetter(string.charAt(j))) {
                --j;
            }
            if (Character.toLowerCase(string.charAt(i)) != Character.toLowerCase(string.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}
