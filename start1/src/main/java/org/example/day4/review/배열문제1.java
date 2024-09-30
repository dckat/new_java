package org.example.day4.review;

public class 배열문제1 {
    public static void main(String[] args) {
        // 3일의 휴가기간 동안 매일 다른 곳을 여행가려고 함.
        // 1. 여행가고 싶은 지역 3개를 배열에 저장 (처음부터 알고 있는 경우)
        String[] place = {"제주도", "울릉도", "송도"};
        // 2. 여행지역마다의 경비 (처음부터 알고 있는 경우)
        int[] price = {50000, 40000, 10000};
        // 3. 함께 가고 싶은 사람 이름 (처음에는 모르는 경우)
        // 3-1. 첫 번째 여행자만 "친구"로 나중에 결정
        String[] people = new String[3];
        people[0] = "친구";
        // 4. 다음과 같이 출력
        /*
           제주도 50000 친구
           울릉도 40000 null
           송도 10000 null
        */

        // i변수 역할: 반복횟수체크, 배열의 인덱스, 계산대상 데이터
        for (int i = 0; i < place.length; i++) {
            System.out.println(place[i] + "\t" + price[i] + "\t" + people[i]);
        }
    }
}
