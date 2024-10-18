package org.example.day14.crawl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class StockCrawler1 {
    public String crawl(String code) throws Exception {
        Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code).get();

        Elements list = doc.select("span.blind");

        // 고가 high에 넣기
        String high = list.get(18).text();
        // 현재가 today에 넣기
        String today = list.get(14).text();
        // 전일 yesterday에 넣기
        String yesterday = list.get(17).text();

        /*
        System.out.println("코드: " + code);
        System.out.println("고가: " + high);
        System.out.println("현재가: " + today);
        System.out.println("전일가: " + yesterday);
        */

        String data = "코드: " + code + "\n" +
                "고가: " + high + "\n" +
                "현재가: " + today + "\n" +
                "전일가: " + yesterday;

        return data;
    }
}
