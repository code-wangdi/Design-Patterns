package com.devil.lazy;

/**
 * 同步方法
 * Created by wangdi on 2017/7/6.
 */
public class SynchronizedMetodSingleton {

    private static SynchronizedMetodSingleton instance;

    private SynchronizedMetodSingleton() {
    }

    public static synchronized SynchronizedMetodSingleton getInstance(){
        if (null == instance) {
            instance = new SynchronizedMetodSingleton();
        }
        return instance;
    }
}
