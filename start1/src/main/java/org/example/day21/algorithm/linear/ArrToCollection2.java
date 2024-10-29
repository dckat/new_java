package org.example.day21.algorithm.linear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrToCollection2 {
    public static void main(String[] args) {
        Integer[] x = {1, 2, 3, 4, 5};

        List<Integer> list1 = new ArrayList<>();
        for (int num: x) {
            list1.add(num*10);
        }
        Collections.reverse(list1);
        System.out.println(list1);

        List<Integer> list2 = Arrays.asList(x);
        list2.add(6);
        list2.add(7);
        System.out.println(list2);
    }
}
