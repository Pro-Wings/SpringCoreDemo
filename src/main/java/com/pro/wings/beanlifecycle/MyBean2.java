package com.pro.wings.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyBean2 implements InitializingBean, DisposableBean {

    private int foo;

    public int getFoo() {
        return foo;
    }

    public void setFoo(int foo) {
        this.foo = foo;
    }



    @Override
    public String toString() {
        return "MyBean2{" +
                "foo=" + foo +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //init method
        System.out.println("init of MyBean2");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy of MyBean2");
    }
}
