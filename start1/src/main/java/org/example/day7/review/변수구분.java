package org.example.day7.review;

public class 변수구분 {
    int z;  // 전역변수 --> 자동초기화
    public static void main(String[] args) {
        // 저장공간을 만들고, 그 저장공간에 값을 넣는다.
        // 선언할 때 --> 저장공간을 만든다.
        // 타입명 + 변수명; --> 선언
        int x;  // 쓰레기값이 들어있는 상태
        // System.out.println(x);   <-- 초기화 되지 않아 컴파일 에러 발생
        int y = 0;  // 변수를 만들 때 초기화를 반드시 해주어야 함.
        // ==> 자바에서는 선언의 위치가 변수가 사용될 수 있는 범위를 결정
        // ==> x, y는 main() 메소드 안에서만 사용 가능
        // ==> 지역변수 (local variable) <--> 전역변수 (global variable)

        for (int i = 0; i < 3; i++) {
            int imsi = 0;   // for문 밖에서는 사용 불가
            // imsi, i는 for문 지역 내에서만 사용 가능
            // for문 내의 지역변수
        }
    }
}
