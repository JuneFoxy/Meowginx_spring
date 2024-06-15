package com.meowginx.backend.mapper;

import com.meowginx.backend.model.What;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WhatMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(What record);

    int insertSelective(What record);

    What selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(What record);

    int updateByPrimaryKey(What record);
}