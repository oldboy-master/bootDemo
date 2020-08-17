package com.example.demo.mapper;

import com.example.demo.entity.Rights;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RightsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rights record);

    int insertSelective(Rights record);

    Rights selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rights record);

    int updateByPrimaryKey(Rights record);

    List<Rights> getAllRights(@Param("likeName") String likeName);
}