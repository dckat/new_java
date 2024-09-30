package org.example.day4.review;

public class 배열생성 {
    public static void main(String[] args) {
        // 1. 배열의 생성
        // 1-1. 처음부터 값을 알고 있는 경우
        int[] days = {1, 3, 4, 5, 6};
        // 1-2. 처음에는 모르는 경우
        String[] doing = new String[5];     // {null, null, ...}

        doing[0] = "쉬기";      // String --> "", char --> ''
        doing[1] = "서울숲";
        System.out.println(days);
        System.out.println(doing);

        double[] temp = {22, 20, 15, 17, 19};

        // one-by-one으로 출력
        /*
        System.out.println(days[0] + " " + doing[0] + " " + temp[0]);
        System.out.println(days[1] + " " + doing[1] + " " + temp[1]);
        */

        // C타입 for문으로 반복히여 출력
        for (int i = 0; i < temp.length; i++) {
            System.out.println(days[i] + " " + doing[i] + " " + temp[i]);
        }

        // temp 배열을 앞에서부터 순서대로 있는지 체크하고 꺼내어 t 변수에 넣어주는 for문 (for-each)
        // 간단하지만 기능이 꺼내오는 용도로만 사용 가능
        for (double t : temp) {
            System.out.println(t);
        }
    }
}
