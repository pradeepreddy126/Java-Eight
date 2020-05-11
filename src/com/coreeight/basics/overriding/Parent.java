package com.coreeight.basics.overriding;

import javax.print.attribute.standard.NumberUp;

public class Parent {

    /**
     * Parent - addition
     * @param i
     * @param j
     */
    void addition(int i, int j){
        System.out.println(i+j);
    }

    /**
     * Parent - concatenate
     * @param fName
     * @param lName
     */
    protected String concatinateInput(String fName, String lName){
        return fName+"."+lName;
    }

    /**
     * Parent - concatenate
     * @param firstNUmber
     * @param lastNUmber
     */
    protected Number concatinateInput(Number firstNUmber, Number lastNUmber){
        return firstNUmber.doubleValue()+lastNUmber.doubleValue();
    }

}
