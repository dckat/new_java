package org.example.day13.graphic;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class ThreadGraphic extends JFrame {
    JLabel count, image, day;   // 전역변수, 아무곳에서나 접근 가능
    public ThreadGraphic() {
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        count = new JLabel("카운트");
        image = new JLabel();
        day = new JLabel("년월일");

        FlowLayout flow = new FlowLayout();
        setLayout(flow);

        Font font = new Font("Arial", Font.BOLD, 50);
        count.setFont(font);
        image.setFont(font);
        day.setFont(font);

        // JFrame에 끼워넣음.
        add(count);
        add(image);
        add(day);

        CounterThread2 c = new CounterThread2();
        c.start();
        ArrayThread2 a = new ArrayThread2();
        a.start();
        TimeThread2 t = new TimeThread2();
        t.start();

        // setVisible은 항상 맨 마지막
        setVisible(true);
    }   // 생성자

    public class CounterThread2 extends Thread{
        // 필드
        // 메소드
        // public void run(){}: 동시에 실행하고 싶은 내용. 비어있는 상태
        // override(== overwrite, 재정의)
        public void run() {
            for (int i = 500; i >= 0; i--) {
                System.out.println("카운터 >> " + i);
                count.setText("카운터>> " + i);

                if (i == 500) {
                    Toolkit.getDefaultToolkit().beep();
                }
                if (i == 0) {
                    JOptionPane.showMessageDialog(count, "사용시간이 다 되었습니다. 퇴실 부탁드립니다.");
                    dispose();  // JFrame을 닫아버림!
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
            }
        }
        // public void start(){ 구현된 상태! }
        // JVM은 실행목록을 가지고 있음. 실행할 것들을 리스트업해두고 스레드는 왔다갔다하면서 조금씩 실행
    }

    // 클래스 안에 끼워진 클래스 (내부클래스, innerClass)
    // 전역변수를 공유할 목적으로!
    public class TimeThread2 extends Thread {
        public void run() {
            for (int i = 0; i < 3000; i++) {
                System.out.println("시각 >> " + new Date());
                day.setText("시각 >> " + new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
            }
        }
    }

    public class ArrayThread2 extends Thread {
        String[] foods = {"1.jpeg", "2.jpeg", "3.jpeg", "4.jpeg", "5.jpeg"};

        public void run() {
            for (int i = 0; i < foods.length; i++) {
                System.out.println("배열 >> " + foods[i]);
                ImageIcon icon = new ImageIcon(foods[i]);
                image.setIcon(icon);
                // image.setText("배열 >> " + foods[i]);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김");
                }
            }
        }
    }
}
