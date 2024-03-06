package com.navr.springcore.annotationsdemo.config;

import com.navr.springcore.annotationsdemo.components.ComponentB;
import com.navr.springcore.annotationsdemo.components.ComponentC;
import com.navr.springcore.annotationsdemo.components.SubComponent1;
import com.navr.springcore.annotationsdemo.components.SubComponent2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // Specifies that this is a Java config class which is equivalent of beans.xml
@ComponentScan ( // Scans for Spring components in the mentioned package(s)
        basePackages = {"com.navr.springcore.annotationsdemo.components"}
)
@PropertySource("classpath:component-info.properties")
public class AnnotationsDemoConfig {

    @Bean (name = {"compB", "componentB"}) // multiple aliases for the bean
    public ComponentB componentB() { // "componentB" --> this is default bean id
        return new ComponentB();
    }

    @Bean
    public ComponentC componentC() {
        ComponentC compC = new ComponentC(subComponent1()); // constructor injection
        compC.setSubComp2(subComponent2()); // setter injection
        return compC;
    }

    @Bean
    public SubComponent1 subComponent1() {
        return new SubComponent1();
    }

    @Bean
    public SubComponent2 subComponent2() {
        return new SubComponent2();
    }
}
