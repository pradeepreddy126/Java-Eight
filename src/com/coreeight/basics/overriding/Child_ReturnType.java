package com.coreeight.basics.overriding;

import java.math.BigDecimal;
import java.time.format.DecimalStyle;

public class Child_ReturnType extends Parent {

    /**
     * When we go for override - if child have own/different implementation/requirement from parent behaviour, then we go for override
     * @param fName
     * @param lName
     */
    @Override
    public String concatinateInput(String fName, String lName) {
        // Child owen behaviour or implementation with parent method signature
        return fName + " " +lName;
    }

    @Override
    public BigDecimal concatinateInput(Number firstNUmber, Number lastNUmber) {
        // Child owen behaviour or implementation with parent method signature
        if(firstNUmber == null && lastNUmber == null) {
            return null;
        }else {
            if(firstNUmber == null){
                return  BigDecimal.valueOf(lastNUmber.doubleValue());
            } else {
                return BigDecimal.valueOf(firstNUmber.doubleValue());
            }
        }
    }

}
