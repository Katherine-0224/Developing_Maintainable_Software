package com.COMP2024;

public class Zookeeper extends Employee{

    public Zookeeper(String name) {
        super(name);
    }

    @Override
    public int calculateChristmasBonus() {
        return (int)(this.salary*0.05 + 100);
    }
}
