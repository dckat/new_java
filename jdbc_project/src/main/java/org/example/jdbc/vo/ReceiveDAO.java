package org.example.jdbc.vo;

public class ReceiveDAO {
    public void print(Bag bag) {
        // 가방을 전달받는 쪽
        // 파라미터에 bag 넣어야 함
        // 값을 꺼내서 처리
        // 실무에서는 가방에 제대로 값이 들어와 있는 것만 출력
        System.out.println(bag);
        System.out.println("<<<< 받은 데이터 출력 >>>>");
        System.out.println("--------------------------");
        System.out.println("받은 이름은 - " + bag.getName());
        System.out.println("받은 나이는 - " + bag.getAge());
        System.out.println("받은 취미는 - " + bag.getHobby());
        System.out.println("받은 전화번호는 - " + bag.getTel());
        System.out.println("--------------------------");
    }
}
