package org.example.day19.pattern.strategy;

public class Taxi implements Car {
    @Override
    public void ride() {
        System.out.println("택시를 타고 가다.");
    }
}
