package org.example.jdbc2.one;

import java.sql.*;
import java.util.ArrayList;

public class DeptDAO {
    // jdbc 4단계
    private Connection con;  // 전역변수가 됨. null로 초기화
    public DeptDAO() throws ClassNotFoundException, SQLException {
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

    // CRUD 기능별 메소드 추가.
    // 각각 메소드에는 3-4단계만 넣음.
    // read(select 문 작업. 검색(읽기))
    // 검색 결과가 row 1개. row 여러 개일때마다 작업이 약간 다름.
    // one(int deptno), list()
    public DeptVO one(int deptno) throws SQLException {
        // 검색결과 row개 ----가방(vo)에 컬럼값을 다 넣어서 전달----> ui
        DeptVO bag = new DeptVO();
        // 3단계
        String sql = "select * from dept where deptno = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, deptno);

        // 4단계
        // 테이블 형태로 검색결과가 와야하므로, executeQuery()
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {    // true
            // 있으면 row에 있는 값들을 꺼내어 vo에 넣기
            bag.setDeptNo(rs.getInt("deptno")); // 1
            bag.setDName(rs.getString(2));      // db의 인덱스는 1부터 시작
            bag.setLoc(rs.getString("loc"));
        }
        return bag;
    }

    public ArrayList<DeptVO> list() throws SQLException {
        // row 하나당 가방(vo) 하나 필요
        // row 5개이면 가방(vo) 5개 필요
        // ui에 가방 5개 리턴해서 전달하려면 묶어줘야 함
        // --> java에서는 리턴할때 무조건!!!! 하나로 묶어서 해야함.
        // 가방에 묶어줄 용도로 사용하는 것이 List 타입의 객체(ArrayList)를 사용
        ArrayList<DeptVO> list = new ArrayList<>();

        // 3단계
        String sql = "select * from dept";
        PreparedStatement ps = con.prepareStatement(sql);

        // 4단계
        // 테이블 형태로 검색결과가 와야하므로, executeQuery()
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {    // 없을때 까지(false) 반복!
            DeptVO bag = new DeptVO();
            // 있으면 row에 있는 값들을 꺼내어 vo에 넣기
            bag.setDeptNo(rs.getInt("deptno")); // 1
            bag.setDName(rs.getString(2));      // db의 인덱스는 1부터 시작
            bag.setLoc(rs.getString("loc"));
            // list에 bag를 추가
            list.add(bag);
        }
        return list;
    }
}
