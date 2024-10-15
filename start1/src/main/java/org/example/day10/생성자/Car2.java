package org.example.day10.생성자;

public class Car2 {
    // 필드, 멤버변수
    String model;
    String color;
    int maxSpeed;

    public Car2() {
        System.out.println("객체 생성됨!");
    }

    public Car2(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Car2(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car2(String model) {
        this.model = model;
    }

    // 멤버메소드
    public void speedUp() {
        System.out.println("속도UP!");
    }

    // 재정의(기존에 있었던 메소드를 내 마음대로 수정해서 쓰고 싶을때)
    // 기존에 있던 것을 그대로 다시 씀.
    // Car2 c1 = new Car2();
    // c1을 print 하면, "패키지이름.클래스이름@주소" <- 출력
    // c1을 print 하라고 하면, 내부적으로 toString() 함수를 통해 위의 문자열로 만들어 출력
    // 주소가 가르키고 있는 힙영역의 객체의 필드값을 toString()으로 만들어서 그 값을 출력하는 것이 더 유용!
    /*
    public String toString() {
        return "생성된 객체의 힙영역 데이터: " + model + " " + color + " " + maxSpeed;
    }
    */

    public String toString() {
        return "Car2{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
