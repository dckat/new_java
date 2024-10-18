package org.example.day14.crawl;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class CrawlingTest1 {
    public static void main(String[] args) throws IOException {
        // String s = JOptionPane.showInputDialog("날씨 입력");                        // return이 string
        // Connection: 연결통로를 나타내는 스트림 객체
        Connection con = Jsoup.connect("https://www.naver.com");           // return이 Connection
        // Document: 소스코드
        Document doc = con.get();  // return: Document
        // chain식 코드
        // Document doc2 = JSoup.connect("https://www.naver.com").get();
        System.out.println("설치 성공!!!!");
        System.out.println(doc);

        // Elements는 ArrayList를 상속받아 만든 것
        Elements list = doc.select("span.blind");
        System.out.println(list.size());
        System.out.println(list);
        Element e1 = list.get(0);
        String e1Text = e1.text();
        System.out.println(e1Text);

        Element e2 = list.get(0);
        String e2Text = e2.text();
        System.out.println(e2Text);
    }
}
