package com.klu.SpringSetterID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.klu.SpringSetterID.config.AppConfig;
import com.klu.SpringSetterID.model.Student;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = context.getBean(Student.class);
        student.setId(33274);
        student.setName("Sejal");
        
        student.display();
}
}