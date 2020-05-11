package com.coreeight.basics.overriding;

import java.math.BigDecimal;

public class Child_AccessSpecifier extends Parent {

    /**
     * When we go for override - if child have own/different implementation/requirement from parent behaviour, then we go for override
     * @param fName
     * @param lName
     */
    @Override
    protected String concatinateInput(String fName, String lName) {
        // Child owen behaviour or implementation with parent method signature
        return fName + " " +lName;
    }

}
