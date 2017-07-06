package com.devil;

/**
 * Created by wangdi on 2017/7/6.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return 1.5 + beverage.cost();
    }
}
