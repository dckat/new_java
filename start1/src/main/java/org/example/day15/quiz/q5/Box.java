package org.example.day15.quiz.q5;

public class Box<T> {
    T value;

    public void setContent(T value) {
        this.value = value;
    }

    public T getContent() {
        return value;
    }
}
