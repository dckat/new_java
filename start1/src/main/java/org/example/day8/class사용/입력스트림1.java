package org.example.day8.class사용;

import java.io.FileInputStream;
import java.io.InputStream;

public class 입력스트림1 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("/Users/user/data/imsi.txt");
            int count = 0;
            while (true) {
                int data = is.read();
                count++;

                if (data == -1) break;
                System.out.println(data);
            }
            System.out.println(count);
            is.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
