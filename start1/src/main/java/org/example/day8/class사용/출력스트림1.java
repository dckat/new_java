package org.example.day8.class사용;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class 출력스트림1 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("/Users/user/data/imsi.txt");
            byte a = 10;
            byte b = 20;
            byte c = 30;

            // 1바이트 단위로 파일에 쓰기
            os.write(a);
            os.write(b);
            os.write(c);

            // 버퍼에 남아있는 바이트를 파일에 한꺼번에 쓰기
            os.flush();
            os.close();
        }
        catch (Exception e) {
            e.printStackTrace();    // 에러 자세하게 출력
        }
    }
}
