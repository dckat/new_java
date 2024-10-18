package org.example.day14.crawl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class CrawlingTest4 {
    public static void main(String[] args) throws IOException {
        Document doc2 = Jsoup.connect("https://news.naver.com/").get();

        Elements list = doc2.select("li.Nlist_item");

        for (int i = 0; i < list.size(); i++) {
            Element element = list.get(i);
            System.out.println(i + ": " + element.text());
        }
    }
}
