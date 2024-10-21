package org.example.day15.quiz;

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        String[] s1 = {"박소정", "김경민", "소지현", "김개빈"};
        String[] s2 = {"국어", "수학", "영어", "컴퓨터"};
        ArrayList list1 = new ArrayList();

        for (int i = 0; i < s1.length; i++) {
            list1.add(s1[i]);
        }
        System.out.println("초기 참가자 목록: " + list1);

        list1.remove("김경민");
        System.out.println("탈락 후 참가자 목록: " + list1);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println((i+1) + "등: " + list1.get(i));
        }
        System.out.println("-------------------");

        ArrayList list2 = new ArrayList();
        for (int i = 0; i < s2.length; i++) {
            list2.add(s2[i]);
        }
        System.out.println("처음 시험별 과목: " + list2);

        for (int i = 0; i < 3; i++) {
            list2.remove(0);
            System.out.println((i+1) + "회차 시험을 한 날은 과목: " + list2);
        }
    }
}
