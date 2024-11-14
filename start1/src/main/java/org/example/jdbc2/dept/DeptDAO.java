package org.example.jdbc2.dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DeptDAO {
    private Connection con;  // 전역변수가 됨. null로 초기화
    public DeptDAO() throws Exception {
        // new MemberDAO() 할때 클래스이름과 동일한 메소드인 생성자 메소드가 자동호출
        // JDBC의 1-2단계를 실행
        // 1. 드라이버 설정 --> 레이지로딩(실행시에 메모리에 올려줌)
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");
        // 2. db 연결
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. db 연결 성공!");
    }
    // DAO 클래스는 member 테이블의 데이터를 접근해서 여러기능을 정의하는 클래스
    // 테이블당 DAO는 하나씩 만든다. --> 테이블이 1000개이면 DAO는 1000개를 만든다.
    public void insert(DeptVO vo) throws Exception {
        // 3. sql 준비 --> sql 객체
        String sql = "insert into dept values(?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, vo.getDeptNo());   // 1은 ?의 번호 (1번부터 시작)
        ps.setString(2, vo.getDName());
        ps.setString(3, vo.getLoc());
        System.out.println("3. sql 준비 --> sql 객체 성공!");

        // 4. sql 전송 --> ps가 전송하는 기능을 가지고 있음
        int result = ps.executeUpdate();    // 실행된 row수, [insert, update, delete]
        System.out.println("4. sql 전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        ps.close();
        con.close();
    }

    public void update(DeptVO vo) throws Exception {
        // 3. sql 준비 --> sql 객체
        String sql = "update dept set dname = ? where deptno = ?";
        // ps가 ?를 세팅하는 역할
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, vo.getDName());   // 1은 ?의 번호 (1번부터 시작)
        ps.setString(2, vo.getDeptNo());
        System.out.println("3. sql 준비 --> sql 객체 성공!");

        // 4. sql 전송 --> ps가 전송하는 기능을 가지고 있음
        int result = ps.executeUpdate();    // 실행된 row수, [insert, update, delete]
        System.out.println("4. sql 전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        ps.close();
        con.close();
    }

    public DeptVO one(int deptNo) throws Exception {
        DeptVO vo = null;
        String sql = "select * from dept where deptno = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, deptNo+"");

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            String deptno = rs.getString(1);
            String dName = rs.getString(2);
            String loc = rs.getString(3);

            vo = new DeptVO();
            vo.setDName(dName);
            vo.setDeptNo(deptno);
            vo.setLoc(loc);
        }
        ps.close();
        con.close();
        rs.close();
        return vo;
    }

    public ArrayList<DeptVO> list() throws Exception {
        ArrayList<DeptVO> list = new ArrayList<>();
        String sql = "select * from dept";
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String deptno = rs.getString(1);
            String dName = rs.getString(2);
            String loc = rs.getString(3);

            DeptVO vo = new DeptVO();
            vo.setDeptNo(deptno);
            vo.setDName(dName);
            vo.setLoc(loc);
            list.add(vo);
        }
        ps.close();
        con.close();
        rs.close();
        return list;
    }
}
