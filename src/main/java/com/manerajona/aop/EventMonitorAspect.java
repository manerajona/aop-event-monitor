package com.manerajona.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Aspect
@Component
public class EventMonitorAspect {

    @Pointcut("@annotation(EventMonitor)")
    private void annotationEventMonitor() {
    }

    @Before("annotationEventMonitor()")
    public void monitorBefore() {
        long start = System.currentTimeMillis();
        System.out.println("Processing started at " + Instant.ofEpochMilli(start) + "ms");
    }

    @Around("annotationEventMonitor()")
    public Object monitorAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object event = joinPoint.getArgs()[0];
        System.out.println("Processing event: " + event);
        return joinPoint.proceed();
    }

    @After("annotationEventMonitor()")
    public void monitorAfter() {
        long end = System.currentTimeMillis();
        System.out.println("Processing ended at " + Instant.ofEpochMilli(end) + "ms");
    }
}