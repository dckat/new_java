package org.example.day19.pattern.singleton;


// 객체를 하나만 만들어서 사용하는 것.
// 생성된 하나의 객체를 싱글톤 객체 <--> 프로토타입
// 외부에서 객체생성을 못하게 막아야 함
// new SingletonClass();  ==> 객체 생성시 생성자메소드 호출을 못하게 막음. (private 설정)
public class SingletonClass {
    private static SingletonClass single;   // null --> 주소로 변환!

    private SingletonClass() {
        System.out.println("객체 생성됨!!");
    }

    public static SingletonClass getInstance() {
        if (single == null) {
            single = new SingletonClass();
        }
        return single;             // 생성된 싱글톤객체 주소 반환
    }
}
