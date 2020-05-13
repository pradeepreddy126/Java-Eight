package com.coreeight.basics.inheritance;

public class Parent {

    Parent(){
        System.out.println("Parent(){}");
    }

    Parent(String parentName){
        System.out.println("Parent(String parentName){} :- " +parentName);
    }

    int parentVar = 1;
    int phoneNumVar = 2;

    public void myParentMethod(){
        System.out.println("myParentMethod()");
    }

}
