package org.example.day10.생성자;

public class Car {
    // 필드, 멤버변수
    String model;
    String color;
    int maxSpeed;

    /*
    public Car() {
        // 컴파일 시, 내용도 없고 파라메터도 없는 생성자가 자동으로 생성
    }
    // ==> 묵시적으로 생성
    // ==> 클래스이름과 동일하고, 파라미터 없고, 내용도 없는 메소드가 생성됨.
    // ==> 파라미터 없는 생성자 메소드(constructor) --> 기본생성자(default constructor)
    // ==> 묵시적 생성자는 내용이 없음! (객체 생성해도 실행되는 것 없음.)
    // ==> 명시적 생성자는 객체 생성시 무엇인가 실행되는 것을 넣고 싶은 경우(알림서비스, 객체생성갯수 등)에 사용
    */

    public Car() {
        System.out.println("객체 생성됨!");
    }

    // 멤버메소드
    public void speedUp() {
        System.out.println("속도UP!");
    }
}
