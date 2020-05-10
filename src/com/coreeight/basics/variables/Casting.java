package com.coreeight.basics.variables;

public class Casting {

    public static void main(String str[]){

        int myInt = 12121212;

        byte myByte = (byte) myInt; // explicit casting
        long myLong = myInt; // implicit casting

        System.out.println(myByte);
        System.out.println(myLong);

        System.out.println("******************************");

        int myInt1 = 127;

        byte myByte1 = (byte) myInt1;

        System.out.println(myByte1);


    }
}
