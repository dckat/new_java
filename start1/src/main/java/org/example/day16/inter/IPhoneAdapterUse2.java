package org.example.day16.inter;

public class IPhoneAdapterUse2 {
    public static void main(String[] args) {
        // AppleAdapter a = new BananaAdapter();   <-- 개념의 크다/작다 비교가 안됨. (에러)
        IPhoneAdapter a = new AppleAdapter();
        IPhoneAdapter b = new BananaAdapter();
        a.setflat();
        a.twocentimeter();
        b.setflat();
        b.twocentimeter();
    }
}
