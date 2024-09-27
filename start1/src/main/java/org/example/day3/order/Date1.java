package org.example.day3.order;

import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        // 입력할 때 자동으로 년월일, 시분초를 구해주고 싶다.
        Date date = new Date();
        int year = date.getYear() + 1900;      // 년
        int month = date.getMonth() + 1;    // 월
        int date1 = date.getDate();     // 일
        int day = date.getDay();        // 요일
        int hour = date.getHours();     // 시
        int minute = date.getMinutes(); // 분
        int second = date.getSeconds(); // 초

        System.out.println(year + " " + month + " " + date1 + " " + day + " " + hour + " " + minute + " " + second);

        // 오늘 무슨 요일인가요? 출력
        // 1. if문 활용
        if (day == 0) {
            System.out.println("오늘은 일요일입니다.");
        } else if (day == 1) {
            System.out.println("오늘은 월요일입니다.");
        } else if (day == 2) {
            System.out.println("오늘은 화요일입니다.");
        } else if (day == 3) {
            System.out.println("오늘은 수요일입니다.");
        } else if (day == 4) {
            System.out.println("오늘은 목요일입니다.");
        } else if (day == 5) {
            System.out.println("오늘은 금요일입니다.");
        } else if (day == 6) {
            System.out.println("오늘은 토요일입니다.");
        }

        // 2. switch문 활용
        switch (day) {
            case 0:
                System.out.println("오늘은 일요일입니다.");
                break;
            case 1:
                System.out.println("오늘은 월요일입니다.");
                break;
            case 2:
                System.out.println("오늘은 화요일입니다.");
                break;
            case 3:
                System.out.println("오늘은 수요일입니다.");
                break;
            case 4:
                System.out.println("오늘은 목요일입니다.");
                break;
            case 5:
                System.out.println("오늘은 금요일입니다.");
                break;
            case 6:
                System.out.println("오늘은 토요일입니다.");
                break;
        }
    }
}
