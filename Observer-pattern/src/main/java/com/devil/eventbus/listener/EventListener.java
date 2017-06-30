package com.devil.eventbus.listener;

import com.google.common.eventbus.Subscribe;

/**
 * Created by wangdi on 2017/6/30.
 */
public class EventListener {

    public int lastMessage = 0;

    @Subscribe
    public void listen(TestEvent event) {
        lastMessage = event.getMessage();
        System.out.println("Message:" + lastMessage);
    }

    public int getLastMessage() {
        return lastMessage;
    }
}
