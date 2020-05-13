package com.coreeight.basics.myfinal;

// No one can extends final class
public final class MyFinal {

    // initialization should be at declaration place for final variables
    private static final String name = "Final Name";

    private static final String lName;
    static {
        lName = "Test L Name";
    }

    // we can assign value to final variable through constructor
    private final String finalVar;

    public MyFinal(String finalVar){
        this.finalVar = finalVar;
    }

    // Child can't override
    // Assume - we can declare final methods if we think not further changes in future and child should use this implementation
    public final void finalMethod(){
        System.out.println("Child can not create a method with method signature");
    }

    public static void main(String str[]){
        // MyFinal.name = "Modify";// can't reassign;

        System.out.println(MyFinal.name);

        MyFinal myFinal = new MyFinal("My Name");
        MyFinal myFinal1 = new MyFinal("My Another Name");

        // myFinal.finalVar = "";
        System.out.println(myFinal.finalVar);

        System.out.println(myFinal1.finalVar);
    }
}
