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
//
//    @RequestMapping("addUser")
//    public void addUser() {
//        userService.addUser(new User(1, "a00001", "普通管理员", "123456"));
//    }
//
//    @RequestMapping("getAllUser")
//    public List<User> getAllUser() {
//        return userService.getAllUser();
//    }
//
//    @RequestMapping("updUser")
//    public void updUser() {
//        User user = new User();
//        user.setId(4);
//        user.setUserName("a00001");
//        user.setRealName("普通管理员");
//        user.setPassword("111111");
//        userService.updUser(user);
//    }
//
//    @RequestMapping("delUser")
//    public void delUser(int id) {
//        userService.delUser(id);
//    }
}
