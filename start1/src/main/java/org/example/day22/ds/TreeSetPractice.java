package org.example.day22.ds;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        // TreeSet<Integer> n = new TreeSet<>();   // 오름차순 자동정렬
        TreeSet<Integer> n = new TreeSet<>(Collections.reverseOrder());

        n.add(100);
        n.add(15);
        n.add(1);
        n.add(200);
        n.add(5);
    }
}
