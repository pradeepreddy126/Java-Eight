package com.coreeight.basics.variables;

public class ClassVariable {

    // Static Variable or Class Variable
    private static long phoneNumber;

    public static void main(String str[]){

        System.out.println(ClassVariable.phoneNumber);
        ClassVariable.phoneNumber = 9191919191l;
        System.out.println(ClassVariable.phoneNumber);
    }

}
