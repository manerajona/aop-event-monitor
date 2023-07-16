package com.manerajona.events;

public interface MyEventProcessor {
    void process(MyEvent event) throws InterruptedException;
}