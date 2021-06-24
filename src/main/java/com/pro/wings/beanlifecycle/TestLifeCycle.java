package com.pro.wings.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestLifeCycle {

    public static void main(String[] args) {

        AbstractApplicationContext ctx = new FileSystemXmlApplicationContext("E:\\HibernetExamples\\MyFirstSpringCoreApp\\src\\main\\java\\com\\pro\\wings\\beanlifecycle\\beanlifecycle_config.xml");

        MyBean bean1 = (MyBean) ctx.getBean("bean1");
        MyBean2 bean2 = (MyBean2) ctx.getBean("bean2");
        MyBean3 bean3 = (MyBean3) ctx.getBean("bean3");

        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(bean3);

        ctx.registerShutdownHook();//responsible for closing the container

    }
}
