package org.example.day22.quiz;

import java.util.HashMap;

public class Q2 {
    public static void main(String[] args) {
        String[] s2 = {"밥", "커피", "밥", "커피", "밥", "밥"};
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s2.length; i++) {
            hashMap.put(s2[i], hashMap.getOrDefault(s2[i], 0) + 1);
        }
        System.out.println("밥을 먹은 횟수: " + hashMap.get("밥"));
        System.out.println("커피를 먹은 횟수: " + hashMap.get("커피"));

        if (hashMap.get("밥") > hashMap.get("커피")) {
            System.out.println("밥을 더 먹었군요.");
        }
        else if (hashMap.get("커피") > hashMap.get("밥")) {
            System.out.println("커피를 더 마셨군요.");
        }
    }
}
