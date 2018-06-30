package com.mybatis.model;

import java.util.List;

/**
 * Copyright (c) 2017, 北京卡拉卡尔科技股份有限公司 All rights reserved.
 * 用户关联角色
 *
 * @author chao.he@karakal.com.cn
 * @version 1.0
 * @since 2018年04月20日    9:42
 */
public class TbAdminAndTbRole extends TbAdmin{

    private List<TbRole> tbRoles;

    public List<TbRole> getTbRoles() {
        return tbRoles;
    }

    public void setTbRoles(List<TbRole> tbRoles) {
        this.tbRoles = tbRoles;
    }
}
