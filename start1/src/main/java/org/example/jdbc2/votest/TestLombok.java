package org.example.jdbc2.votest;

import org.example.jdbc2.product.ProductVO;

public class TestLombok {
    public static void main(String[] args) {
        // 1. 가방을 생성
        ProductVO vo = new ProductVO();
        // 2. 가방에 데이터를 저장
        vo.setNo(1);
        vo.setName("신발");
        vo.setContent("부츠");
        vo.setPrice(10000);
        // 3. 가방을 전달
        // 4. 가방을 데이터를 꺼내오기
        int no = vo.getNo();
        String name = vo.getName();
        String content = vo.getContent();
        int price = vo.getPrice();
        System.out.println(no + " " + name + " " + content + " " + price);
        System.out.println(vo);
    }
}
