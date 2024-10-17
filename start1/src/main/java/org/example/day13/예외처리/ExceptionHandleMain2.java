package org.example.day13.예외처리;

public class ExceptionHandleMain2 {
    public static void main(String[] args) {
        ErrorOccur3 error = new ErrorOccur3();
        try {
            error.call();   // 에러가 있는 메소드 호출
        } catch (Exception e) {
            System.out.println("부르는 곳에서 예외처리함.");
        }
        // call 메소드 내에서 별도의 예외처리를 구현 안하면 아래 line 실행되지 않음
        System.out.println("에러 발생 후 실행될까요");
        System.out.println("에러 발생 후 실행될까요");
        System.out.println("에러 발생 후 실행될까요");
        System.out.println("에러 발생 후 실행될까요");
        System.out.println("에러 발생 후 실행될까요");
        System.out.println("에러 발생 후 실행될까요");
    }
}
