package org.example.day22.quiz;

import java.util.TreeSet;

public class Q7 {
    public static void main(String[] args) {
        int s7 = 234534567;
        TreeSet<Integer> set = new TreeSet<>();
        String s = String.valueOf(s7);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i) - '0');
        }

        Object[] arr = set.toArray();
        for (int i = 0; i < arr.length; i++) {
            sum += (int)arr[i];
        }
        System.out.println(sum);
    }
}
