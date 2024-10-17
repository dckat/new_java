package org.example.day13.quiz.inherit;

public class Move {
    private int batteryCapacity;
    private String color;

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Move{" +
                "batteryCapacity=" + batteryCapacity +
                ", color='" + color + '\'' +
                '}';
    }
}
