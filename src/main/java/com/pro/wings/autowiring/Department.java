package com.pro.wings.autowiring;

public class Department {

    String deptName;

    public Department() {
    }

    public Department(String deptName) {
        System.out.println("constructor invoked");
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                '}';
    }
}
