package org.example.day22.ds;

import java.util.TreeSet;

public class GreaterK {
    public static void main(String[] args) {
        int[] n = {1, 12, 33, 6, 18, 9, 10, 10};
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n.length; i++) {
            set.add(n[i]);
        }
        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());

        Object[] arr = set.toArray();
        System.out.println(arr[arr.length - 1]);
        System.out.println(arr[arr.length - 2]);
        System.out.println(arr[arr.length - 3]);

        int k2 = 3;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[k2 - 1]);
    }
}
