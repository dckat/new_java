package org.example.jdbc.member;

import javax.swing.*;
import java.util.Scanner;

public class MemberOneUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 id 입력>> ");
        String id = sc.next();

        MemberDAO2 dao = new MemberDAO2();
        MemberVO bag = dao.one(id);
        String total = bag.getId() + " "  + bag.getPw() + " " + bag.getName() +
                " " + bag.getTel();
        JOptionPane.showMessageDialog(null, total);
        sc.close();
    }
}
