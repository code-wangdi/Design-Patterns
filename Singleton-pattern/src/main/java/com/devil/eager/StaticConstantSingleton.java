package com.devil.eager;

/**
 * 静态常量
 * Created by wangdi on 2017/7/6.
 */
public class StaticConstantSingleton {

    private static final StaticConstantSingleton INSTANCE = new StaticConstantSingleton();

    private StaticConstantSingleton() {
    }

    public static StaticConstantSingleton getInstance() {
        return INSTANCE;
    }
}
