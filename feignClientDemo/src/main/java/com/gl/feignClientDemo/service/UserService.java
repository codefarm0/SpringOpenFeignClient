package com.gl.feignClientDemo.service;

import com.gl.feignClientDemo.dto.User;
import com.sun.swing.internal.plaf.metal.resources.metal_zh_HK;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */

@FeignClient(name = "feignUserService", url = "http://localhost:8083/springDataDemo/")
public interface UserService {

    @GetMapping("/user/{id}")
    User getUser(@PathVariable("id") String id);


}
