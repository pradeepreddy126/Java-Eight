package com.coreeight.basics.polymorphism;

public class DynamicOrRuntimePoly {

    /**
     * Runtime or Dynamic poly - compiler says one with will be executed but runtime will execute another one is called Dynamic poly
     * @param str
     */
    public static void main(String str[]){

        // <Parent Type > referenceName = new <Parent Type>
        Parent parent = new Parent();
        parent.addition(1,1);

        System.out.println("************************");

        // <Child Type > referenceName = new <Child Type>
        Child child = new Child();
        child.addition(1, 2);

        System.out.println("************************");

        // <Parent Type > referenceName = new <Child Type>
       Parent parentChild = new Child();
       parentChild.addition(1, 3);

        // <Child Type > referenceName = new <Parent Type> is wrong
        // Child childParent = new Parent(); is wrong

    }
}
