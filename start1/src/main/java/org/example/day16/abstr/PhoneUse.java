package org.example.day16.abstr;

public class PhoneUse {
    public static void main(String[] args) {
        // MegaPhone p1 = new MegaPhone();     // 인터페이스는 객체 생성 불가
        // ApplePhone p2 = new ApplePhone();   // 추상클래스는 객체 싱성 불가
        ApplePhone1 p3 = new ApplePhone1();    // 일반클래스는 객체 생성 가능
        ApplePhone2 p4 = new ApplePhone2();    // 일반클래스는 객체 생성 가능
        ApplePhone p5 = p3;

        System.out.println(MegaPhone.DATA);
    }
}
