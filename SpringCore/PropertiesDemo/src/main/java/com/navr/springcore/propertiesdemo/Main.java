package com.navr.springcore.propertiesdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This Spring app demonstrates the use of properties file
 * to fetch data from.
 *      i.  V1 -- reading properties file with XML config and
 *      ii. V2 -- reading properties file with annotations.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        StudentV1 studentV1 = appContext.getBean("studentV1", StudentV1.class);
        System.out.printf("studentV1=%s%n", studentV1);

        StudentV2 studentV2 = appContext.getBean("studentV2", StudentV2.class);
        System.out.printf("studentV2=%s%n", studentV2);

        DbConnectionInfo dbConnectionInfo = appContext.getBean("dbConnectionInfo", DbConnectionInfo.class);
        System.out.printf("dbConnectionInfo=%s%n", dbConnectionInfo);
    }
}