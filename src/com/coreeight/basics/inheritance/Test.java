package com.coreeight.basics.inheritance;

public class Test {

    public static void main(String str[]){

        Parent parent = new Parent();
        System.out.println(parent.phoneNumVar);
        parent.myParentMethod();

        Child child = new Child();
        System.out.println(child.phoneNumVar);
        child.myChildMethod();
        child.myParentMethod();
        System.out.println(child.parentVar);

        Parent parentChild = new Child();
        System.out.println(parentChild.phoneNumVar);
        parentChild.myParentMethod();
        System.out.println(parentChild.parentVar);

        child.callParentMembersFromChild();

    }
}
