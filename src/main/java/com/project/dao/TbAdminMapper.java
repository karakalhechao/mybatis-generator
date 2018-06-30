package com.project.dao;

import com.mybatis.model.TbAdmin;

import java.util.List;

public interface TbAdminMapper {
    int deleteByPrimaryKey(Integer adminId);

    int insert(TbAdmin record);

    int insertSelective(TbAdmin record);

    TbAdmin selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(TbAdmin record);

    int updateByPrimaryKey(TbAdmin record);


    List<TbAdmin>  getTbAdminRole(Integer adminid);



}