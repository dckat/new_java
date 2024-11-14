package org.example.jdbc2.dept;

import java.util.ArrayList;

public class DeptListUI {
    public static void main(String[] args) throws Exception {
        DeptDAO dao = new DeptDAO();
        ArrayList<DeptVO> list = dao.list();

        for (int i = 0; i < list.size(); i++) {
            System.out.println("검색 결과>> deptNo = " + list.get(i).getDeptNo());
            System.out.println("검색 결과>> deptName = " + list.get(i).getDName());
            System.out.println("검색 결과>> Loc = " + list.get(i).getLoc());
            System.out.println("----------------------------");
        }
    }
}
