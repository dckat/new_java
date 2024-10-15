package org.example.day10.정적static;

public class Q3 {
    public static void main(String[] args) {
        직원 work1 = new 직원("홍길동", 25, "여");
        직원 work2 = new 직원("김길동", 24, "남");
        직원 work3 = new 직원("송길동", 26, "여");

        System.out.println("총 직원 수: " + 직원.count + "명");
        System.out.println(work1);
        System.out.println(work2);
        System.out.println(work3);

        double avgAge = (double)직원.totalAge / 직원.count;
        System.out.println(avgAge);
    }
}
