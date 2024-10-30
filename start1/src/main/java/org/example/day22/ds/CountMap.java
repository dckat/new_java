package org.example.day22.ds;

import java.util.HashMap;

public class CountMap {
    public static void main(String[] args) {
        String[] s = {"홍", "김", "홍", "홍", "김", "홍"};
        HashMap<String, Integer> count = new HashMap<>();
        for (String x: s) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }   // for
        System.out.println(count);
        // 홍. 김
        System.out.println(count.get("홍"));
        System.out.println(count.get("김"));
    }
}
