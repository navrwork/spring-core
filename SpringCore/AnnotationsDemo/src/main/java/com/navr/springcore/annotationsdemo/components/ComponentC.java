package com.navr.springcore.annotationsdemo.components;

/**
 * ComponentC class:
 * SubComponent1 gets injected via Constructor.
 * SubComponent2 gets injected via setter method.
 *
 */
public class ComponentC {

    private SubComponent1 subComp1; // dependency component

    private SubComponent2 subComp2; // dependency component

    public ComponentC(SubComponent1 subComp1) { // Inject dependency obj via constructor
        this.subComp1 = subComp1;
    }

    public void setSubComp2(SubComponent2 subComp2) { // Inject dependency obj via setter method
        this.subComp2 = subComp2;
    }

    @Override
    public String toString() {
        return "I'm ComponentC ... using Java config. subComponent(s) -> "
                + subComp1.toString()
                + subComp2.toString()
                ;
    }
}
