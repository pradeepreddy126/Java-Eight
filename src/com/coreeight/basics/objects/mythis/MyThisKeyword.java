package com.coreeight.basics.objects.mythis;

public class MyThisKeyword {

    private String fName;

    private String lName;

    MyThisKeyword(String fName){
        this(fName, "LNAME"); // Should be first statement
        this.fName = fName;
    }

    MyThisKeyword(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void concatNames(String name1, String name2){
        this.printName(name1 + name2);
    }

    public void printName(String name){
        System.out.println(name);
    }

    public static void main(String str[]){

        MyThisKeyword thisKeyword = new MyThisKeyword("First Name");
        //thisKeyword.setlName("Last Name");

        System.out.println(thisKeyword.fName + " " + thisKeyword.lName);
        thisKeyword.concatNames("fname", "lname");
    }
}
