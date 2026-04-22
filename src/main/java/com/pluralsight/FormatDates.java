package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();

        //Formatter 1
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        //Formatter 2
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //Formatter 2
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE dd, yyyy");

        //Formatter 4
        ZonedDateTime gmt = ZonedDateTime.now();
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");

        //Formatter 5
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("h:mm 'on'  dd-MMM-yyyy");

        //Outputs
        System.out.println(today.format(formatter1));
        System.out.println(today.format(formatter2));
        System.out.println(today.format(formatter3));
        System.out.println(today.format(formatter4));
        System.out.println(today.format(formatter5));
    }
}
