package org.example.day1.var;

public class Basic2 {
    public static void main(String[] args) {
        System.out.println("기본형 연습2");
        // 기본형 4가지: 정수.실수.문자.논리
        // 가을이다. 관련된 데이터를 4가지 넣어보고 프린트
        // 상수도 추가. final을 붙임. 변수명은 대문자로

        int month = 10;
        double tempThis = 15.6;     // 낙타표기법: package.class.변수 이름의 이어붙이기에 사용
        final char COLOR = 'b';
        boolean rain = false;

        System.out.println("이번달은 " + month + "월");
        System.out.println("기온은 " + tempThis + "도");
        System.out.println("색은 " + COLOR);
        System.out.println("비가 오나 " + rain);

        month = 9;      // 값 변경 시에는 타입을 다시 지정할 필요 없음
        // COLOR = 'r'; <- 상수이므로 값 변경이 불가

        // nowTime = 14;                // nowTime 변수 지정을 하지 않음 (에러)
        // int nowTime;                 // nowTime 변수는 지정했으나 값을 지정 X -> 출력과 연산 모두 불가

        // 변수는 반드시 초기화를 시켜주어야 함.
        int nowTime = 0;    // 초기화 (초기값)
        nowTime = 17;
        System.out.println(nowTime);
    }
}
