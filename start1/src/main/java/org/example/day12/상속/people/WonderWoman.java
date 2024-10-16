package org.example.day12.상속.people;

public class WonderWoman extends Woman {
    int high;   // 높이 점프!!!

    public WonderWoman(String gender, String name, int walk, int high) {
        super(gender, name, walk);
        this.high = high;
    }

    public String toString() {
        return "WonderWoman{" +
                "high=" + high +
                ", walk=" + walk +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
