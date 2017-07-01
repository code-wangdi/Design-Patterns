package com.devil.eventbus.multilistener;

import com.google.common.eventbus.Subscribe;

/**
 * Created by wangdi on 2017/6/30.
 */
public class MultiListener {

    private Integer lastInteger;

    private Long lastLong;

    @Subscribe
    public void listener(Integer event) {
        lastInteger = event;
        System.out.println("event Integer:" + lastInteger);
    }

    @Subscribe
    public void listenerLong(Long event) {
        lastLong = event;
        System.out.println("event Long" + lastLong);
    }

    public Integer getLastInteger() {
        return lastInteger;
    }

    public Long getLastLong() {
        return lastLong;
    }
}
