package org.example.day21.algorithm.linear;

import org.example.ArrPrint;

public class ReverseArray {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};

        // 그대로 옮겨보자
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        ArrPrint.print(answer);
        // 뒤집어서 옮겨보자.
        int[] answer2 = new int[num_list.length];
        int j = num_list.length - 1;
        for (int i = 0; i < num_list.length; i++) {
            answer2[j] = num_list[i];
            j--;
        }
        ArrPrint.print(answer2);
    }
}
