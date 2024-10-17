package org.example.day13.quiz.inherit;

public class Laptop extends Move {
    public void charge(int additionalCapacity) {
        setBatteryCapacity(getBatteryCapacity() + additionalCapacity);
    }

    @Override
    public String toString() {
        return "Laptop{" + "batteryCapacity=" +
                getBatteryCapacity()  + "} " + super.toString();
    }
}
