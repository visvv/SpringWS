package com.vv;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vasudvis on 8/6/2016.
 */

@RestController
public class UserController {
    @RequestMapping("/user")
    public User getUser(){
        return  new User("sachin", "sachin@team.com");
    }
}
