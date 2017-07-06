package com.devil;

/**
 * Created by wangdi on 2017/7/6.
 */
public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mikl";
    }

    public double cost() {
        return 0.3 + beverage.cost();
    }
}
