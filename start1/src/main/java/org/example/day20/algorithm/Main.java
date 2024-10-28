package org.example.day20.algorithm;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num_list = {1, 2, 3, 4, 5};
        // int[] num_list = {15, 98, 23, 2, 15};
        int n = 3;
        // int n = 20;
        int answer = s.solution(num_list, n);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] == n) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}
