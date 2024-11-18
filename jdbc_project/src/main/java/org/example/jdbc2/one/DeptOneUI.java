package org.example.jdbc2.one;

import java.sql.SQLException;

public class DeptOneUI {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DeptDAO dao = new DeptDAO();        // 1-2단계 실행
        DeptVO bag = dao.one(2);     // 3-4단계: 메소드를 통해 가방을 받음

        // 받아온 것을 꺼내어 출력
        System.out.println("검색한 no>> " + bag.getDeptNo());
        System.out.println("검색한 name>> " + bag.getDName());
        System.out.println("검색한 loc>> " + bag.getLoc());
    }
}
