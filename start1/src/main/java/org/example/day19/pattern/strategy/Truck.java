package org.example.day19.pattern.strategy;

public class Truck implements Car {
    @Override
    public void ride() {
        System.out.println("트럭을 타고 가다.");
    }
}
