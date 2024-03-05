package com.navr.springcore.ioc;

import com.navr.springcore.ioc.beans.A;
import com.navr.springcore.ioc.beans.B;
import com.navr.springcore.ioc.beans.C;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        ClassPathResource res = new ClassPathResource("beans.xml");
//        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(res); // Deprecated.
//        A bfObj = (A)xmlBeanFactory.getBean("classA");
//
//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//        reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//        A objA = (A)factory.getBean("classA");


        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        A objA = (A)appContext.getBean("classA");
        B objB = appContext.getBean("classB", B.class);
        C objC = appContext.getBean("classC", C.class);

        System.out.printf("objA.saySomething=%s%n", objA.saySomething());
        System.out.printf("objB.saySomething=%s%n", objB.saySomething());
        System.out.printf("objC.saySomething=%s%n", objC.saySomething());

        // ApplicationContext info
        System.out.printf("appContext.getApplicationName=%s%n", appContext.getApplicationName());
        System.out.printf("appContext.getDisplayName=%s%n", appContext.getDisplayName());
        System.out.printf("appContext.getBeanDefinitionNames=%s%n", (Object) Arrays.stream(appContext.getBeanDefinitionNames()).toList());
        System.out.printf("appContext.isSingleton(\"classA\")=%s%n", appContext.isSingleton("classA"));
    }
}