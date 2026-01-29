package com.klu.SpringConstructorID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.klu.SpringConstructorID.config.AppConfig;
import com.klu.SpringConstructorID.model.Student;

/**
 * Hello world
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = context.getBean(Student.class);
        student.setId(33271);
        student.setName("Sejal");
        
        student.dispaly();
    }
}
