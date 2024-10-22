package org.example.day16.inter;

public class BananaAdapter implements IPhoneAdapter {
    @Override
    public void setflat() {
        System.out.println("검정색으로 납작하게 만들다.");
    }

    @Override
    public void twocentimeter() {
        System.out.println("짧은 줄로 2센티로 만들다.");
    }

    // 표준역할을 하는 인터페이스가 있는 경우 안쓰면 안되는지?
    // 써야하는 이유
}
