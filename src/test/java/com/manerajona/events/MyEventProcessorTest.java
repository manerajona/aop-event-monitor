package com.manerajona.events;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class MyEventProcessorTest {

    @Autowired
    MyEventProcessor processor;

    @Test
    void process_test() throws InterruptedException {
        processor.process(
                new MyEvent(UUID.randomUUID(), "Example")
        );
        assert true;
    }
}