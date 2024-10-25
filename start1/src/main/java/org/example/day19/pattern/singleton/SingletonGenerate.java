package org.example.day19.pattern.singleton;

public class SingletonGenerate {
    public static void main(String[] args) {
        // new SingletonClass();  ==> 외부에서 객체 생성 불가능
        // 싱글톤 객체는 싱글톤 클래스 내부에서 하나만 만들도록 해야함.
        // 외부에서는 하나만 만들어놓은 싱글톤 객체의 주소를 가져다가 사용
        // 외부에서는 하나가 만들어졌는지 모름. static 메소드로 호출해서 확인!
        SingletonClass one = SingletonClass.getInstance();
        SingletonClass two = SingletonClass.getInstance();
        System.out.println(one);
        System.out.println(two);
    }
}
