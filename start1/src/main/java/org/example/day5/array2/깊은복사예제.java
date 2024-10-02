package org.example.day5.array2;

import java.util.Arrays;

public class 깊은복사예제 {
    public static void main(String[] args) {
        String[] subject = {"국어", "영어", "수학", "컴퓨터", "회화"};
        int[] term1 = {44, 66, 22, 99, 100};
        int[] term2 = term1.clone();
        term2[0] = 22;
        term2[2] = 88;

        System.out.println(Arrays.toString(term1));
        System.out.println(Arrays.toString(term2));

        String upSub = "";
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < term1.length; i++) {
            if (term1[i] == term2[i]) {
                cnt1++;
            }
            else if (term1[i] < term2[i]) {
                cnt2++;
                upSub += subject[i] + " ";
            }
        }
        System.out.println("동일과목수: " + cnt1);
        System.out.println("오른과목수: " + cnt2);
        System.out.println("오른과목명: " + upSub);
    }
}
