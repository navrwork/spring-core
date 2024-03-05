package com.navr.springcore.autowirexml;

import com.navr.springcore.autowirexml.beans.HumanBody;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        HumanBody body = appContext.getBean("bodyObject", HumanBody.class);
        body.doSomething();
    }
}