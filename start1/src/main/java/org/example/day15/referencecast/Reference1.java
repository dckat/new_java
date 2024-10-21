package org.example.day15.referencecast;

public class Reference1 {
    public static void main(String[] args) {
        // 형변환은 크다/작다의 관계가 없으면 사용 불가능
        String[] s = {"가", "나"};
        int[] s2 = {1, 2};
        // s = s2;
        // s2 = s;
    }
}
