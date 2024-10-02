package org.example.day5.review;

import java.util.Random;

public class Exam1 {
    public static void main(String[] args) {
        /* 문제 1
        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {99, 100, 88, 80, 70};

        // 1-1. 성적이 2학기에 향상된 학생의 수 출력
        // 1-2. 성적이 1.2학기 동일한 학생의 수 출력
        // 누적 시키는 변수는 반복문 안에 넣으면 X
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < term1.length; i++) {
            if (term1[i] < term2[i]) {  // 조건에 해당하는 구문은 결과가 무조건 논리형 (true/false)
                cnt1++;
            }
            else if (term1[i] == term2[i]) {
                cnt2++;
            }   // if
        }   // for
        System.out.println("성적이 향상된 학생의 수: " + cnt1);
        System.out.println("성적이 동일한 학생의 수: " + cnt2);
        */

        /* 문제 2
        Scanner sc = new Scanner(System.in);
        int[] data = new int[3];    // {0,0,0}
        for (int i = 0; i < 3; i++) {
            System.out.print("숫자 입력: ");
            data[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(data));
        // Arrays.toString(data) ==> 배열의 값을 데이터를 "[값,값,값]" 형태의 String으로 만들어준다.
        // 합, 평균 (2번째 패턴)
        int sum = 0;
        for (int x : data) {
            sum += x;   // sum = sum + x;
        }
        System.out.println(sum);

        // 산술 연산 시 하나라도 실수이면 결과는 실수이다.
        // 4번.5번: 정수/정수 -> 정수로 바꾼 후에 double로 캐스팅 (n.0으로 결과값 표현)
        System.out.println(sum / (double)data.length);          // 1
        System.out.println((double)sum / data.length);          // 2
        System.out.println((double)sum / (double)data.length);  // 3
        System.out.println((double) (sum / data.length));       // 4
        double result = (double)(sum / data.length);            // 5
        System.out.println(result);
        */

        /* 문제 3
        Random r = new Random(44);
        int[] n = new int[1000];
        int sum2 = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(1000) + 1;     // 1~1000
            sum2 += n[i];       // sum2 = sum2 + n[i];
        }
        System.out.println(Arrays.toString(n));
        System.out.println(n[0] + n[2] + n[4] + n[99] + n[989]);
        System.out.println(sum2);
        System.out.println((double)sum2 / n.length);
        */

        /* 문제 4
        Scanner sc = new Scanner(System.in);
        System.out.print("가고 싶은 곳 (보기, 1)백두산, 2)한라산, 3)후지산) 입력: ");

        // 입력 --> 처리(저장) --> 출력
        int input = sc.nextInt();   // 1, 2, 3
        String result = null;       // 주소가 없다. 참조형
        switch (input) {
            case 1:
                result = "백두산은 열차";
                break;
            case 2:
                result = "한라산은 배";
                break;
            case 3:
                result = "후지산은 비행기";
                break;
            default:
                result = "안탐!";
        }
        System.out.println("당신이 가고 싶은 곳인 " + result + "를 타고 가야합니다.");
        */

        // 문제 5
        Random r = new Random(555);
        int c80 = 0, c70 = 0, c50 = 0, c0 = 0;     // 여러 개의 변수는 모두 따로 초기화
        int[] n2 = new int[1000];
        for (int i = 0; i < n2.length; i++) {
            n2[i] = r.nextInt(100) + 1;     // 1 ~ 100

            if (n2[i] >= 80) {
                c80++;  // c80 = c80+1
            }
            else if (n2[i] >= 70) { // 70~79
                c70++;
            }
            else if (n2[i] >= 50) { // 50~69
                c50++;
            }
            else {
                c0++;
            }   // if
        }   // for
        System.out.println(c80 + " " + c70 + " " + c50 + " " + c0);
    }   //main
}   // class
