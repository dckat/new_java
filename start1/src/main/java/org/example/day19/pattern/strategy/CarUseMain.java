package org.example.day19.pattern.strategy;

public class CarUseMain {
    public static void main(String[] args) {
        Car car = new Truck();
        car.ride();
    }
}
