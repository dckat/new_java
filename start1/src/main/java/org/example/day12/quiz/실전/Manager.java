package org.example.day12.quiz.실전;

public class Manager extends Employee {
    private int bonus;

    public Manager(String name, String address, int salary, int rrn, int bonus) {
        super(name, address, salary, rrn);
        this.bonus = bonus;
    }

    public void test() {
        System.out.println("테스트!");
    }

    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
