package org.example.day11.정적static;

public class Youtube사용 {
    public static void main(String[] args) {
        Youtube y1 = new Youtube(2000, "김대철", 500, 300, "먹방1");
        Youtube y2 = new Youtube(3000, "김대철", 200, 100, "먹방2");
        System.out.println(y1);
        System.out.println(y2);

        System.out.println("업로드된 동영상: " + Youtube.getTotalUpload());
        System.out.println("누적 조회수: " + Youtube.getTotalViewCount());
    }
}
