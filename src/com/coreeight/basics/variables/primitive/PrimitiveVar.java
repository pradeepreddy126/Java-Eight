package com.coreeight.basics.variables.primitive;

public class PrimitiveVar {

    public static void main(String str[]){

        byte myByteVar = 1;
        byte myByteVar1 = -128;
        byte myByteVar2 = 127;

        short myShortVar = 12345;

        int myIntVar = 1234567891;
        float myFloatVar = 1234567891.01f;

        long myLongVar = 9191919191l;
        double myDoubleVar = 1234567891.01;

        char myCharVar = '1';
        char myCharVar1 =  '\u0111';

        System.out.println(myCharVar);

        boolean isTrue = false;
        if(isTrue) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

}
