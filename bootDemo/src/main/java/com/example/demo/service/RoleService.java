package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface RoleService {

    List<User> getUserByRole(Integer id, Integer userId);

//    int addRole(Role role);
}
