package org.example.day4.array;

public class 배열비교 {
    public static void main(String[] args) {
        String[] title = {"국어", "수학", "영어", "컴퓨터", "음악"};
        int[] n1 = {44, 66, 77, 22, 11};
        int[] n2 = {33, 55, 77, 22, 40};

        // 1. 1학기.2학기 동일한 점수의 과목수, 동일하지 않은 점수의 과목수
        // 2. 2학기에 성적이 오른 과목수
        // 3. 성적이 오른 과목명 출력
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;
        for (int i = 0; i < title.length; i++) {
            if (n1[i] == n2[i]) {
                cnt1++;
            }
            if (n1[i] != n2[i]) {
                cnt2++;
            }
            if (n1[i] < n2[i]) {
                cnt3++;
                System.out.println("성적이 오른 과목: " + title[i]);
            }
        }
        System.out.println("동일한 점수의 과목수: " + cnt1);
        System.out.println("동일하지 않은 점수의 과목수: " + cnt2);
        System.out.println("성직이 오른 과목수: " + cnt3);
    }
}
