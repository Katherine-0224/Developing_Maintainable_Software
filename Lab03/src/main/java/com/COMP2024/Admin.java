package com.COMP2024;

public class Admin extends Employee{
    public Admin(String name) {
        super(name);
    }

    @Override
    public int calculateChristmasBonus() {
        return (int)(this.salary*0.08);
    }

}
