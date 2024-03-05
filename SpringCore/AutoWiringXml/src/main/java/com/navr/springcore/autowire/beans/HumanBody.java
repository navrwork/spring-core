package com.navr.springcore.autowire.beans;

public class HumanBody {

    private OrganHeart heartObj;
    private OrganEye eyeObj;

    public HumanBody () {

    }

    public HumanBody (OrganHeart heartObj, OrganEye eyeObj) {
        this.heartObj = heartObj;
        this.eyeObj = eyeObj;
    }

     public void setEyeObj(OrganEye eyeObj) {
        this.eyeObj = eyeObj;
    }

    public void setHeartObj(OrganHeart heart) {
        this.heartObj = heart;
    }

    public void doSomething() {
        heartObj.action();
        eyeObj.action();
    }
}
