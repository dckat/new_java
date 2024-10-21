package org.example.day15.quiz.q4;

import java.util.ArrayList;

public class GenericStack <T>{
    T data;
    ArrayList<T> list = new ArrayList<>();

    public void push(T data) {
        list.add(data);
    }

    public T pop() {
        return list.remove(list.size()-1);
    }

    public ArrayList<T> getList() {
        return list;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public T peek() {
        return list.get(list.size()-1);
    }
}
