package com.navr.springcore.annotationsdemo.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Demo using '@Autowired' annotation on dependency classes.
 */
@Component
public class ComponentD {

    @Value("componentDon")
    // Used for injecting values into fields in Spring-managed beans,
    // and it can be applied at the field or constructor/method parameter level.
    private String componentFancyName1; // populated directly via @Value annotation

    @Value("${componentD.componentFancyName2}")
    private String componentFancyName2; // populated from  properties file


    private String componentFancyName3; // populated from  properties file via setter method

    @Value("${componentD.componentFancyName3}")
    @Required
    public void setComponentFancyName3(String componentFancyName3) {
        this.componentFancyName3 = componentFancyName3;
    }

    @Autowired // default @Primary bean picked in this case
    private IComponent componentX;

    @Autowired
    @Qualifier ("componentImpl2") // use Qualifier annotation to pick a specific impl
    private IComponent componentY;

    private SubComponent1 subComp1;

    private SubComponent2 subComp2;

    @Autowired
    public void setSubComp1(SubComponent1 subComp1) {
        this.subComp1 = subComp1;
    }

    @Autowired
    public void setSubComp2(SubComponent2 subComp2) {
        this.subComp2 = subComp2;
    }

    @Override
    public String toString() {
        return "I'm ComponentD / " + this.componentFancyName1
                + " / " + this.componentFancyName2
                + " / " + this.componentFancyName3
                + "\r\n\t\t .. using @Autowired, @Value annotations. "
                + "\r\n\t\t componentX: " + componentX.toString()
                + "\r\n\t\t componentY: " + componentY.toString()
                +".\r\n\t\t subComponent(s) -> "
                + subComp1.toString()
                + subComp2.toString()
                ;
    }
}
