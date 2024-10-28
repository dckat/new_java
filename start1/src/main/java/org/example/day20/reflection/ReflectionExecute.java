package org.example.day20.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExecute {
    public static void main(String[] args) {
        try {
            // 클래스 실행 시에 로딩
            Class<?> clazz = Class.forName("org.example.day20.reflection.Person");
            // 생성자 정보 획득
            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
            // 생성자 호출해서 객체를 생성
            Object person = constructor.newInstance("John", 30);

            // 메소드 정보(객체) 획득
            Method setName = clazz.getMethod("setName", String.class);
            setName.invoke(person, "Jane");     // 실행
            Method getName = clazz.getMethod("getName");
            System.out.println(getName.invoke(person));
            Field age = clazz.getDeclaredField("age");
            age.setAccessible(true);
            age.setInt(person, 35);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
