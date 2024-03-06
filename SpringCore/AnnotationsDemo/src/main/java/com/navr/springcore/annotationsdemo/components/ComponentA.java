package com.navr.springcore.annotationsdemo.components;

import org.springframework.stereotype.Component;

/**
 * <pre>
 * Note:
 * '@Component' <==> '@Component ("componentA")'
 * It means, '@Component' annotation is same as '@Component ("componentA")'.
 * Default bean id is same as the class name but with first char in lowercase.
 * And, you can provide your desired bean name too in the '@Component' annotation.
 * </pre>
 */
@Component ("componentA")
public class ComponentA {

    @Override
    public String toString() {
        return "I'm componentA";
    }
}
