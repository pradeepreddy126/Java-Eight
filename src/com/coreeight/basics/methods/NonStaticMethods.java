package com.coreeight.basics.methods;

public class NonStaticMethods {

    public void add(int i, int j){
        int result = i+j;
        System.out.println("ADD: " + result);
    }

    public void multiply(){
        System.out.println("Multiply: "+1*2);
    }

    public int sub(int i, int j){
        int result = i-j;
        return result;
        // return i-j;
    }

   public void m1(){
        System.out.println("m1() started");
        m2();
        NonStaticMethods.m3();
        System.out.println("m1() end");
   }
    private void m2(){
        System.out.println("m2() executed");
    }

    private static void m3(){
        System.out.println("m3() executed");
    }

    public static void main(String str[]){
     NonStaticMethods objectAddress  = new NonStaticMethods();
     objectAddress.add(5,7);
     objectAddress.multiply();
     int result = objectAddress.sub(1,2);
     System.out.println("Sub: " + result);

     objectAddress.m1();
    }

}
