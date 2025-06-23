package com.EDU.service;

import com.EDU.event.LoginSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class CouponService {
    @EventListener
    public void onEvent( LoginSuccessEvent loginSuccessEvent){
        System.out.println("CouponService已生效 " );
    }

}
