package com.wipro.bean;

public class Employee {

    private String name;
    private String empId;
    private Address address;

    public Employee() {
    }

    public Employee(String name, String empId, Address address) {
        this.name = name;
        this.empId = empId;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EMPLOYEE [" + " empId= " + this.empId + " empName= " + this.name + " " + this.address + " ]";
    }

}