package org.example.day2.review;

public class Test1 {
    public static void main(String[] args) {
        // 기본형 변수 정리 - 정수.실수.문자(한 글자).논리
        float temp = 23.5f;     // ==> double로 해도 무관 (정확한 소수점 필요시)
        byte date = 26;  // -128 ~ 127 ==> int로 해도 무관
        final char DAY = '목';   // 상수값은 변수명을 대문자로 처리
        boolean food = false;

        String roomNo = "강의장 6호";

        // 데이터 출력
        System.out.println("온도: " + temp + "도");
        System.out.println("날짜: " + date + "일");
        System.out.println("요일: " + DAY);
        System.out.println("음식 여부: " + food);
        System.out.println("강의실 번호: " + roomNo);
    }
}
