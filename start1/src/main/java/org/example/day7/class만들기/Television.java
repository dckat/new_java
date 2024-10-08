package org.example.day7.class만들기;

public class Television {
    // 속성(특징, 특성): attribute, property ==> 클래스를 만들 때 넣을 항목들
    // 항목: item, field(필드)
    //  사이즈, 가격, 제조회사  ==> 멤버변수
    //  다른 항목들을 선택할 수 있지만, 사용자가 선택한 항목에 대해서만 변수 생성
    public String size;    // 전역변수, 챰조형 변수, null로 초기화
    public int price;  // 전역변수, 기본형 변수, 0으로 초기화
    public String company; // 전역변수, 참조형 변수, null로 초기화

    // 기능(동작): function, method(메소드, 절차/방법)
    // 전원을 켜다, 전원을 끄다, 채널을 바꾸다
    // 멤버 메소드
    public void powerOn() {
        // 전원을 켜기위한 방법과 절차를 구현
        System.out.println("TV가 켜졌다...");
    }

    public void powerOff() {
        // 전원을 끄기위한 방법과 절차를 구현
        System.out.println("TV가 꺼졌다...");
    }

    public void changeChannel() {
        // 전원을 켜기위한 방법과 절차를 구현
        System.out.println("채널을 바꿨다...");
    }
}
