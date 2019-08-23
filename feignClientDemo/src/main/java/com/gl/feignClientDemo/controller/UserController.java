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

    @GetMapping("userList")
    public List<User> userList(){
        logger.info("calling userList() to get list of users");
        return userService.getUserList();
    }


    @PostMapping("user")
    public String addUser(@RequestBody User user){
        logger.info("adding user");
        return userService.addUser(user);
    }
    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable String id){
        logger.info("deleting user - {}", id);
        return userService.deleteUser(id);
    }

    @PutMapping("/updateAddress/{id}/{newAddress}")
    String updateAddress(@PathVariable String id, @PathVariable String newAddress){
        logger.info("updating user - {}", id);
        return userService.updateAddress(id, newAddress);
    }


}
