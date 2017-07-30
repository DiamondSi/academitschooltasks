package ru.academitschool.lesson12.tasks;

// 12.42
public class UrlTask {
    public static void main(String[] args) {
        String string = "http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf";
        System.out.println(getServer(string));
    }

    public static String getServer(String url) {
        if (url.indexOf("/", url.indexOf("://") + 3) >= 0) {
            return url.substring(url.indexOf("://") + 3, url.indexOf("/", url.indexOf("://") + 3));
        }
        return url.substring(url.indexOf("://") + 3);
    }
}
