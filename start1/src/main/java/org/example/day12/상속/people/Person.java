package org.example.day12.상속.people;

public class Person {
    String gender;
    String name;

    public Person(String gender, String name) {
        // super() --> 컴파일할 때 무조건 생성자 첫 줄은 super()가 자동 생성
        this.gender = gender;
        this.name = name;
    }

    public void sleep() {
        System.out.println("잠자다.");
    }

    public void eat() {
        System.out.println("먹는다.");
    }
}
