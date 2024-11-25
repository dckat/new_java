package org.example.dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO2 {
    private Connection con;  // 전역변수가 됨. null로 초기화
    private DBConnectionMgr dbcp;
    public MemberDAO2() throws Exception {
        // 싱글톤으로 생성된 DBCP 객체 획득
        dbcp = DBConnectionMgr.getInstance();
    }
    // DAO 클래스는 member 테이블의 데이터를 접근해서 여러기능을 정의하는 클래스
    // 테이블당 DAO는 하나씩 만든다. --> 테이블이 1000개이면 DAO는 1000개를 만든다.
    public void insert(MemberVO vo) throws Exception {
        con = dbcp.getConnection();

        // 3. sql 준비 --> sql 객체
        String sql = "insert into member values(?,?,?,?)";
        // insert into member values ('apple', '1234', 'apple', '1111');
        // ps가 ?를 세팅하는 역할
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, vo.getId());   // 1은 ?의 번호 (1번부터 시작)
        ps.setString(2, vo.getPW());
        ps.setString(3, vo.getName());
        ps.setString(4, vo.getTel());
        System.out.println("3. sql 준비 --> sql 객체 성공!");

        // 4. sql 전송 --> ps가 전송하는 기능을 가지고 있음
        int result = ps.executeUpdate();    // 실행된 row수, [insert, update, delete]
        System.out.println("4. sql 전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        dbcp.freeConnection(con, ps);
    }

    public void delete(String idValue) throws Exception {
        con = dbcp.getConnection();

        // 3. sql 준비 --> sql 객체
        String sql = "delete from member where id = ?";
        // ps가 ?를 세팅하는 역할
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, idValue);   // 1은 ?의 번호 (1번부터 시작)
        System.out.println("3. sql 준비 --> sql 객체 성공!");

        // 4. sql 전송 --> ps가 전송하는 기능을 가지고 있음
        int result = ps.executeUpdate();    // 실행된 row수, [insert, update, delete]
        System.out.println("4. sql 전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        dbcp.freeConnection(con, ps);
    }

    public void update(String idValue, String telValue) throws Exception {
        con = dbcp.getConnection();

        // 3. sql 준비 --> sql 객체
        String sql = "update member set tel = ? where id = ?";
        // ps가 ?를 세팅하는 역할
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, telValue);   // 1은 ?의 번호 (1번부터 시작)
        ps.setString(2, idValue);
        System.out.println("3. sql 준비 --> sql 객체 성공!");

        // 4. sql 전송 --> ps가 전송하는 기능을 가지고 있음
        int result = ps.executeUpdate();    // 실행된 row수, [insert, update, delete]
        System.out.println("4. sql 전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        dbcp.freeConnection(con, ps);
    }
}
