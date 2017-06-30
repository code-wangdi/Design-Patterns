package com.devil;

import com.devil.behavior.impl.FlyRocketPowered;
import com.devil.entity.Duck;
import com.devil.entity.MallardDuck;
import com.devil.entity.ModelDuck;

/**
 * Created by wangdi on 2017/6/30.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
