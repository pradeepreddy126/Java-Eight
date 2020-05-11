package com.coreeight.basics.polymorphism;

public class Child extends Parent {

    @Override
    public void addition(int i, int j) {
        // Child owen behaviour or implementation with parent method signature
        System.out.println( "Input is i: "+i + ", j: "+j +" => result is " +(i+j));
    }

}
