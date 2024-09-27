package org.example.day3.quiz;

import java.util.Arrays;
import java.util.Random;

public class Q1basic {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[20];

        for (int i = 0; i < 20; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        System.out.println("배열 프린트: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("오름 차순 정렬 후 프린트: " + Arrays.toString(arr));
        System.out.println("MAX: " + arr[arr.length - 1]);
        System.out.println("MIN: " + arr[0]);
    }
}
