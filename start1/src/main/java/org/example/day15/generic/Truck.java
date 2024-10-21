package org.example.day15.generic;

public class Truck<T1, T2> {
    // 객체 생성할때 타입을 내 마음대로 지정해서 쓸 수 있음.
    // 클래스 만들때, 타입을 지정하지 않음
    // 특정하게 타입을 지정(specific)하지 않음.(generic)
    T1 weight;
    T2 distance;

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                ", distance=" + distance +
                '}';
    }
}
