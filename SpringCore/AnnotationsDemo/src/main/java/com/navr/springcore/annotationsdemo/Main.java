package com.navr.springcore.annotationsdemo;

import com.navr.springcore.annotationsdemo.components.ComponentA;
import com.navr.springcore.annotationsdemo.components.ComponentB;
import com.navr.springcore.annotationsdemo.components.ComponentC;
import com.navr.springcore.annotationsdemo.components.ComponentD;
import com.navr.springcore.annotationsdemo.config.AnnotationsDemoConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * Few ways to create ApplicationContext:
 * i.  Have bean definitions in a XML file (say, beans.xml) and use ClassPathXmlApplicationContext to
 * load bean definitions.
 * ii. Have bean definitions in Java config file and use AnnotationConfigApplicationContext load beans.
 * You don't need XML config at all in this case.
 * </pre>
 */
public class Main {
    public static void main(String[] args) {

        //
        // ApplicationContext for XML config reference below
        //
        // ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        //

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AnnotationsDemoConfig.class);

        ComponentA compA = appContext.getBean("componentA", ComponentA.class);
        System.out.printf("compA=%s%n", compA.toString());

        ComponentB compB = appContext.getBean("compB", ComponentB.class);
        System.out.printf("compB=%s%n", compB.toString());

        ComponentC compC = appContext.getBean("componentC", ComponentC.class);
        System.out.printf("compC=%s%n", compC.toString());

        ComponentD compD = appContext.getBean("componentD", ComponentD.class);
        System.out.printf("compD=%s%n", compD);

        ((AnnotationConfigApplicationContext)appContext).close();
    }
}