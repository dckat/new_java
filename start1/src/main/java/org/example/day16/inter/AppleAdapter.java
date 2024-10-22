package org.example.day16.inter;

public class AppleAdapter implements IPhoneAdapter {
    @Override
    public void setflat() {
        System.out.println("흰색으로 납작하게 만들다.");
    }

    @Override
    public void twocentimeter() {
        System.out.println("긴줄을 사용하여 2센티로 만들다.");
    }
}
