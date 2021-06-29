package com.pro.wings.constructorinject;

import com.pro.wings.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
public class Employee {

    private int eid;
    @Autowired
    private Address empAdd; //dependency injection via constructor
    private String name;
    private String lname;

    public Employee(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }

    public Employee(int eid, Address empAdd, String name, String lname) {
        System.out.println("constructor called!!!");
        this.eid = eid;
        this.empAdd = empAdd;
        this.name = name;
        this.lname = lname;
    }

    public Employee() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public Address getEmpAdd() {
        return empAdd;
    }

    public void setEmpAdd(Address empAdd) {
        this.empAdd = empAdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @PostConstruct
    public void init()
    {
        System.out.println("inside init method");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", empAdd=" + empAdd +
                ", name='" + name + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
