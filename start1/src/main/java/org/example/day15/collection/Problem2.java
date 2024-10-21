package org.example.day15.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Problem2 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("안방", "TV");
        m.put("거실", "쇼파");
        m.put("부엌", "냉장고");
        m.put("현관", "신발");

        System.out.println(m);
        System.out.println(m.get("현관"));
        m.replace("거실", "책상");
        System.out.println(m);

        Set keys = m.keySet();
        System.out.println(keys.contains("베란다"));
        Collection values = m.values();
        System.out.println(values.contains("스타일러"));
        System.out.println(values.contains("TV"));

        // map은 key 목록을 Set으로 먼저 구해서 for-each로 값을 구해줌.
        for (Object x : keys) {
            System.out.println(x + ": " + m.get(x));
        }
    }
}
