package com.pro.wings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        System.out.println("Hey Java developer!!!!");

//        Student std = new Student(123,"Ram","Pune");
//
//        System.out.println(std);

        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");

        Student student1=(Student) context.getBean("student1");
        Student student2=(Student) context.getBean("student2");

        System.out.println(student1);
        System.out.println(student2);


    }
}
