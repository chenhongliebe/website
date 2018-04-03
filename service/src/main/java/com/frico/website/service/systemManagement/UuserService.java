package com.frico.website.service.systemManagement;

import com.frico.website.model.system.Uuser;

import java.util.List;

/**
 * User: xrb
 * Date: 2018/3/30
 * Time: 13:09
 * 后台用户的CRUD
 */
public interface UuserService {

    //添加后台用户
    public void insert(Uuser uuser);

    //删除后台用户(逻辑删除)
    public void delete(Integer[] ids);

    //编辑后台用户
    public void update(Uuser uuser);

    //查询全部小编
    public List<Uuser> findAll(Uuser uuser);

}
