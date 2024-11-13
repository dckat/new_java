package org.example.jdbc.quiz;

import java.sql.DriverManager;

public class SchoolDBConnect {
    public static void main(String[] args) throws Exception {
        // 1단계 - 사용할 라이브러리 설정
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. MYSQL 자바 연결할 DRIVER 설정 성공.");

        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";

        DriverManager.getConnection(url, id, pw);
        System.out.println("2. MYSQL 연결 성공.");
    }
}
