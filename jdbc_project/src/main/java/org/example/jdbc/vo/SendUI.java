package org.example.jdbc.vo;

import java.util.Scanner;

public class SendUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력>> ");
        String name = sc.next();
        System.out.print("나이 입력>> ");
        int age = sc.nextInt();
        System.out.print("취미 입력>> ");
        String hobby = sc.next();
        System.out.print("연락처 입력>> ");
        String tel = sc.next();

        // 가방을 생성
        Bag bag = new Bag();
        // 값을 넣기
        bag.setName(name);
        bag.setAge(age);
        bag.setHobby(hobby);
        bag.setTel(tel);

        // 값을 전달
        ReceiveDAO dao = new ReceiveDAO();
        dao.print(bag);
        sc.close();
    }
}
