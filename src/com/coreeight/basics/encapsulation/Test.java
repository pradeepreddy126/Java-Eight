package com.coreeight.basics.encapsulation;

public class Test {
    public static void main(String str[]){
        Student student = new Student();
        student.setfName("First Name");
        student.setlName("Last Name");

        System.out.println(student.getfName());
        System.out.println(student.getlName());
    }
}
