package com.project.dao;

import com.mybatis.model.ZwLog;

public interface ZwLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZwLog record);

    int insertSelective(ZwLog record);

    ZwLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZwLog record);

    int updateByPrimaryKeyWithBLOBs(ZwLog record);

    int updateByPrimaryKey(ZwLog record);
}