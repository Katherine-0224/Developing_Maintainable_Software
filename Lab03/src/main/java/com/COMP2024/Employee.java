package com.COMP2024;

public abstract class Employee implements Employable {
    protected String name;
    protected int salary;
    protected int employeeId;

    public Employee(String name) {
        this.name = name;
        setSalary(1000);
    }

    @Override
    public void setEmployeeID(int number) {
        this.employeeId = number;
    }

    @Override
    public int getEmployeeID() {
        return this.employeeId;
    }

    @Override
    public void setEmployeeName(String name) {
        this.name = name;
    }

    @Override
    public String getEmployeeName() {
        return this.name;
    }

    @Override
    public int getSalary() {
        return this.salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
