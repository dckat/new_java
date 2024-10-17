package org.example.day13.quiz.inherit;

public class Tablet extends Move {
    private boolean isConnected;

    public boolean getIsConnected() {
        return isConnected;
    }

    public void setIsConnected(boolean connected) {
        isConnected = connected;
    }

    public String toString() {
        return "Tablet{" +
                "isConnected=" + getIsConnected() +
                ", batteryCapacity=" + getBatteryCapacity() +
                "} " + super.toString();
    }
}
