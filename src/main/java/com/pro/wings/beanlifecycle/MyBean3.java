package com.pro.wings.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyBean3 {

    private int bar;

    public int getBar() {
        return bar;
    }

    public void setBar(int bar) {
        this.bar = bar;
    }

    @PostConstruct
    public void init()
    {
        System.out.println("in init of MyBean3");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("in destroy of MyBean3");
    }

    @Override
    public String toString() {
        return "MyBean3{" +
                "bar=" + bar +
                '}';
    }
}
