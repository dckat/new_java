package org.example.day12.상속;

public class Truck extends Car{
    // 묵시적
    // 필드: 2개
    // 메소드: 2개

    // 트럭 클래스에 필드 + 메소드 추가
    int weight;
    public void move() {
        System.out.println(speed + "속도로 짐을 나르다.");
    }

    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
