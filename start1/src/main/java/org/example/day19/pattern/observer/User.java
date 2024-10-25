package org.example.day19.pattern.observer;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "이(가) 메시지를 보냄>> " + message);
    }
}
