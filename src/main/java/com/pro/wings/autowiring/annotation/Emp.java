package com.pro.wings.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
//    @Autowired
    private Address address;

    public Emp() {

    }
//    @Autowired
    public Emp(Address address) {
        System.out.println("constructor called");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
    @Autowired
    @Qualifier("123")
    public void setAddress(Address address) {
        System.out.println("setter called");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address =" + address +
                '}';
    }
}
