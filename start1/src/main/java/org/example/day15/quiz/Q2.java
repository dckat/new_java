package org.example.day15.quiz;

import java.util.HashMap;

public class Q2 {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put(100, "김데이");
        map.put(200, "김사전");
        map.put(300, "김구조");
        map.put(400, "김자료");

        map.remove(200);
        map.replace(300, "김충성");

        for (Object key : map.keySet()) {
            System.out.println("고객번호: " + key + ", 이름: " + map.get(key));
        }
    }
}
