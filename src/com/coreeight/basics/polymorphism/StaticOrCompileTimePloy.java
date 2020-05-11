package com.coreeight.basics.polymorphism;

public class StaticOrCompileTimePloy {

    public void addition(int i, int j){
        System.out.println("Addition - " + (i+j));
    }

    /**
     * with polymorphism
     *
     * @param i
     * @param j
     */
    public void addition(int i, int j, int k){
        System.out.println("Addition - polymorphism:- " + (i+j+k));
    }

    /**
     * with our polymorphism
     * @param i
     * @param j
     * @param k
     */
    public void additionThreeArgs(int i, int j, int k){
        System.out.println("Addition - without polymorphism:-"+(i+j+k));
    }

    public static void main(String str[]){
        StaticOrCompileTimePloy poly = new StaticOrCompileTimePloy();
        poly.addition(5,6);
        poly.addition(5, 6, 7); // with polymorphism
        poly.additionThreeArgs(5,6, 7); // With out polymorphism
    }

}
