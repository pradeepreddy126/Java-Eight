package com.coreeight.basics.objects;

public class Calculator {

    public void addition(int inputOne, int inputTwo){
        System.out.println("Result:- " + (inputOne+inputTwo));
    }

    public static void main(String str[]){
        Calculator calculator = new Calculator(); // -> one object
        calculator.addition(4, 5);

        calculator = new Calculator(); // -> it will remove old object address and will store new object
        // then first one will becomes orphan and it will be garbage collected by JVM to remove from memory
        calculator.addition(4, 5);


    }

}
