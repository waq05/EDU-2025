package com.EDU.service;

import com.EDU.entity.UserEntity;
import com.EDU.event.LoginSuccessEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements ApplicationListener<LoginSuccessEvent> {
    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        UserEntity source = (UserEntity) event.getSource();
        System.out.println("AccountService: " + source.getUsername() + " " + source.getPassword());
    }
}