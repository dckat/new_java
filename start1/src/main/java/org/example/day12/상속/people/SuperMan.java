package org.example.day12.상속.people;

public class SuperMan extends Man {

    public SuperMan(String gender, String name, int power) {
        super(gender, name, power);
    }

    // 필드: 성별, 이름, 힘크기 (3개)
    // 메소드: 잠자다, 먹다, 달리다, 날아다니다 (4개)
    public void fly() {
        System.out.println("날아다니다.");
    }

    public String toString() {
        return "SuperMan{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", power=" + power +
                '}';
    }
}
