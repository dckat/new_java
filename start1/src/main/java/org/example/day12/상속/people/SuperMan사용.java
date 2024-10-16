package org.example.day12.상속.people;

public class SuperMan사용 {
    public static void main(String[] args) {
        SuperMan s = new SuperMan("남자", "수퍼맨", 100);
        System.out.println(s);  // toString()

        s.eat();
        s.run();
        s.fly();
        s.sleep();
    }
}
