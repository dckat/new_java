package org.example.jdbc.member;

import java.sql.*;

public class MemberDAO2 {
    private Connection con;  // 전역변수가 됨. null로 초기화
    public MemberDAO2() throws Exception {
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
    public void insert(MemberVO vo) throws Exception {
        // 3. sql 준비 --> sql 객체
        String sql = "insert into member values(?,?,?,?)";
        // insert into member values ('apple', '1234', 'apple', '1111');
        // ps가 ?를 세팅하는 역할
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, vo.getId());   // 1은 ?의 번호 (1번부터 시작)
        ps.setString(2, vo.getPw());
        ps.setString(3, vo.getName());
        ps.setString(4, vo.getTel());
        System.out.println("3. sql 준비 --> sql 객체 성공!");

        // 4. sql 전송 --> ps가 전송하는 기능을 가지고 있음
        int result = ps.executeUpdate();    // 실행된 row수, [insert, update, delete]
        System.out.println("4. sql 전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        ps.close();
        con.close();
    }

    public void delete(String idValue) throws Exception {
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

        ps.close();
        con.close();
    }

    public void update(String idValue, String telValue) throws Exception {
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

        ps.close();
        con.close();
    }

    // 기능은 메소드로 정의
    // row 하나 검색 --> 워크벤치에서 sql문으로 먼저 테스트
    public MemberVO one(String id) throws Exception {
        // 1.2단계는 DAO 객체 생성시 실행
        // 3.4단계만 구현
        // 3. sql문 객체로 준비
        // 4. 준비된 sql문 mysql로 전송
        String sql = "select * from member where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();  // 테이블 형태로 mysql로 부터 받아와야 할 때 사용
        // 결과가 있으면 컬럼의 이름이나 순서로 값을 꺼낼 수 있음
        // System.out.println(rs.next());  // true, false

        // table에 있는 데이터를 꺼내서 vo에 넣어 ui에 주어야 함.
        // ResultSet은 DAO안에서만 쓰는 객체(부품이므로) dao밖에서는 쓰지 않음.
        // 다른 클래스로 ResultSet에 들어있는 데이터를 전달하고자 하는 경우는
        // 꺼내어 vo(DTO)에 넣어서 전달해야함.
        // 코드의 일관성 문제!

        // 받는 쪽 UI(각각 다 다르게 코드해야함. 받는 타입에 따라 코드 수정 필요)
        // <-ResultSet--- db에서 가지고 올 때 ResultSet에 결과가 들어있음.
        // <-XML--- 영화진흥청에서 가지고 올 때 xml에 결과가 들어있음.
        // <-JSON--- 영화종합정보사에서 가지고 올 때 json에 결과가 들어있음.
        // 받는 쪽 UI(vo에서 꺼내는 코드만 하면 됨. 코드 수정 불필요)
        // <-vo--- db에서 가지고 올 때 ResultSet에 결과가 들어있음.
        // <-vo--- 영화진흥청에서 가지고 올 때 xml에 결과가 들어있음.
        // <-vo--- 영화종합정보사에서 가지고 올 때 json에 결과가 들어있음.

        // UI로 ResultSet에 있으면 꺼내어 vo에 넣어서 전달
        MemberVO vo = new MemberVO();
        if (rs.next()) {
            vo.setId(rs.getString("id"));   // 컬럼명 선호
            vo.setPw(rs.getString(2));  // 인덱스 사용 가능 (1번부터 시작)
            vo.setName(rs.getString("name"));
            vo.setTel(rs.getString("tel"));
        }
        return vo;
    }

    public boolean login(MemberVO bag) throws Exception {
        boolean result = false;
        String sql = "select id from member where id = ? and pw = ?";
        // 3. sql문 준비
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, bag.getId());
        ps.setString(2, bag.getPw());

        // 4. sql문 전송 --> 결과가 있으면 result = true;
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            result = true;
        }
        return result;
    }
}