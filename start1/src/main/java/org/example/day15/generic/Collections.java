package org.example.day15.generic;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("홍길동1");
        list.add("홍길동2");
        list.add("홍길동3");
        list.add("홍길동4");

        String name = list.get(0);  // 강제형변환
        System.out.println(name);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "엄마");
        String value = map.get(1);
        System.out.println(value);
    }
}
