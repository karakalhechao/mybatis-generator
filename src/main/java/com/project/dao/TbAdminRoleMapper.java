package com.project.dao;

import com.mybatis.model.TbAdminRole;

public interface TbAdminRoleMapper {
    int deleteByPrimaryKey(Integer adminRoleId);

    int insert(TbAdminRole record);

    int insertSelective(TbAdminRole record);

    TbAdminRole selectByPrimaryKey(Integer adminRoleId);

    int updateByPrimaryKeySelective(TbAdminRole record);

    int updateByPrimaryKey(TbAdminRole record);
}