package com.navr.springcore.propertiesdemo;

/**
 * This class demonstrates usage of XML config for a properties file.
 */
public class StudentV1 {

    private String name;
    private int age;
    private String city;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
