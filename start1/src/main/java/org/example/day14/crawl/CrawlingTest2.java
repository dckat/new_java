package org.example.day14.crawl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class CrawlingTest2 {
    public static void main(String[] args) throws IOException {
        Document doc2 = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();

        Elements list = doc2.select("span.code");
        System.out.println(list.size());
        System.out.println(list);
        Element e1 = list.get(0);
        String code = e1.text();
        System.out.println(code);

        Elements list2 = doc2.select("span.tx");
        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++) {
            Element e2 = list2.get(i);
            System.out.println(e2.text());
        }

        Elements list3 = doc2.select("div.today span.blind");
        System.out.println(list3);

        Element e3 = list3.get(0);
        System.out.println(e3.text());

        Elements list4 = doc2.select("td.first");
        System.out.println(list4);

        Elements list5 = doc2.select("span.blind");
        System.out.println(list5);
        System.out.println(list5.size());

        for (int i = 0; i < list5.size(); i++) {
            System.out.println(i + ": " + list5.get(i));
        }

        String company = doc2.select("div.wrap_company h2 a").get(0).text();
        // 고가 high에 넣기
        String high = list5.get(18).text();
        // 현재가 today에 넣기
        String today = list5.get(14).text();
        // 전일 yesterday에 넣기
        String yesterday = list5.get(17).text();

        System.out.println("회사명: " + company);
        System.out.println("코드: " + code);
        System.out.println("고가: " + high);
        System.out.println("현재가: " + today);
        System.out.println("전일가: " + yesterday);

    }
}
