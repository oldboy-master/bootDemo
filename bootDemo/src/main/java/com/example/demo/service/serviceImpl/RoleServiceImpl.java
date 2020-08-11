package com.example.demo.service.serviceImpl;

import com.example.demo.entity.User;
import com.example.demo.mapper.RoleMapper;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<User> getUserByRole(Integer id, Integer userId) {
        return roleMapper.getUserByRole(id,userId);
    }

//    @Autowired
//    RoleMapper roleMapper;
//
//    @Override
//    public int addRole(Role role) {
//        return 0;
//    }
}
