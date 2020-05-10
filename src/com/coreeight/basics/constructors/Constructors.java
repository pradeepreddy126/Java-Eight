package com.coreeight.basics.constructors;

public class Constructors {

    // Constructors
    // default, public, protected, private
    public Constructors(){
        System.out.println("Constructors() - Constructor executed");
    }

    public Constructors(String constructorName/*constructorName is constructor argument*/){
        String logFormat= "Constructor name is - " + constructorName; // logFormat is local variable or constructor variable
        System.out.println(logFormat);
    }

    public static void main(String str[]){

        new Constructors("Testing...");
    }
}
