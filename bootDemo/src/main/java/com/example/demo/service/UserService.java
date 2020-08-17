package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
    User selectByPrimaryKey(int id);

    User getUser(Integer id);
}
