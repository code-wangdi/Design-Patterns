package com.devil.lazy;

/**
 * 同步方法
 * Created by wangdi on 2017/7/6.
 */
public class SynchronizedMetodSingleton {

    private static SynchronizedMetodSingleton INSTANCE;

    private SynchronizedMetodSingleton() {
    }

    public static synchronized SynchronizedMetodSingleton getInstance(){
        if (null == INSTANCE) {
            INSTANCE = new SynchronizedMetodSingleton();
        }
        return INSTANCE;
    }
}
