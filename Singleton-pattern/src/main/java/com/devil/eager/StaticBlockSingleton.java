package com.devil.eager;

/**
 * 静态块
 * Created by wangdi on 2017/7/6.
 */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    static {
        instance = new StaticBlockSingleton();
    }

    private StaticBlockSingleton() {
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}


