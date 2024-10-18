package org.example.day14.crawl;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        // 고정, 여러개 ==> 배열
        // 가변, 여러개 ==> ArrayList
        // Elements(자식) --> ArrayList(부모)
        ArrayList list = new ArrayList();
        // 값 추가
        list.add("검색");
        list.add("메일");
        list.add("카페");

        // 전체 출력
        System.out.println(list);

        // 몇 개인지 count
        System.out.println(list.size());

        // 인덱스로 접근해서 꺼내보기
        System.out.println(list.get(0));    // <span class="blind">검색</span>

        // 값 삭제
        list.remove(2);
        System.out.println(list);

        // 배열과 동일함. 전체를 출력 (fori, for-each)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Object x: list) {
            System.out.println(x);
        }
    }
}
