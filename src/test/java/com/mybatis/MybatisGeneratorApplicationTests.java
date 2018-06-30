package com.mybatis;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatis.model.TbAdmin;
import com.mybatis.model.ZwActionWithBLOBs;
import com.project.dao.TbAdminMapper;
import com.project.dao.ZwActionMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(basePackages=  "com.project.dao")
public class MybatisGeneratorApplicationTests {
	@Autowired
    private ZwActionMapper zwActionMapper;
	@Autowired
	private TbAdminMapper tbAdminMapper;
	@Test
	public void contextLoads() {
		ZwActionWithBLOBs zwActionWithBLOBs=zwActionMapper.selectByPrimaryKey(87686);
		List<ZwActionWithBLOBs>  zwActionWithBLOBses=zwActionMapper.selectByCoprId("60055659330");
         for(ZwActionWithBLOBs zwActionWithBLOBs1:zwActionWithBLOBses){
			 System.out.println(JSON.toJSONString(zwActionWithBLOBs1));
			 System.out.println(zwActionWithBLOBs1.getTransId());
		 }

		System.out.println(zwActionWithBLOBs.getCoprId());

		List<TbAdmin> tbAdmin=tbAdminMapper.getTbAdminRole(1);
		System.out.println(JSON.toJSONString(tbAdmin));
		List<ZwActionWithBLOBs> zwActionWithBLOBses1=zwActionMapper.selectByZwCode("100004");
		PageInfo Info=new PageInfo(zwActionWithBLOBses1);
		PageHelper.startPage(0,20);
		//Page<zwActionWithBLOBs> zwActionWithBLOBsPage=(Page<zwActionWithBLOBs>) ;


		System.out.println(Info.toString());



	}


}
