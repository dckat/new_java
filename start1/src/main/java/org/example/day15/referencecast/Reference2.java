package org.example.day15.referencecast;

public class Reference2 {
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck();
        Person person = new Person();

        car = truck;           // 부모클래스(개념 큼) <-- 자식클래스(개념 작음). 자동형변환
        truck = (Truck)car;    // 자식클래스(개념 작음) <-- 부모클래스(개념 큼). 강제형변환
        // person = car;       // 상속관계가 아니면 개념이 완전히 다르기 때문에 형변환 불가!!!

        // public void call(Car c)
        // call(Taxi). call(Truck): 가능
        // call(Person): 불가능
    }
}
