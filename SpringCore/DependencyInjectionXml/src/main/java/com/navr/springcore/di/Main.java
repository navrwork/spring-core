package com.navr.springcore.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");

        Student student = appContext.getBean("student", Student.class);
        System.out.printf("student=%s%n", student);

        Course course = appContext.getBean("course", Course.class);
        System.out.printf("course=%s%n", course);

        StudentNew studentNew = appContext.getBean("studentNew", StudentNew.class);
        System.out.printf("%nStudentNew=%s%n", studentNew);
        studentNew.getCheatBook().doCheat();

    }
}