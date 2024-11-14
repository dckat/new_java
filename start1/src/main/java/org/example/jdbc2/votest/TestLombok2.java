package org.example.jdbc2.votest;

import org.example.jdbc2.board.BoardVO;

public class TestLombok2 {
    public static void main(String[] args) {
        BoardVO vo = new BoardVO();
        vo.setNo(2);
        vo.setTitle("내일은 금요일");
        vo.setContent("와 주말이다~~~~");
        vo.setWriter("apple");

        int no = vo.getNo();
        String title = vo.getTitle();
        String content = vo.getContent();
        String writer = vo.getWriter();
        System.out.println(vo);
    }
}
