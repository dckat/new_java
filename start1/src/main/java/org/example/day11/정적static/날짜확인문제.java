package org.example.day11.정적static;

import java.time.LocalDateTime;

public class 날짜확인문제 {
    public static void main(String[] args) {
        // LocalDateTime을 이용하여 현재 날짜 구하기 (시작일)
        LocalDateTime start = LocalDateTime.now();
        // 2주후의 날짜인 종료일 구하기
        LocalDateTime end = start.plusWeeks(2);
        System.out.println(start);
        System.out.println(end);
        // 종료일이 시작일 후이면, 아직 대여중입니다.
        if (start.isBefore(end)) {
            System.out.println("아직 대여중입니다.");
        }
        // 그렇지 않으면, 대여를 종료합니다.
        else {
            System.out.println("대여를 종료합니다.");
        }
    }
}
