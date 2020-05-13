package com.coreeight.basics.objects;

/**
 * What object is nothing but state & behaviour
 * state will be get updated once behaviour runs
 */
public class MyJava {

    String objectName;

    MyJava(String name){
        objectName = name;
    }

    public static void main(String atr[]){

        // we can create number of objects and object will have object members - object variables, object methods, object blocks - ( which are all non static)
        MyJava java = new MyJava("Name One");
        MyJava java1 = new MyJava("Name Two");

        System.out.println(java.objectName);
        System.out.println(java1.objectName);

        System.out.println("********************");
        java1.objectName = "Name has Updated";

        System.out.println(java.objectName);
        System.out.println(java1.objectName);

    }


}
