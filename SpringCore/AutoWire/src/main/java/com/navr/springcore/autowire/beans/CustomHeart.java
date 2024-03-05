package com.navr.springcore.autowire.beans;

public class CustomHeart {

    private String nameOfAnimal;
    private int numOfHearts;

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public int getNumOfHearts() {
        return numOfHearts;
    }

    public void setNumOfHearts(int numOfHearts) {
        this.numOfHearts = numOfHearts;
    }

    public void action() {
        System.out.printf("nameOfAnimal=%s, CustomHeart in action.%n", nameOfAnimal);
    }

    @Override
    public String toString() {
        return "CustomHeart{" +
                "nameOfAnimal='" + nameOfAnimal + '\'' +
                ", numOfHearts=" + numOfHearts +
                '}';
    }
}
