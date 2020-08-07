package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface RoleService {

    List<User> getUserByRole(long id);

//    int addRole(Role role);
}
