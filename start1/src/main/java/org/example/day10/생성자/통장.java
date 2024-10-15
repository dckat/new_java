package org.example.day10.생성자;

public class 통장 {
    String name;
    String ssn;
    int money;
    // static 키워드가 붙어있는 변수는 객체 생성과 상관없이 클래스에서 바로 접근 가능
    // 정적변수, static변수, 클래스변수
    // "클래스명.변수명" 접근해서 사용 가능
    // 1) 객체마다 공유할 목적! (누적용)
    // 2) 객체 생성없이 언제든지 접근해서 사용목적!
    static int count;   // 0으로 초기화


    public 통장(String name, String ssn, int money) {
        this.name = name;
        this.ssn = ssn;
        this.money = money;
        count++;
    }

    public int getMoney() {
        return money;
    }

    public String toString() {
        return "통장{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", money=" + money +
                '}';
    }
}
