package com.pro.wings.autowiring.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestAutowiringAnnotation {

    public static void main(String[] args) {

        AbstractApplicationContext ctx = new FileSystemXmlApplicationContext("E:\\HibernetExamples\\MyFirstSpringCoreApp\\src\\main\\java\\com\\pro\\wings\\autowiring\\annotation\\autowiring_annotation_config.xml");

        Emp emp = (Emp) ctx.getBean("employee");
        System.out.println(emp);
        System.out.println("emp Address hashcode : "+emp.getAddress().hashCode());
        System.out.println("emp hashcode : "+emp.hashCode());


        Emp emp1 = (Emp) ctx.getBean("employee");
        System.out.println("emp1 Address hashcode : "+emp1.getAddress().hashCode());
        System.out.println(emp1);
        System.out.println("emp1 hashcode : "+emp1.hashCode());

    }
}
