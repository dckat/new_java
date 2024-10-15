package org.example.day11.정적static;

public class 운동 {
    String game;
    String withMe;
    int time;
    static int count;
    private static int sum;

    public 운동(String game, String withMe, int time) {
        this.game = game;
        this.withMe = withMe;
        this.time = time;
        count++;
        sum += time;
    }

    public static int getSum() {
        return sum;
    }

    public String toString() {
        return "운동{" +
                "game='" + game + '\'' +
                ", withMe='" + withMe + '\'' +
                ", time=" + time +
                '}';
    }
}
