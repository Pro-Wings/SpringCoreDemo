package com.pro.wings.beanlifecycle;

public class MyBean {

    private int number;

    public MyBean() {
    }

    public MyBean(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        System.out.println("setting the values by setter method");
        this.number = number;
    }

    public void start()
    {
        System.out.println("inside init method of MyBean.... preparing the DB connection..!!!");
    }

    public void destroy()
    {
        System.out.println("inside destroy method of MyBean... closing the DB connection..!!!");
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "number=" + number +
                '}';
    }
}
