package com.EDU.Controller;

import com.EDU.entity.UserEntity;
import com.EDU.event.LoginSuccessEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/login")
    public String login(@RequestParam("username")String username,@RequestParam("password") String password){
        LoginSuccessEvent event = new LoginSuccessEvent(username,password);
        eventPublisher.sendEvent(event);
    }
}
