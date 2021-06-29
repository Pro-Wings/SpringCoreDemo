package com.pro.wings.autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestAutowiring {

    public static void main(String[] args) {

        AbstractApplicationContext ctx = new FileSystemXmlApplicationContext("E:\\HibernetExamples\\MyFirstSpringCoreApp\\src\\main\\java\\com\\pro\\wings\\autowiring\\autowiring_config.xml");

        Employee emp = (Employee) ctx.getBean("employee");
        System.out.println(emp);

    }
}
