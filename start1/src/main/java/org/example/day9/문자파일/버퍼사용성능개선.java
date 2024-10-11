package org.example.day9.문자파일;

import java.io.*;

public class 버퍼사용성능개선 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("/Users/user/data/공부.txt");
            Reader reader = new InputStreamReader(is, "UTF-8");
            BufferedReader bf = new BufferedReader(reader);

            while (true) {
                String line = bf.readLine();
                if (line == null) break;
                System.out.println(line);
            }
            bf.close();
            reader.close();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
