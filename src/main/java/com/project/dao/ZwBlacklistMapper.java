package com.project.dao;

import com.mybatis.model.ZwBlacklist;

public interface ZwBlacklistMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ZwBlacklist record);

    int insertSelective(ZwBlacklist record);

    ZwBlacklist selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ZwBlacklist record);

    int updateByPrimaryKey(ZwBlacklist record);
}