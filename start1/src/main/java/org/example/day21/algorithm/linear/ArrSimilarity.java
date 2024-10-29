package org.example.day21.algorithm.linear;

import java.util.Arrays;

public class ArrSimilarity {
    public static void main(String[] args) {
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};
        int[] s3 = {11, 22, 33, 44, 55};
        System.out.println(Arrays.equals(s1, s2));
        System.out.println(Arrays.equals(s1, s3));
    }
}
