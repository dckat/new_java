package org.example.day22.quiz;


import java.util.TreeSet;

public class Q4 {
    public static void main(String[] args) {
        int[] s4 = {11, 3, 78, 9, 2, 100};
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < s4.length; i++) {
            set.add(s4[i]);
        }
        Object[] arr = set.toArray();
        System.out.println("2번째 큰 값: " + arr[arr.length - 2]);
        System.out.println("2번째 작은 값: " + arr[1]);

        /*
        Arrays.sort(s4);
        System.out.println("2번째 큰 값: " + s4[s4.length - 2]);
        System.out.println("2번째 작은 값: " + s4[1]);
        */
    }
}
