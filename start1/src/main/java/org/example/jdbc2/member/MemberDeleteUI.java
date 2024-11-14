package org.example.jdbc2.member;

import java.util.Scanner;

public class MemberDeleteUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("id 입력>> ");
        String idValue = sc.next();     // apple
        sc.close();

        // Member 테이블에 연결해서 입력받은 데이터를 주고 delete 해달라고 호출
        // MemberDAO 클래스 사용해서 delete() 호출
        MemberDAO dao = new MemberDAO();
        dao.delete(idValue);
    }
}
