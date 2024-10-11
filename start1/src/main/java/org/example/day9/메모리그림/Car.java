package org.example.day9.메모리그림;

public class Car {
    // 필드 2개 ==> 멤버변수, 전역변수(자동초기화)
    int size;
    int speed;
    // 메소드 2개 ==> 멤버메소드
    public String print() {
        return size + " " + speed;
    }

    public void hi() {
        // 메소드 정의 ==> 실행되지 않음. 호출됐을 때 실행
        int temp = 10;      // 지역변수(초기화 X), 기본형 변수
        System.out.println("Speed Up! " + temp);
        // 내 클래스 내에서는 함수와 변수를 마음대로 호출하여 쓸 수 있음.
        // 외부에서는 참조형 변수 필요!
        System.out.println(print());
    }
}
