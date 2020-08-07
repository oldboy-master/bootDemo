package com.example.demo.mapper;

import com.example.demo.entity.Rights;

public interface RightsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rights record);

    int insertSelective(Rights record);

    Rights selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rights record);

    int updateByPrimaryKey(Rights record);
}