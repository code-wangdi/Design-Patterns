package com.devil.eventbus.listener;

/**
 * Created by wangdi on 2017/6/30.
 */
public class TestEvent {

    private final int message;

    public TestEvent(int message) {
        this.message = message;
        System.out.println("event message:" + message);
    }

    public int getMessage() {
        return message;
    }
}
