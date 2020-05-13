package com.coreeight.basics.boxing;

public class Boxing {

    public static void main(String str[]){

        //int i
        Integer integer = Integer.valueOf("1");
        integer = Integer.valueOf(1);

        Double doubleValue = Double.valueOf(1.0);
        doubleValue = Double.valueOf("1.0");

        double doublePrimitive = integer; // Auto unboxing - conversion process is done by JVM
        doublePrimitive = integer.doubleValue(); // Unboxing - conversion process is done by Developer

        System.out.println(integer.compareTo(1));

        Boolean.valueOf("true");

        Character mychar = 'A'; // Auto Boxing - conversion process is done by JVM
        mychar = Character.valueOf('B'); // Boxing - conversion process is done by Developer
    }

}
