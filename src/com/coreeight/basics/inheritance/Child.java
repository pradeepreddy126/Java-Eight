package com.coreeight.basics.inheritance;

public class Child extends Parent{

    Child(){
        this("Parent"); // Should be first & we can other constructor in this class
        System.out.println("Child(){}");
    }

    Child(String nameForParent){
        super(nameForParent); // Should be first & we can call parent constructor
        System.out.println("Child(){}");
    }

    int phoneNumVar = 5;

    public void myChildMethod(){
        System.out.println("My Child Method");
    }

    public void callParentMembersFromChild(){
        System.out.println(super.phoneNumVar);
        System.out.println(super.parentVar);
        super.myParentMethod();
    }
}
