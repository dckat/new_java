package org.example.day21.algorithm.linear;

import java.util.Arrays;

public class ArraySlice {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int[] sub1 = Arrays.copyOfRange(list, 1, 3);
        // 3.4.5번만 가져오기
        int[] sub2 = Arrays.copyOfRange(list, 2, 5);
        // 1.2.3번만 가져오기
        int[] sub3 = Arrays.copyOfRange(list, 0, 3);
        System.out.println(Arrays.toString(sub1));
        System.out.println(Arrays.toString(sub2));
        System.out.println(Arrays.toString(sub3));
    }
}
