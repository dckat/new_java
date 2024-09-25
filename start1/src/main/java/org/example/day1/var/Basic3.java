package org.example.day1.var;

public class Basic3 {
    public static void main(String[] args) {
        System.out.println("기본형 연습3");
        // 기본형 4가지: 정수.실수.문자.논리
        // 정수: byte(127), shore, int, long
        byte age = 120;          // 약 +-120
        short count = 25000;     // 약 +-3만
        int money = 1000000;     // 약 +-21억
        long bank = 2222222222L; // long은 숫자 뒤에 L 또는 l 명시 (수 만으로는 int로 간주)

        // 실수: float(소수점 7째자리 까지), double
        float weight = 55.5f;   // float는 수 뒤에 F 또는 f 명시 (수 만으로는 double로 간주)
        double height = 188.8888;

        String name = "홍길동";   // 0글자 이상 (문자열) + 기본데이터가 아니라 대문자로 시작
        String job = "자바 프로그래머";

        // 내가 미래에 가질 재산 프린트 (money+bank)
        // 홍길동은 자바 프로그래머이다 프린트 (name+job)
        System.out.println("미래의 자산은 " + (money + bank) + "원");
        System.out.println(name + "은 " + job + "이다.");
    }
}
