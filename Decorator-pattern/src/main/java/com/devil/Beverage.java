package com.devil;

/**
 * Created by wangdi on 2017/7/6.
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
