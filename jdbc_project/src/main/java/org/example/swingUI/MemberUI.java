package org.example.swingUI;

import org.example.dbcp.MemberDAO2;
import org.example.dbcp.MemberVO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemberUI extends JFrame {
    JLabel top, l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1, b2, b3;

    public MemberUI() {
        // 객체 생성시 화면 만들기
        setTitle("Member UI");
        setSize(700, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);    // 수동으로 위치 배정

        top = new JLabel("회원정보");
        l1 = new JLabel("아이디");
        l2 = new JLabel("패스워드");
        l3 = new JLabel("이름");
        l4 = new JLabel("전화번호");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);

        b1 = new JButton("회원가입");
        b2 = new JButton("회원수정");
        b3 = new JButton("회원검색");

        top.setFont(new Font("굴림", Font.BOLD, 50));
        Font font = new Font("굴림", Font.BOLD, 35);

        top.setBounds(250, 50, 300, 100);
        l1.setFont(font);
        l1.setBounds(100, 150, 150, 50);
        t1.setFont(font);
        t1.setBounds(300, 150, 300, 50);
        l2.setFont(font);
        l2.setBounds(100, 250, 150, 50);
        t2.setFont(font);
        t2.setBounds(300, 250, 300, 50);
        l3.setFont(font);
        l3.setBounds(100, 350, 150, 50);
        t3.setFont(font);
        t3.setBounds(300, 350, 300, 50);
        l4.setFont(font);
        l4.setBounds(100, 450, 150, 50);
        t4.setFont(font);
        t4.setBounds(300, 450, 300, 50);

        b1.setFont(font);
        b1.setBounds(100, 550, 150, 50);
        b2.setFont(font);
        b2.setBounds(260, 550, 150, 50);
        b3.setFont(font);
        b3.setBounds(420, 550, 150, 50);

        this.add(top);
        this.add(l1);
        this.add(t1);
        this.add(l2);
        this.add(t2);
        this.add(l3);
        this.add(t3);
        this.add(l4);
        this.add(t4);
        this.add(b1);
        this.add(b2);
        this.add(b3);

        b1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               // 클릭했을 때 처리할 내용이 구현되어 있어야함.
               // 1. id, pw, name, tel 입력한 것 가지고 오기
               String s1 = t1.getText();
               String s2 = t2.getText();
               String s3 = t3.getText();
               String s4 = t4.getText();
               // 2. vo에 넣어주어야 함
               MemberVO bag = new MemberVO();
               bag.setId(s1);
               bag.setPw(s2);
               bag.setName(s3);
               bag.setTel(s4);
               // 3. dao에 vo를 전달하면서 insert 요청
               try {
                   MemberDAO2 dao = new MemberDAO2();
                   dao.insert(bag);
               } catch (Exception ex) {
                   System.out.println(ex.getMessage());
               }
           }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 클릭했을 때 처리할 내용이 구현되어 있어야함.
                // 1. 입력한 값 가지고 오기
                String s1 = t1.getText();
                String s2 = t4.getText();
                // 2. dao에 입력값 전달 후 update 요청
                try {
                    MemberDAO2 dao = new MemberDAO2();
                    dao.update(s1, s2);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 클릭했을 때 처리할 내용이 구현되어 있어야함.
                // 1. 입력한 id값 가지고 옴
                String s1 = t1.getText();
                try {
                    // 2. dao에게 id를 주면서 검색 요청
                    MemberDAO2 dao = new MemberDAO2();
                    MemberVO bag = dao.one(s1);
                    // 3. dao로부터 받아온 vo를 ui에 보여지게 함.
                    t1.setText(bag.getId());
                    t2.setText(bag.getPw());
                    t3.setText(bag.getName());
                    t4.setText(bag.getTel());
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new MemberUI();
    }
}
