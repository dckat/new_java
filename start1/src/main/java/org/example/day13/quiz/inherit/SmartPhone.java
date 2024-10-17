package org.example.day13.quiz.inherit;

public class SmartPhone extends Move {
    private int cameraResolution;

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public String toString() {
        return "SmartPhone{" +
                "cameraResolution=" + getCameraResolution() +
                ", batteryCapacity=" + getBatteryCapacity() +
                "} " + super.toString();
    }
}
