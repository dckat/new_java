package org.example.day22.quiz;

import java.util.HashMap;

public class Q5 {
    public static void main(String[] args) {
        String s5 = "감고나무감나무신세계신";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s5.length(); i++) {
            map.put(s5.charAt(i), map.getOrDefault(s5.charAt(i), 0) + 1);
        }
        System.out.println(map);
    }
}
