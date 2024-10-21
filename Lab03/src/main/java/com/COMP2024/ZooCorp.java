package com.COMP2024;

import java.util.ArrayList;

public class ZooCorp {
    private ArrayList<Zoo> zoos;
    private ArrayList<Employee> employees;

    public ZooCorp(Zoo zoo) {
        zoos = new ArrayList<Zoo>();
        employees = new ArrayList<Employee>();
        addZoo(zoo);
    }

    public void addStaff(Employee employee) {
        employees.add(employee);
    }

    public void addZoo(Zoo zoo) {
        zoos.add(zoo);
    }

    public ArrayList<Zoo> getZoos() {
        return zoos;
    }

}
