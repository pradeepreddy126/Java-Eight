package com.coreeight.basics.encapsulation;

/**
 * Creating private variables only and access those through setter and getter methods is encapsulation
 */
public class Student {

    private String  fName;
    private String  lName;
    private String  address;
    private String  section;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
