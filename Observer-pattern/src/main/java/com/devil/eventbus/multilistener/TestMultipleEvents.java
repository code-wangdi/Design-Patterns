package com.devil.eventbus.multilistener;

import com.google.common.eventbus.EventBus;
import org.junit.Test;

/**
 * Created by wangdi on 2017/6/30.
 */
public class TestMultipleEvents {

    @Test
    public void testMultipleEvents(){
        EventBus eventBus = new EventBus("test");
        MultiListener multiListener = new MultiListener();
        eventBus.register(multiListener);
        eventBus.post(new Integer(100));
        eventBus.post(new Integer(200));
        eventBus.post(new Integer(300));
        eventBus.post(new Long(800));
        eventBus.post(new Long(800990));
        eventBus.post(new Long(8009905645L));
        System.out.println("LastInteger:" + multiListener.getLastInteger());
        System.out.println("LastLong:" + multiListener.getLastLong());
    }
}
