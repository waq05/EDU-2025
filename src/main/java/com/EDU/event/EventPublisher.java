package com.EDU.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Service;

@Service
public class EventPublisher {
    public void sendEvent(ApplicationEvent event){
        System.out.println("发布事件：" + event);
    }
}
