package org.example.day15.referencecast;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Reference4 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();   // 가변길이. 여러 데이터를 다룰 때 사용
        list.add("hong");       // String --> Object (자동형변환)
        list.add(new Date());   // Date --> Object (자동형변환)
        list.add(new Random()); // Random --> Object (자동형변환)
        list.add(new Truck());  // Truck --> (Car) --> Object (자동형변환)

        // 기본형을 참조형에 넣고 싶을 때
        // 참조형(Wrapper Class. 포장클래스)으로 만들어주면 됨.
        // 자동 형변환인 경우 자동으로 해줌
        list.add(100);      // 정수. int - (오토박싱) -> Integer --> Object
        list.add(11.1);     // 실수. double --> Double --> Object
        list.add(true);     // boolean --> Boolean --> Object
        list.add('a');      // char --> Character --> Object

        System.out.println(list);

        // 넣을 때는 다 모으고 싶어서 Object로 형변환해서 다 집어 넣음. add(Object o)
        System.out.println("-------------------");
        // 하나씩 꺼내서 확인
        System.out.println(list.get(0));
        Object name = list.get(0);
        // System.out.println(name.contains());  // XXX
        // Object으로 넣어두었기 때문에 Object로 꺼내왔고. String 메소드를 가지고 있지 않음
        // 꺼내서 String 메소드를 쓰기 위해서는 String으로 다시 형변환을 해주어야 함
        String name2 = (String)list.get(0);     // String(작) <-- Object(큰). 강제형변환
        System.out.println(name2.contains("kim"));

        // 날짜를 꺼내서 현재 시/분 출력
        Date date = (Date)list.get(1);  // Date(작) <-- Object(큰). 강제형변환
        System.out.println(date.getHours() + ":" + date.getMinutes());

        int x = (Integer)list.get(4);   // int <-- Integer <-- Object
        System.out.println(x);

        Double y = (Double)list.get(5);
        double y2 = (double)list.get(5);
    }
}
