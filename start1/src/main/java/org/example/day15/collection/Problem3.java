package org.example.day15.collection;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("수업");
        list.add("스터디");
        list.add("구보");
        list.add("식사");
        list.add("복습");
        System.out.println(list);
        System.out.println(list.get(0) + " " + list.get(list.size() - 1));
        list.set(2, "청소");
        System.out.println(list);
    }
}
