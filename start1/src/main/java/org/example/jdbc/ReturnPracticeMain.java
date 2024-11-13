package org.example.jdbc;

import java.sql.Connection;
import java.util.Date;

public class ReturnPracticeMain {
    public static void main(String[] args) throws Exception {
        ReturnPractice test = new ReturnPractice();
        int[] arr = test.getArray();
        System.out.println(arr[0] + arr[1]);

        Connection con = test.getConnection("http://www.naver.com", "root", "1234");
        con.setAutoCommit(false);

        Connection con2 = test.getConnection("http://www.naver.com");
        System.out.println(con2.isClosed());

        Date date = test.getDate();
        System.out.println(date.getHours());

        int result = test.getSum(100);
        System.out.println("보너스까지 추가된 금액은 " + result);

        test.getSum(2000, 3000);
    }
}
