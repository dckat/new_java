package org.example.day1.oper;

public class Oper2 {
    public static void main(String[] args) {
        int x = 200;
        int y = 100;

        int sum = x + y;    // 정수 + 정수 ==> 결과는 정수
        System.out.println(sum);

        double div = y / x;     // 0.0 = 100/200(X)

        // Java는 정적 타이핑 => 정수변수를 실수변수로 변경이 불가 -> CPU에서 값을 가지고 와서 실수로 변경해야 함
        double div2 = (double)y / x;    // CPU에서 y를 가지고 와서 실수로 변경 => casting
    }
}
