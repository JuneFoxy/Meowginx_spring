package com.meowginx.backend.mapper;

import com.meowginx.backend.model.Howcan;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HowcanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Howcan record);

    int insertSelective(Howcan record);

    Howcan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Howcan record);

    int updateByPrimaryKey(Howcan record);
}