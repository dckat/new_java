package org.example.day16.abstr;

public abstract class ApplePhone implements MegaPhone {

    int size;   // 필드 기능

    // 상속받은 곳에서 반드시 구현하도록 클래스에서 지정하고 싶을 때
    // 클래스 내에서도 추상 메소드 사용 가능하게 할수 있다.
    public abstract void camera();

    @Override
    public void siri() {
        System.out.println("시리기능 구현");
    }

    @Override
    public void map() {
        System.out.println("지도 기능 구현");
    }

    @Override
    public void internet() {
        System.out.println("인터넷 기능 구현");
    }

    @Override
    public void call() {
        System.out.println("전화 기능 구현");
    }

    @Override
    public void text() {
        System.out.println("문자 기능 구현");
    }

    @Override
    public void kakao() {
        System.out.println("kakao 기능 구현");
    }
}
