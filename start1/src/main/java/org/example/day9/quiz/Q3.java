package org.example.day9.quiz;

import java.io.*;

public class Q3 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("/Users/user/new_java/start1/build.gradle");
            Reader reader = new InputStreamReader(is);
            BufferedReader bf = new BufferedReader(reader);

            long start = System.nanoTime();
            while (true) {
                String line = bf.readLine();
                if (line == null) break;
                System.out.println(line);
            }
            long end = System.nanoTime();
            System.out.println(end-start);
            is.close();
            reader.close();
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
