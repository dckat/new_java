package org.example.day11.quiz;

public class Drink {
    String name;
    int cost;
    int count;

    public Drink(String name, int cost, int count) {
        this.name = name;
        this.cost = cost;
        this.count = count;
    }

    public String toString() {
        return name + " (가격: " + cost + "원, 재고: " + count + "개)";
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
