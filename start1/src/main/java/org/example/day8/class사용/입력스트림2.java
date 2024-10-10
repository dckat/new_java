package org.example.day8.class사용;

import java.io.FileInputStream;
import java.io.InputStream;

public class 입력스트림2 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("/Users/user/data/imsi.txt");

            byte[] data = new byte[100];

            while (true) {
                int read = is.read(data);
                if (read == -1) break;

                System.out.println(new String(data));
                for (int i = 0; i < read; i++) {
                    System.out.println(data[i]);
                };
            }

            is.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
