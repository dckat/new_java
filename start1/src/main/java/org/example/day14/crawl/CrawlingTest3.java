package org.example.day14.crawl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class CrawlingTest3 {
    public static void main(String[] args) throws IOException {
        // 카카오 035720
        // 네이버 035420
        // 현대차 005380

        String[] names = {"카카오", "네이버", "현대차"};
        String[] codes = {"035720", "035420", "005380"};

        for (int i = 0; i < codes.length; i++) {
            Document doc2 = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + codes[i]).get();

            Elements list = doc2.select("span.code");
            // System.out.println(list.size());
            // System.out.println(list);
            Element e1 = list.get(0);
            String code = e1.text();
            // System.out.println(code);

            Elements list2 = doc2.select("span.blind");
            // System.out.println(list2);
            // System.out.println(list2.size());

            /*
            for (int j = 0; j < list2.size(); j++) {
                System.out.println(j + ": " + list2.get(j));
            }
            */

            // 고가 high에 넣기
            String high = list2.get(18).text();
            // 현재가 today에 넣기
            String today = list2.get(14).text();
            // 전일 yesterday에 넣기
            String yesterday = list2.get(17).text();

            System.out.println("--------------------");
            System.out.println("회사명: " + names[i]);
            System.out.println("코드: " + codes[i]);
            System.out.println("고가: " + high);
            System.out.println("현재가: " + today);
            System.out.println("전일가: " + yesterday);
            System.out.println("--------------------");
        }
    }
}
