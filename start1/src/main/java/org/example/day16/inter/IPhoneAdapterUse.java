package org.example.day16.inter;

public class IPhoneAdapterUse {
    public static void main(String[] args) {
        AppleAdapter apple = new AppleAdapter();
        BananaAdapter banana = new BananaAdapter();
        apple.setflat();
        apple.twocentimeter();
        banana.setflat();
        banana.twocentimeter();
    }
}
