package com.klu.SpringJavaEx;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.klu.SpringJavaEx.config.AppConfig;
import com.klu.SpringJavaEx.model.Student;




/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
     Student student = context.getBean (Student.class);
        		student.display();
        
    }
}
