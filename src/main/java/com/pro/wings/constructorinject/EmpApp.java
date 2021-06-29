package com.pro.wings.constructorinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class EmpApp {

    public static void main(String[] args) {

        ApplicationContext ctx = new FileSystemXmlApplicationContext("E:\\HibernetExamples\\MyFirstSpringCoreApp\\src\\main\\java\\com\\pro\\wings\\constructorinject\\emp_config.xml");

        Employee e1 = (Employee) ctx.getBean("emp1");
        System.out.println(e1.hashCode());
        Employee e2 = (Employee) ctx.getBean("emp1");
        System.out.println(e2.hashCode());

        System.out.println(e1);
        
    }
}
