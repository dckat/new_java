package org.example.day12.상속.people;

public class Woman extends Person {
    int walk;

    public Woman(String gender, String name, int walk) {
        super(gender, name);
        this.walk = walk;
    }
}
