package com.manerajona.events;

import java.util.UUID;

public final class MyEvent {
    private final UUID id;
    private final String name;

    public MyEvent(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MyEvent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}