package com.EDU.Controller;

import com.EDU.entity.UserEntity;
import com.EDU.event.EventPublisher;
import com.EDU.event.LoginSuccessEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    EventPublisher eventPublisher;
    @GetMapping("/login")
    public String login(@RequestParam("username")String username,@RequestParam("password") String password){
        UserEntity userEntity = new UserEntity(username, password);
        LoginSuccessEvent event = new LoginSuccessEvent(userEntity);
        eventPublisher.sendEvent(event);
        return "登录成功";
    }
}
