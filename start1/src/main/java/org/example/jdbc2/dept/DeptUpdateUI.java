package org.example.jdbc2.dept;

import java.util.Scanner;

public class DeptUpdateUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("deptno 입력>> ");
        String deptNo = sc.next();
        System.out.print("dname 입력>> ");
        String dName = sc.next();
        sc.close();

        DeptDAO dao = new DeptDAO();
        DeptVO vo = new DeptVO();
        vo.setDeptNo(deptNo);
        vo.setDName(dName);
        dao.update(vo);
    }
}
