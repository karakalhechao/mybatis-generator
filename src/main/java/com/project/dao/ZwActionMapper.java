package com.project.dao;

import com.mybatis.model.ZwAction;
import com.mybatis.model.ZwActionWithBLOBs;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface ZwActionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZwActionWithBLOBs record);

    int insertSelective(ZwActionWithBLOBs record);

    ZwActionWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZwActionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ZwActionWithBLOBs record);

    int updateByPrimaryKey(ZwAction record);

    List<ZwActionWithBLOBs> selectByCoprId(String coprid);

    @Select(value = "select * from zw_action where zw_code=#{code}")
    List<ZwActionWithBLOBs>  selectByZwCode(String code);
}