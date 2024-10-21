package org.example.day15.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("name", "홍길동");
        map.put("age", 100);
        map.put("w", 22.2);
        map.put("gender", "m");
        System.out.println(map);
        System.out.println(map.get("age"));

        String name = (String)map.get("name");
        String s = name.substring(0, 1);
        System.out.println(s);
        System.out.println(s.equals("홍"));

        map.put("age", 101);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.remove("gender");
        System.out.println(map);
        System.out.println(map.containsKey("w"));
        System.out.println(map.containsValue("홍길동"));
        Set keys = map.keySet();
        System.out.println(keys);
        Collection values = map.values();
        System.out.println(values);
        System.out.println(map.put("w", 'w'));      // 이전값이 return 되어 출력.
        System.out.println(map);
        System.out.println(map.replace("w", 33.3)); // 이전값이 return 되어 출력.
        System.out.println(map);

        for (Object key : keys) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }
}
