package org.example.day14.crawl;

import javax.swing.*;

public class StockCrawlerMain2 {
    public static void main(String[] args) {
        String code = JOptionPane.showInputDialog("code 입력");

        StockCrawler2 naver = new StockCrawler2();
        try {
            String[] data = naver.crawl(code);
            // code가 035720인 회사의 최고가는 37,000이고 최저가는 35000이다.
            String s = "code가 " + code + "인 회사의 최고가는 " +
                    data[1] + "이고\n" +
                    "전일가는 " + data[3] + "이다";
            JOptionPane.showMessageDialog(null, s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
