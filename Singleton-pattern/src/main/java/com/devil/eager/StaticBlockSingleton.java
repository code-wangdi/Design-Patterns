package com.devil.eager;

/**
 * 静态块
 * Created by wangdi on 2017/7/6.
 */
public class StaticBlockSingleton {

    private static StaticBlockSingleton INSTANCE;

    static {
        INSTANCE = new StaticBlockSingleton();
    }

    private StaticBlockSingleton() {
    }

    public static StaticBlockSingleton getInstance(){
        return INSTANCE;
    }
}


