package org.example.day3.array;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        // 주소가 들어가 있는 변수 (참조형 변수)
        int[] a = new int[3];   // {0, 0, 0}
        System.out.println(a);

        a[0] = 100;
        a[1] = 200;
        a[a.length - 1] = 300;

        System.out.println(Arrays.toString(a));
    }
}
