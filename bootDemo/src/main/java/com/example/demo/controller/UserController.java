package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("selectByPrimaryKey")
    public User selectByPrimaryKey(int id) {
        return userService.selectByPrimaryKey(id);
    }

    @RequestMapping("getUser")
    public User getUser(Integer id) {
        return userService.getUser(id);
    }
}
