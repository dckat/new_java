package org.example.day21.algorithm.linear;

import java.util.Arrays;

public class Americano {
    public static void main(String[] args) {
        int money = 5500;
        Solution s = new Solution();
        int[] a = s.solution(money);
        System.out.println(Arrays.toString(a));
    }
}

class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        // 잔수 계산: 몫
        answer[0] = money / 5500;
        // 잔돈 계산: 나머지
        answer[1] = money % 5500;
        return answer;
    }
}