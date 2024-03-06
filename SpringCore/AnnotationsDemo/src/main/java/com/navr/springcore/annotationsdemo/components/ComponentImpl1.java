package com.navr.springcore.annotationsdemo.components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // used to indicate the primary bean when multiple beans of the same type are present for auto wiring.
public class ComponentImpl1  implements IComponent {
    @Override
    public String toString() {
        return " ## ComponentImpl1 ## ";
    }
}
