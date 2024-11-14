package org.example.jdbc2.member;

import java.util.Scanner;

public class MemberInsertUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("id 입력>> ");
        String idValue = sc.next();
        System.out.print("pw 입력>> ");
        String pwValue = sc.next();
        System.out.print("name 입력>> ");
        String nameValue = sc.next();
        System.out.print("tel 입력>> ");
        String telValue = sc.next();
        sc.close();

        // Member 테이블에 연결해서 입력받은 데이터를 주고 insert 해달라고 호출
        // MemberDAO 클래스 사용해서 insert() 호출
        MemberDAO dao = new MemberDAO();
        dao.insert(idValue, pwValue, nameValue, telValue);
    }
}
