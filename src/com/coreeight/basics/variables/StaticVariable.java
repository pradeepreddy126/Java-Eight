package com.coreeight.basics.variables;

public class StaticVariable {

    // Static Variable or Class Variable
    private static long phoneNumber;

    public static void main(String str[]){

        System.out.println(StaticVariable.phoneNumber);
        StaticVariable.phoneNumber = 9191919191l;
        System.out.println(StaticVariable.phoneNumber);
    }

}
