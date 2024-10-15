package org.example.day11.정적static;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class 시간다루기 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("현재 시간: " + now.format(dtf));

        LocalDateTime result1 = now.plusYears(1);
        System.out.println("1년 덧셈: " + result1.format(dtf));

        LocalDateTime result2 = now.minusMonths(2);
        System.out.println("2월 뺄셈: " + result2.format(dtf));

        LocalDateTime result3 = now.plusDays(7);
        System.out.println("7일 덧셈: " + result3.format(dtf));

        LocalDateTime myDateTime = LocalDateTime.of(2000, 1, 1, 0, 0, 0);
        System.out.println(dtf.format(myDateTime));
        System.out.println(myDateTime.plusYears(18));
    }
}
