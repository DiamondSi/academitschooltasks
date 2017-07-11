package ru.academitschool.lesson3.tasks.home.additional;

import sun.util.calendar.LocalGregorianCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// 3.37
public class NextDate {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату в формате dd.MM.yyyy: ");
        String dateString = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date dateIn = dateFormat.parse(dateString);

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(dateIn);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        Date dateOut = calendar.getTime();
        System.out.println(dateFormat.format(dateOut));
    }
}
