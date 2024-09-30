package org.example.day4.quiz;

import java.util.Arrays;
import java.util.Random;

public class Q2_Array_Basic {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr2 = new int[10];

        Random r = new Random();

        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(50) + 1;
            arr2[i] = r.nextInt(50) + 51;
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println("배열 1: " + Arrays.toString(arr));
        System.out.println("배열 2: " + Arrays.toString(arr2));
        System.out.println(arr[arr.length - 1] + arr2[arr2.length - 1]);
        System.out.println(arr[0] + arr2[0]);
    }
}
