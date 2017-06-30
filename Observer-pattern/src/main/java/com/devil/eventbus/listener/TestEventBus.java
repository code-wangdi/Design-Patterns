package com.devil.eventbus.listener;

import com.google.common.eventbus.EventBus;
import org.junit.Test;

/**
 * Created by wangdi on 2017/6/30.
 */
public class TestEventBus {

    @Test
    public void testReceiveEvent(){
        EventBus eventBus = new EventBus("test");
        EventListener listener = new EventListener();
        eventBus.register(listener);
        eventBus.post(new TestEvent(200));
        eventBus.post(new TestEvent(300));
        eventBus.post(new TestEvent(400));

        System.out.println("LastMessage" + listener.getLastMessage());
    }
}
