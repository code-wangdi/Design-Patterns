package com.devil.entity;

import com.devil.behavior.impl.FlyNoWay;
import com.devil.behavior.impl.Quack;

/**
 * Created by wangdi on 2017/6/30.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
