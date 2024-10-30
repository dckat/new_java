package org.example.day22.quiz;

import java.util.TreeSet;

public class Q3 {
    public static void main(String[] args) {
        int[] s3 = {11, 3, 78, 9, 2, 2, 100, 3};
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < s3.length; i++) {
            treeSet.add(s3[i]);
        }
        System.out.println("가장 큰 값: " + treeSet.last());
        System.out.println("가장 작은 값: " + treeSet.first());
    }
}
