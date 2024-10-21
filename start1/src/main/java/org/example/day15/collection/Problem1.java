package org.example.day15.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Problem1 {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("서울");
        s.add("LA");
        s.add("도쿄");
        s.add("제주도");
        s.add("부산");
        System.out.println(s);

        // 반복문 활용 하나씩 꺼내와서 처리
        // 순서X. 인덱스 없음
        // 인덱스 없어도 for-each 가능
        for (Object x: s) {
            System.out.println(x);
        }

        // 반복자(Iterator)
        Iterator it = s.iterator();
        // 꺼내줄것이 있는지 먼저 체크
        while (it.hasNext()) {
            Object x = it.next();
            System.out.println(x);
        }
    }
}
