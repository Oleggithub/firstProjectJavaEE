package com.bugs.null_pointer_exceptions;

public class ExtendTest1 {

    public static void main(String[] args) {
        new Child();
    }
}

abstract class Parent {
    public Parent() {
        init();
    }

    public abstract void init();
}


class Child extends Parent {
    private String mTitle = "sfdv";

    public Child() {
        super();
        System.out.println(mTitle.equals(toString()));
    }

    public void init() {
        mTitle = "It' a test";
    }
}