package org.example.day10.생성자;

public class TV {
    int channel;
    int volume;
    boolean onOff;

    public TV(int channel, int volume, boolean onOff) {
        this.channel = channel;
        this.volume = volume;
        this.onOff = onOff;
    }

    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", onOff=" + onOff +
                '}';
    }
}
