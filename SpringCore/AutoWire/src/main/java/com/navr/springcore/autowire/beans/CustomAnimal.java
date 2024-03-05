package com.navr.springcore.autowire.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CustomAnimal {

    private CustomHeart heart;

    @Autowired
    @Qualifier ("hagfishHeart")
    public void setHeart(CustomHeart heart) {
        this.heart = heart;
        System.out.println("Inside CustomAnimal.setHeart()");
    }

    public void doSomething() {
        heart.action();
    }

}
