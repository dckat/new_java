package org.example.day22.solve;

import java.util.Arrays;

public class FindNum2 {
    public static void main(String[] args) {
        int num = 29183;
        int k = 1;
        int answer = 0;

        // int --> String --> char[]
        String num2 = String.valueOf(num);
        char[] c = num2.toCharArray();
        int index = Arrays.binarySearch(c, '1');
        answer = index + 1;
        System.out.println(answer);
    }
}
