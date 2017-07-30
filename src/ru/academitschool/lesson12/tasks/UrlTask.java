package ru.academitschool.lesson12.tasks;

// 12.42
public class UrlTask {
    public static void main(String[] args) {
        String string = "http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf";
        System.out.println(getServer(string));
    }

    public static String getServer(String url) {
        int startIndex = url.indexOf("://") + 3;
        int endIndex = url.indexOf("/", startIndex);
        if (endIndex < 0) {
            return url.substring(startIndex);
        }
        return url.substring(startIndex, endIndex);
    }
}
