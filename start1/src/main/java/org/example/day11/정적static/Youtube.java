package org.example.day11.정적static;

public class Youtube {
    String title;   // 제목
    int like;       // 좋아요 수
    int commentCount;   // 댓글 수
    String author;      // 업로드한 사람
    int viewCount;      // 조회수

    private static int totalViewCount;  // 총 조회수
    private static int totalUpload;     // 총 업로드 동영상 갯수

    // 생성자
    public Youtube(int viewCount, String author, int commentCount, int like, String title) {
        this.viewCount = viewCount;
        this.author = author;
        this.commentCount = commentCount;
        this.like = like;
        this.title = title;
        totalViewCount += viewCount;
        totalUpload++;
    }

    public static int getTotalViewCount() {
        return totalViewCount;
    }

    public static int getTotalUpload() {
        return totalUpload;
    }

    // 정보 출력
    public String toString() {
        return "Youtube{" +
                "title='" + title + '\'' +
                ", like=" + like +
                ", commentCount=" + commentCount +
                ", author='" + author + '\'' +
                ", viewCount=" + viewCount +
                '}';
    }
}
