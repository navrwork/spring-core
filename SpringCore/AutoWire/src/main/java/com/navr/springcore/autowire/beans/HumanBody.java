package com.navr.springcore.autowire.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class HumanBody {

    private OrganHeart heartObj;
    private OrganEye eyeObj;

    public HumanBody () {

    }

    // @Autowired // --> Same as autowire="constructor"
    public HumanBody (OrganHeart heartObj, OrganEye eyeObj) {
        this.heartObj = heartObj;
        this.eyeObj = eyeObj;
        System.out.println("Inside HumanBody(2-arg) constructor ...");
    }

    @Autowired
    // Autowire byType is attempted first. If it fails, byName is used.
    // Autowire byType will fail if more than one bean definition is found for same class. byType is used in such case.
    // Autowire byName: Method parameter name should match with the bean id in beans.xml config
    public void setHeartObj(OrganHeart heartObj) { // "heartObj" --> method parameter name; bean id="heartObj";
        this.heartObj = heartObj;
        System.out.println("Inside setHeartObj() ...");
    }

    @Autowired
    public void setEyeObj(OrganEye eyeObj) {
        this.eyeObj = eyeObj;
        System.out.println("Inside setEyeObj() ...");
    }

    public void doSomething() {
        heartObj.action();
        eyeObj.action();
    }
}
