package com.gl.feignClientDemo.controller;

import com.gl.feignClientDemo.dto.User;
import com.gl.feignClientDemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */

@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;



    @GetMapping("user/{id}")
    public User user(@PathVariable("id") String id){
        logger.info("calling userList() to get list of users");
        return userService.getUser(id);
    }


}
