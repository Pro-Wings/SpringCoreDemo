package com.pro.wings.constructorinject;

import com.pro.wings.Address;

import javax.annotation.PostConstruct;

public class Employee {

    private int eid;
    //private Address empAdd; //dependency injection via constructor
    private String name;
    private String addr;
    private String lname;

    public Employee(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }

    public Employee(int eid, String addr, String lname) {
        System.out.println("constructor 1 invoked!!!");
        this.eid = eid;
        this.addr = addr;
        this.lname = lname;
    }

    public Employee(String name, String addr, String lname) {
        System.out.println("constructor 2 invoked!!!");
        this.name = name;
        this.addr = addr;
        this.lname = lname;
    }

    public Employee() {
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
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
