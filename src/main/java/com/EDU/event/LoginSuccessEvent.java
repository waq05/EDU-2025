package com.EDU.event;

import com.EDU.entity.UserEntity;
import org.springframework.context.ApplicationEvent;

public class LoginSuccessEvent extends ApplicationEvent {
    public LoginSuccessEvent  (UserEntity source) {
        super(source);

    }
}
