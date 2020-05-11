package com.coreeight.basics.overloading;

public class Overloading {

    // Overloading - Multiple methods can have same name but arguments should be different
    /**
     * Rule 1 - One or more method can have same name
     * Rule 2 - Arguments should be different as below and either one is enough
     *          i) - Number of argument
     *          ii) - Types of arguments
     *          iii) - Order of arguments
     */

    public void addition(int i, int j){
        System.out.println("Addition" + (i+j));
    }

    /**
     * with Overloading - Number of arguments has changed
     *
     * @param i
     * @param j
     */
    public void addition(int i, int j, int k){
        System.out.println("Addition - polymorphism:- " + (i+j+k));
    }

    // Another Example -- Type has changed
    public void addition(float i, int j){
        System.out.println("Addition" + (i+j));
    }

    // Another Example -- Order has changed
    public void addition(int i, float j){
        System.out.println("Addition" + (i+j));
    }

    /**
     * with our Overloading
     * @param i
     * @param j
     * @param k
     */
    public void additionThreeArgs(int i, int j, int k){
        System.out.println("Addition - without polymorphism:-"+(i+j+k));
    }

}
