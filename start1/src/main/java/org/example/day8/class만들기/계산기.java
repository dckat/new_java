package org.example.day8.class만들기;

public class 계산기 {
    // 필드 X
    // 함수명 (파라미터,...)
    // 파라미터 --> 매개변수
    // 사용하는 곳과 실제 처리하는 곳의 중간 다리 역할의 변수 --> 매개변수라고 함
    // 인자, 파라미터, 매개변수 <--> 인수(데이터, argument)
    public int 더하기(int x, int y) {
        System.out.println("더하기 기능 처리 내용");
        System.out.println(x + y);
        return x + y;
    }

    public void 빼기(int x, int y) {
        System.out.println("빼기 기능 처리 내용");
        System.out.println(x - y);
    }

    public void 곱하기(int x, int y) {
        System.out.println("곱하기 기능 처리 내용");
        System.out.println(x * y);
    }

    public void 나누기(int x, int y) {
        System.out.println("나누기 기능 처리 내용");
        System.out.println(x / y);
    }
}
