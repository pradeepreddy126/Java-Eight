package com.coreeight.basics.blocks;

public class BlocksVariables {

    static String fName ;
    String lName;

    static {
        fName = "My First Name";
    }

    {
        lName = "My Last Name";
    }

    public static void main(String str[]){
        System.out.println(fName);

        BlocksVariables ref = new BlocksVariables();
        System.out.println(ref.lName);
        System.out.println(ref.fName);
        ref.fName = "My First Name Modified";
        System.out.println(fName);

    }


}
