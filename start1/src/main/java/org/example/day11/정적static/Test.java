package org.example.day11.정적static;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] n = {3, 5, 7, 9, 1};
        // 정렬 (오름차순)
        Arrays.sort(n);     // 파괴형 메소드 (원본 데이터를 수정)
        System.out.println(Arrays.toString(n));
        System.out.println(n);

        String s = Arrays.toString(n);  // 비파과형 메소드 (원본 데이터 유지)
        System.out.println(s);

        Random random = new Random();
        System.out.println(random.nextDouble());

        for (int i = 0; i < 5; i++) {
            // 0 ~ 0.999 사이의 랜덤한 값 (리턴: double)
            double n2 = Math.random();
            System.out.println(n2);
            System.out.println((int)(n2*10) + 1);
        }

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(cal.get(Calendar.AM_PM));
    }
}
