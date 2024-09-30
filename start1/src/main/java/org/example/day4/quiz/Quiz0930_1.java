package org.example.day4.quiz;

public class Quiz0930_1 {
    public static void main(String[] args) {
        // ppt p.48 성적변동문제
        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {99, 100, 88, 80, 70};

        // 1-1. 성적이 2학기에 향상된 학생의 수 출력
        // 1-2. 성적이 1.2학기 동일한 학생의 수 출력
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < term1.length; i++) {
            if (term1[i] < term2[i]) {
                cnt1++;
            }
            else if (term1[i] == term2[i]) {
                cnt2++;
            }
        }
        System.out.println("성적이 향상된 학생의 수: " + cnt1);
        System.out.println("성적이 동일한 학생의 수: " + cnt2);
    }
}
