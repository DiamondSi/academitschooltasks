package ru.academitschool.lesson12.tasks;

// 12.41
public class StringBuilderTask {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            stringBuilder.append(i).append(", ");
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        String string = stringBuilder.toString();
        System.out.println(string);
    }
}
