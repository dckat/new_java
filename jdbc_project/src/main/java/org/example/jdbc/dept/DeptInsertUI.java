package org.example.jdbc.dept;

import java.util.Scanner;

public class DeptInsertUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("deptno 입력>> ");
        int deptNo = sc.nextInt();
        System.out.print("dname 입력>> ");
        String dName = sc.next();
        System.out.print("loc 입력>> ");
        String loc = sc.next();
        sc.close();

        DeptDAO dao = new DeptDAO();
        DeptVO vo = new DeptVO();
        vo.setDeptNo(deptNo);
        vo.setDName(dName);
        vo.setLoc(loc);
        dao.insert(vo);
    }
}