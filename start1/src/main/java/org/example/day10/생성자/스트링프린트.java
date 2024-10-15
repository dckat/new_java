package org.example.day10.생성자;

import java.util.ArrayList;
import java.util.HashSet;

public class 스트링프린트 {
    public static void main(String[] args) {
        // 1. 참조형 변수 출력시 toString()을 먼저 호출하여 출력할 문자열을 생성
        // 2. 만들어진 문자열을 출력.
        int[] n1 = {1, 2, 3};
        System.out.println(n1);

        ArrayList list = new ArrayList();   // 배열과 유사. 가변
        list.add(100);
        list.add(200);
        System.out.println(list);

        HashSet set = new HashSet();    // 가변 + 중복제거
        set.add(100);
        set.add(100);
        set.add(200);
        set.add(300);
        System.out.println(set);
    }
}
