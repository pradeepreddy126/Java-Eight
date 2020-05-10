package com.coreeight.basics.variables;

public class ObjectVariable {

    // Object Variable or not static variable
    public long phoneNum;

    public static void main(String str[]){
        // Formula for Object Creation - new <Class Name with parenthesis for constructor call>;
        new ObjectVariable(); // this is orphan object because we can't refer it later

        // Formula for Reference variable to hold object address - <Class type> <variable name>
        // we can also call as Method Variable if variable are inside method
        ObjectVariable referenceVariable;

        referenceVariable = new ObjectVariable();

        referenceVariable.phoneNum = 91919191l;

        System.out.println(referenceVariable.phoneNum);
    }
}
