package com.frico.website.service.classifyManagement.classifyServiceImpl;

import com.frico.website.common.exception.MyException;
import com.frico.website.dao.articleManagement.ClassifyMapperExt;
import com.frico.website.model.articleManagement.Classify;
import com.frico.website.service.classifyManagement.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: xrb
 * Date: 2018/3/28
 * Time: 10:36
 * Java gives me life and I have to work hard.
 */

@Service
public class ClassifyServiceImpl implements ClassifyService{


    @Autowired
    private ClassifyMapperExt classifyMapperExt;


    /**
     * 添加分类
     * 在添加分类之前需要手动调用DataEntity里面方法
     * @param classify
     */
    @Override
    public void insert(Classify classify) {
        classify.preInsert();
        classifyMapperExt.insertSelective(classify);
    }


    /**
     * 逻辑删除
     * @param ids
     */
    @Override
    public void delete(Integer[] ids) {
        if(ids != null && ids.length > 1){
            for(Integer id : ids){
                classifyMapperExt.deleteByPrimaryKey(id);
            }
        }else {
            throw new MyException("11", "删除失败,主键不能为空值");
        }
    }

    //编辑分类
    @Override
    public void update(Classify classify) {

        classifyMapperExt.updateByPrimaryKeySelective(classify);
    }

    @Override
    public List<Classify> findAll(Classify classify) {

        return classifyMapperExt.findAll(classify);
    }
}
