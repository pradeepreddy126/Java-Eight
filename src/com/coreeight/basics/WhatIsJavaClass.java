package com.coreeight.basics;

// Formula - <Access Specifier> <class type> <identifier or class name>
public class WhatIsJavaClass {

    // Variables
    // Formula for declaration - <Access Specifier> <class type or data type> <identifier or name for variable>;
    public long phoneNum;
    // Formula for Initialization - <variable name> <assign operator> <data>;
    // phoneNum = 9191919191;

    // Constructors - we have to use class name only
    // Formula - <Access Specifier> <Class name> <parenthesis with zero or more arguments/variables> <body>
    public WhatIsJavaClass(){
        // Empty
    }

    // Blocks - Body
    {
        // Empty Body
    }
    // Static Body
    static {
        // Empty
    }

    // Methods/functions
    // Formula - <Access Specifier> <Access Modifier> <void or return type> <identifier or method name> <parenthesis with zero or more arguments/variables> <body>
    public long getPhoneNum(){
        return phoneNum;
    }

}
