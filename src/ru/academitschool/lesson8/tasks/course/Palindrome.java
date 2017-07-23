package ru.academitschool.lesson8.tasks.course;

// 8.21
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Аргентина манит негра"));
    }
//TODO сделать - учитывать только буквы, т.е. как-то смещаться может цикл while? и вообще пополам не делить :-)
    public static boolean isPalindrome(String string) {
        for (int i = 0; i <= string.length() / 2; i++) {
            if (Character.toLowerCase(string.charAt(i)) != Character.toLowerCase(string.charAt(string.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}
