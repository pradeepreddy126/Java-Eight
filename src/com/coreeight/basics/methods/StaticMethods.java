package com.coreeight.basics.methods;

public class StaticMethods {

    public static void add(int i, int j){
        int result = i+j;
        System.out.println("ADD: " + result);
    }

    public static void multiply(){
        System.out.println("Multiply: "+1*2);
    }

    public static int sub(int i, int j){
        int result = i-j;
        return result;
        // return i-j;
    }

   public static void m1(){
        System.out.println("m1() started");
        m2();
       StaticMethods objectAddress  = new StaticMethods();
       objectAddress.m3();// m3();
        System.out.println("m1() end");
   }
    private static void m2(){
        System.out.println("m2() executed");
    }

    private void m3(){
        System.out.println("m3() executed");
    }

    public static void main(String str[]){

    /** StaticMethods objectAddress  = new StaticMethods();
     objectAddress.add(5,7);
     objectAddress.multiply();
     int result = objectAddress.sub(1,2);
     System.out.println("Sub: " + result);

     objectAddress.m1();
     **/

     StaticMethods.add(5, 6);
     StaticMethods.multiply();
     int result = StaticMethods.sub(1,2);
     System.out.println("Sub: " + result);
     StaticMethods.m1();

    }

}
