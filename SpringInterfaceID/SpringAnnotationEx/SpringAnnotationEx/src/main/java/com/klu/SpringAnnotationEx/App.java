package com.klu.SpringAnnotationEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.klu.SpringAnnotationEx.config.AppConfig;
import com.klu.SpringAnnotationEx.model.Student;



/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = context.getBean("student", Student.class);
        student.setId(33274);
        student.setName("Sejal");
		student.display();
    }
}