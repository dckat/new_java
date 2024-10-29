package org.example.day21.algorithm.linear;

import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        Solution2 s = new Solution2();
        int[] a = s.solution(n);
        System.out.println(Arrays.toString(a));
    }
}

class Solution2 {
    public int[] solution(int[] n) {
        int[] answer = new int[2];
        answer[0] = 0;
        answer[1] = 0;
        for (int x: n) {
            if (x % 2 == 0) answer[0]++;
            else answer[1]++;
        }
        return answer;
    }
}
