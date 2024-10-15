package org.example.day10.정적static;

public class Q2 {
    public static void main(String[] args) {
        Day d1 = new Day("자바공부", 10, "강남");
        Day d2 = new Day("여행", 15, "강원도");
        Day d3 = new Day("운동", 11, "피트니스");

        double avgTime = (double)Day.totalTime / Day.totalDay;

        System.out.println("전체 하는 일의 시간: " + Day.totalTime);
        System.out.println("평균 하는 일의 시간: " + avgTime);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
