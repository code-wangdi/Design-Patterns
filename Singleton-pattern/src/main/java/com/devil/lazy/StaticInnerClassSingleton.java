package com.devil.lazy;

/**
 * 内部静态类
 * Created by wangdi on 2017/7/6.
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    private static class SingletonInstance{
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
