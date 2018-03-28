package com.frico.website.service.classifyManagement;

import com.frico.website.model.articleManagement.Classify;

import java.util.List;

/**
 * xrb
 * 2018/03/28
 * 分类的逻辑层
 */
public interface ClassifyService {

    //添加分类
    public void insert(Classify classify);

    //删除分类(逻辑删除)
    public void delete(Integer[] ids);

    //编辑分类
    public void update(Classify classify);

    //查询全部分类
    public List<Classify> findAll(Classify classify);

}
