package com.klu.SpringFirstApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    Student student = context.getBean("Student",Student.class);
    		student.display();
    
    }
}
