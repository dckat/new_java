package org.example.day14.crawl;

import javax.swing.*;

public class StockCrawlerMain {
    public static void main(String[] args) {
        String code = JOptionPane.showInputDialog("code 입력");

        StockCrawler1 naver = new StockCrawler1();
        try {
            String data = naver.crawl(code);
            JOptionPane.showMessageDialog(null, data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
