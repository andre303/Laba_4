package com.company.Coffee;

public enum CoffeeType {
    BEANS, GROUND, INSTANT;

    public static CoffeeType getType(int value){
        if(value == 1)
            return BEANS;
        else if(value == 2)
            return GROUND;
        else if (value == 3)
            return INSTANT;
        else
            return null;
    }
}
