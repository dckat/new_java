package org.example.day13.예외처리;

public class ExceptionOccur {
    public static void main(String[] args) {
        System.out.println("1. 나는 프린트가 잘 될 예정.");

        try {
            System.out.println("2. 문제 발생 코드" + 10 / 0);
        } catch (Exception e) {
            System.out.println("수학 실행할 때 문제 발생함.");
            e.printStackTrace();    // 발생한 문제에 대해 구체적으로 출력 (return type: void)
            System.out.println(e.getMessage()); // 간단하게 문제에 대해 String으로 출력 (return type: String)
        }

        System.out.println("3. 나는 출력 될까요?");
    }
}
