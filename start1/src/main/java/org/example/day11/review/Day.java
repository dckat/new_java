package org.example.day11.review;

public class Day {
    String doing;       // 한 일
    int time;           // 시간
    String location;    // 장소

    // static 변수는 공유목적, 누적목적 ==> 정적변수. 클래스변수
    static int count;
    static int sum;     // 시간 누적

    // 객체 생성시 멤버변수 초기화 목적 --> 생성자 메소드
    // 객체 생성시에 자동으로 호출
    // 생성자 메소드가 되기 위한 조건
    // 1. 클래스 이름과 무조건 동일
    // 2. 리턴타입을 명시하면 자동호출되지 않음
    // 생성자의 특징
    // 1. 오버로딩 할 수 있음
    // 2. 생성자를 하나도 명시하지 않으면 컴파일러에서 자동으로 하나 추가
    //    public 클래스명() {} --> 입력매개변수 없고, 내용도 없는 생성자 메소드 ==> 기본생성자(default constructor)

    // 멤버변수 초기화 목적
    public Day(String doing, int time, String location) {
        this.doing = doing;
        this.time = time;
        this.location = location;
        count++;
        sum += time;    // sum = sum + time;
    }

    public static double getAvg() {
        // System.out.println(getDoing());
        // static 메소드 내에서 클래스 내부 함수 호출 시에는 static 메소드만 가능
        // static 메소드내에 사용할 수 있는 변수는 static 변수만 써야한다.
        // 이유) static은 객체 생성전에 언제든지 호출할 수 있기 때문에
        //      객체생성 후 힙영역에 접근하여 사용하는 인스턴스 변수는 사용 불가능
        return (double)sum / count;
    }

    public String getDoing() {
        return doing;
    }

    // Day 클래스 내에서는 클래스 내부의 것이므로 메소드이름()으로 바로 호출해서 사용가능
    public String getDoingTime() {
        return getDoing() + " " + time;
    }

    // 멤버변수를 출력할 목적
    public String toString() {
        return "하루{" +
                "doing='" + doing + '\'' +
                ", time=" + time +
                ", location='" + location + '\'' +
                '}';
    }
    // ==> 클래스로 생성된 객체(참조형변수, day1)를 출력할 때
    //     출력할 문자열을 자동으로 생성
    //     모든 클래스는 toString() 메소드를 가지고 시작(묵시적)
    //     패키지명.클래스명@주소 --> 해당 문자열을 기본으로 생성
}
