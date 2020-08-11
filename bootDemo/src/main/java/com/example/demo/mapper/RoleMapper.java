package com.example.demo.mapper;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<User> getUserByRole(Integer id, Integer userId);
}
