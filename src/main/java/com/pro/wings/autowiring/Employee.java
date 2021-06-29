package com.pro.wings.autowiring;

import javax.annotation.PostConstruct;

public class Employee {

    private int eid;
    private String name;
    private String addr;
    private Department department;

    public Employee(int eid, String name, String addr, Department department) {
        System.out.println("constructor invoked");
        this.eid = eid;
        this.name = name;
        this.addr = addr;
        this.department = department;
    }

    public Employee() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        System.out.println("eid setter invoked");
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("name setter invoked");
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        System.out.println("addr setter invoked");

        this.addr = addr;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        System.out.println("dept setter invoked");
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", department=" + department +
                '}';
    }
}
