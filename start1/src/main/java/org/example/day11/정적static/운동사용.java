package org.example.day11.정적static;

public class 운동사용 {
    public static void main(String[] args) {
        운동 w1 = new 운동("테니스", "친구", 3);
        운동 w2 = new 운동("러닝", "동네모임", 2);

        System.out.println(w1);
        System.out.println(w2);

        System.out.println("횟수: " + 운동.count);
        System.out.println("총 시간: " + 운동.getSum());
    }
}
