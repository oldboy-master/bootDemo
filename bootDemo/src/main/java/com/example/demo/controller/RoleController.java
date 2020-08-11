package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("role")
@RestController
public class RoleController {

    @Autowired
    RoleService roleService;

    @RequestMapping("getUserByRole")
    public List<User> getUserByRole(int id) {
        return roleService.getUserByRole(id);
    }
}
