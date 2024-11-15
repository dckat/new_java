package org.example.jdbc.dept;

import java.util.Scanner;

public class DeptUpdateUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("deptno 입력>> ");
        int deptNo = sc.nextInt();
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
