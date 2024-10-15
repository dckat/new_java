package org.example.day10.정적static;

public class Day {
    String work;
    int time;
    String place;
    static int totalTime;
    static int totalDay;

    public Day(String work, int time, String place) {
        this.work = work;
        this.time = time;
        this.place = place;
        totalTime += time;
        totalDay++;
    }

    public String toString() {
        return work + "를(을) " + time + "시간만큼 " + place + "에서 했습니다.";
    }
}
