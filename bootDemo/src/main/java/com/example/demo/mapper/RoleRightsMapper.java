package com.example.demo.mapper;

import com.example.demo.entity.RoleRights;

public interface RoleRightsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleRights record);

    int insertSelective(RoleRights record);

    RoleRights selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleRights record);

    int updateByPrimaryKey(RoleRights record);
}