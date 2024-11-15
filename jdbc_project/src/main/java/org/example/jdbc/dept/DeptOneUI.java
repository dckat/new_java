package org.example.jdbc.dept;

import javax.swing.*;
import java.util.Scanner;

public class DeptOneUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("deptNo>> ");
        int deptNo = sc.nextInt();

        DeptDAO dao = new DeptDAO();
        DeptVO vo = dao.one(deptNo);

        System.out.println("검색 결과>> deptNo = " + vo.getDeptNo());
        System.out.println("검색 결과>> deptName = " + vo.getDName());
        System.out.println("검색 결과>> Loc = " + vo.getLoc());

        String total = vo.getDeptNo() + " " + vo.getDName() + " "
                + vo.getLoc();
        JOptionPane.showMessageDialog(null, total);
    }
}
