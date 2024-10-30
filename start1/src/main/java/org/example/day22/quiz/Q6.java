package org.example.day22.quiz;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] s5 = {11, 3, 78, 9, 2, 2, 100, 3};
        int[] s6 = new int[s5.length];


        int j = s5.length - 1;
        for (int i = 0; i < s5.length; i++) {
            s6[i] = s5[j];
            j--;
        }
        System.out.println(Arrays.toString(s6));
    }
}
