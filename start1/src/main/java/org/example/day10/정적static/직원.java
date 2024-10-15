package org.example.day10.정적static;

public class 직원 {
    String name;
    int age;
    String gender;
    static int count;
    static int totalAge;

    public 직원(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        count++;
        totalAge += age;
    }

    public String toString() {
        return "직원{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
