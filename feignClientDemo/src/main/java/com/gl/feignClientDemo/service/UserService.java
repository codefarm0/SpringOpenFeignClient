package com.gl.feignClientDemo.service;

import com.gl.feignClientDemo.dto.User;
import com.sun.swing.internal.plaf.metal.resources.metal_zh_HK;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */

@FeignClient(name = "${service.name}", url = "${service.base.url}")
public interface UserService {

    @GetMapping("/user/{id}")
    User getUser(@PathVariable("id") String id);

    @GetMapping(value = "/users")
    List<User> getUserList();


    @PostMapping("/user")
    String addUser(User user);

    @DeleteMapping("/user/{id}")
     String deleteUser(@PathVariable("id") String id);

    @PutMapping("/updateAddress/{id}/{newAddress}")
     String updateAddress(@PathVariable("id") String id, @PathVariable("newAddress") String newAddress);




    }
