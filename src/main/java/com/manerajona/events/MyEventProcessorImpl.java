package com.manerajona.events;

import com.manerajona.aop.EventMonitor;
import org.springframework.stereotype.Component;

@Component
public class MyEventProcessorImpl implements MyEventProcessor {

    @EventMonitor
    @Override
    public void process(MyEvent event) throws InterruptedException {
        // doing something that takes time...
        Thread.sleep(1000);
    }
}