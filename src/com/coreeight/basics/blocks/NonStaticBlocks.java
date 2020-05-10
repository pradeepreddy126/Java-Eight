package com.coreeight.basics.blocks;

public class NonStaticBlocks {

    {
        System.out.println("Block 1");
    }

    //1) Should be class name
    //2) Parenthesis zero or more arguments
    //3) Body should be there
    //4) Access specifier
    public NonStaticBlocks(){
        System.out.println("NonStaticBlocks() - constructor executed");
    }

    {
        System.out.println("Block 3");
    }

    {
        System.out.println("Block 2");
    }

    public static void main(String str[]){
        System.out.println("main() started");
        new NonStaticBlocks(); // orphan object because no reference variable
        System.out.println("main() end");
    }

    {
        System.out.println("Block 4");
    }

}
