package com.example.demo.service.serviceImpl;


import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

//
//    @Override
//    public void addUser(User user) {
//        userMapper.addUser(user);
//    }
//
//    @Override
//    public List<User> getAllUser() {
//        return userMapper.getAllUser();
//    }
//
//    @Override
//    public void updUser(User user) {
//        userMapper.updUser(user);
//    }
//
//    @Override
//    public void delUser(int id) {
//        userMapper.delUser(id);
//    }
}
