package org.example.day16.abstr;

public class ApplePhone1 extends ApplePhone {
    // 추상클래스를 상속받은 경우
    // 무조건. 추상메소드를 일반메소드로 오버라이드해서 구현해주어야 함.
    @Override
    public void camera() {
        System.out.println("렌즈 1개짜리 카메라로 찍다.");
    }
}
