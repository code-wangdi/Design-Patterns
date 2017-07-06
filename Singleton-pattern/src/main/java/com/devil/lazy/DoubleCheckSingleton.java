package com.devil.lazy;

/**
 * 双重检查
 * Created by wangdi on 2017/7/6.
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton INSTANCE;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance(){
        if (null == INSTANCE) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == INSTANCE) {
                    INSTANCE = new DoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
