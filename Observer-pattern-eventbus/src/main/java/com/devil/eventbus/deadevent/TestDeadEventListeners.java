package com.devil.eventbus.deadevent;

import com.google.common.eventbus.EventBus;

import com.devil.eventbus.listener.TestEvent;

import org.junit.Test;

/**
 * Created by wangdi on 2017/6/30.
 */
public class TestDeadEventListeners {

    @Test
    public void testDeadEventListeners(){
        EventBus eventBus = new EventBus("test");
        DeadEventListener deadEventListener = new DeadEventListener();
        eventBus.register(deadEventListener);
        eventBus.post(new TestEvent(200));
        eventBus.post(new TestEvent(300));
        System.out.println("deadEvent:" + deadEventListener.isNotDelivered());
    }
}
