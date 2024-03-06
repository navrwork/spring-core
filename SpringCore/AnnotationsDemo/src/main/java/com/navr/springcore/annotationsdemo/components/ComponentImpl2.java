package com.navr.springcore.annotationsdemo.components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ComponentImpl2 implements IComponent {
    @Override
    public String toString() {
        return " ## ComponentImpl2 ## ";
    }
}
