package org.example.day16.inter;

// 인터페이스는 추상메소드로만 구현
// 필드는 만들지 않음
public interface TestInterface {
    // 설계도 역할!
    // 아직 완전한 클래스가 아님.
    // 불완전한 메소드 == 추상(abstract) 메소드
    // public abstract는 생략 가능
    public abstract void test(String name);  // 추상메소드
    // 검증하는 메소드(이름: result). 입력은 시간과 분을 받음. 리턴은 boolean
    public abstract boolean result(int hour, int minute);
}
