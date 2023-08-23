package org.hsbc.question5.model;

public class Employee {
    private String firstName;
    private String city;
    private double salary;
    private int empNo;

    public Employee(String firstName, String city, double salary, int empNo) {
        this.firstName = firstName;
        this.city = city;
        this.salary = salary;
        this.empNo = empNo;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }
}
