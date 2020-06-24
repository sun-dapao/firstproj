package com.example.firstproj.controller;

import com.example.firstproj.entity.User;
import com.example.firstproj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/springboot")
public class testController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String sayWorld(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/user/queryAll", method = RequestMethod.GET)
    public List<User> queryAllUser() {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer i : map.keySet()) {

        }
        int[] x =new int[]{1,2};
        List<User> result = userService.findAll();
        return result;
    }
}
