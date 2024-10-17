package org.example.day13.예외처리;

public class ExceptionHandleMain {
    public static void main(String[] args) {
        ErrorOccur2 error = new ErrorOccur2();
        error.call();   // 에러가 있는 메소드 호출
        // call 메소드 내에서 별도의 예외처리를 구현 안하면 아래 line 실행되지 않음
        System.out.println("에러 발생 후 실행될까요");
        System.out.println("에러 발생 후 실행될까요");
        System.out.println("에러 발생 후 실행될까요");
        System.out.println("에러 발생 후 실행될까요");
        System.out.println("에러 발생 후 실행될까요");
        System.out.println("에러 발생 후 실행될까요");
    }
}
