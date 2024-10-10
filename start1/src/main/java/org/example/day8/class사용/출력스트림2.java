package org.example.day8.class사용;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class 출력스트림2 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("/Users/user/data/imsi.txt");

            byte[] array = {10, 20, 30};
            String str = "안녕!";
            byte[] word = str.getBytes();

            os.write(word);
            os.flush();
            os.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
