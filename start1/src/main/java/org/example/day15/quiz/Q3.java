package org.example.day15.quiz;

import org.example.day15.referencecast.Person;

import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        // String을 Object로 업캐스팅(자동형변환)하여 값을 저장
        list.add("자바");

        // Person을 Object로 업캐스팅(자동형변환)하여 값을 저장
        list.add(new Person());

        // ArrayList --> Collection --> Object로 업캐스팅(자동형변환)하여 값을 저장
        list.add(new ArrayList());

        // Object --> String으로 다운캐스팅(강제형변환)하여 list의 0번째 인덱스 값을 꺼내옴
        String s = (String)list.get(0);

        // 기본형 변수를 Integer 클래스로 박싱 후 Object 클래스로 업캐스팅(자동형변환)하여 값을 저장
        list.add(100);

        // Object --> Integer로 다운캐스팅(강제형변환)후 int로 언박싱하여 값을 꺼내옴
        int i = (Integer)list.get(3);
    }
}
