package org.example.day12.상속.people;

public class Man extends Person {
    int power;

    public Man(String gender, String name, int power) {
        // super()는 항상 맨 첫 줄에 써야함.
        super(gender, name);
        this.power = power;
    }

    public void run() {
        System.out.println("달리다.");
    }
}
