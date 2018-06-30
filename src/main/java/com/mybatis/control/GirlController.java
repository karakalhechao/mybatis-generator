package com.mybatis.control;


import com.mybatis.dao.GirlMapper;
import com.mybatis.model.Girl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Girl controller
 * Created by karakal
 *
 * @Aththor chaohe
 * @Create 2017 -07 - 08- 23:27
 */
@RestController
public class GirlController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private Girl girl;

    private GirlMapper girlMapper;

   /* @RequestMapping(value = "/girls", method = RequestMethod.GET)*/

    /**
     * Created by karakal
     *
     * @return com.project.entity.Girl
     * @description  增加一条数据
     * @params [name, age]
     * @Create Date   2017/7/9
     */
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestBody Girl girl) {
        Girl girl2=new Girl();
        girl2.setAge(23);
        girl2.setName("ewrewrew");
        Girl girl1=girlMapper.selectByPrimaryKey(4);
        //girlMapper.insert(girl2);
        logger.info("测试成功");

      return girl1;
    }

    public GirlMapper getGirlMapper() {
        return girlMapper;
    }

    public void setGirlMapper(GirlMapper girlMapper) {
        this.girlMapper = girlMapper;
    }

}
