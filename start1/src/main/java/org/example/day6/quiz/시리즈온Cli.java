package org.example.day6.quiz;

import java.util.Scanner;

public class 시리즈온Cli {
    public static void main(String[] args) {
        String[] titles = {"인사이드 아웃2", "데드풀과 울버린", "콰이어트 플레이스:첫째 날", "너의 이름은", "초속5센티미터"};
        int[] price = {10900, 10900, 5500, 1200, 1540};

        Scanner sc = new Scanner(System.in);

        System.out.println("네이버 시리즈온 실시간 영화 목록");
        for (int i = 0; i < titles.length; i++) {
            System.out.println((i+1) + ". " + titles[i] + " - 가격: " + price[i] + "원");
        }
        System.out.println();

        System.out.println("정보를 확인하고 싶은 영화 번호를 선택하세요 (1-5):");
        int num = sc.nextInt();
        System.out.println("선택한 영화: " + titles[num-1]);
        System.out.println("가격: " + price[num-1] + "원");
    }
}
