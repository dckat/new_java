package org.example.day13.quiz.inherit;

public class Main {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.setBatteryCapacity(80);
        s.setCameraResolution(20);
        s.setColor("red");
        System.out.println(s);

        Tablet t = new Tablet();
        t.setBatteryCapacity(80);
        t.setIsConnected(false);
        t.setColor("blue");
        System.out.println(t);

        Laptop l = new Laptop();
        l.setBatteryCapacity(100);
        l.setColor("silver");
        System.out.println(l);
    }
}
