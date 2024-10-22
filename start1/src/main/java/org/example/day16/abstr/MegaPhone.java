package org.example.day16.abstr;

public interface MegaPhone extends Phone, GPS{
    // 상속받은 인터페이스의 메소드 포함 6개 정의
    // 인터페이스는 다중상속가능
    void siri();

    public static final String DATA = "대한민국";
}
