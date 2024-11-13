package org.example.jdbc.quiz.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeptInsert {
    public static void main(String[] args) throws Exception {
        // 1단계 - 사용할 라이브러리 설정
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. MYSQL 자바 연결할 DRIVER 설정 성공.");

        // 2단계 - db연결
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";

        Connection con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. MYSQL 연결 성공.");

        Scanner sc = new Scanner(System.in);
        System.out.print("deptNo>> ");
        String deptNo = sc.next();
        System.out.print("deptName>> ");
        String deptName = sc.next();
        System.out.print("loc>> ");
        String loc = sc.next();
        sc.close();

        // 3단계 - sql 작성
        String sql = "insert into dept2 values(?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, deptNo);
        ps.setString(2, deptName);
        ps.setString(3, loc);
        System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

        // 4단계 - dbms로 sql문 전송
        ps.executeUpdate();
        System.out.println("4. SQL문 MYSQL로 보내기 성공.");
        System.out.println("삽입 성공");
    }
}
