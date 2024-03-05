package com.navr.springcore.autowire;

import com.navr.springcore.autowire.beans.CustomAnimal;
import com.navr.springcore.autowire.beans.HumanBody;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        HumanBody body = appContext.getBean("bodyObject", HumanBody.class);
        body.doSomething();

        CustomAnimal animal = appContext.getBean("customAnimal", CustomAnimal.class);
        animal.doSomething();
    }
}