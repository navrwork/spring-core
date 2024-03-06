package com.navr.springcore.propertiesdemo;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

/**
 * This class demonstrates usage of annotations like @Value and properties file.
 */
public class StudentV2 {

    private String name;
    private int age;
    private String city;


    @Value("${studentV2.name}")
    @Required
    public void setName(String name) {
        this.name = name;
    }

    @Value("${studentV2.age}")
    public void setAge(int age) {
        this.age = age;
    }

    @Value("${studentV2.city}")
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "StudentV1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
