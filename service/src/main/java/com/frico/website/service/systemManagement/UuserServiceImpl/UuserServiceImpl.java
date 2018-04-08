package com.frico.website.service.systemManagement.UuserServiceImpl;


import com.frico.website.common.exception.MyException;
import com.frico.website.dao.system.UuserMapperExt;
import com.frico.website.model.system.Uuser;
import com.frico.website.service.systemManagement.UuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * User: xrb
 * Date: 2018/3/30
 * Time: 13:09
 * 后台用户的CRUD
 */
@Service
public class UuserServiceImpl implements UuserService{

    @Autowired
    private UuserMapperExt uuserMapperExt;

    /**
     * 添加后台用户
     * @param uuser
     */
    @Override
    public void insert(Uuser uuser) {


        uuser.setCreateTime(new Date()); //添加创建时间

        uuserMapperExt.insertSelective(uuser);


    }

    /**
     * 逻辑删除
     * @param ids
     */
    @Override
    public void delete(Integer[] ids) {
       if(ids != null && ids.length > 1){
           for(Integer id : ids){
               uuserMapperExt.deleteByPrimaryKey(id);
           }
       }else {
           throw new MyException("11", "删除失败,主键不能为空值");
       }
    }

    /**
     * 编辑后台用户
     * @param uuser
     */
    @Override
    public void update(Uuser uuser) {
        uuser.setLastLoginTime(new Date()); //添加最后登录时间

        uuserMapperExt.updateByPrimaryKeySelective(uuser);
    }


    /**
     * 查看全部用户
     * @param uuser
     * @return
     */
    @Override
    public List<Uuser> findAll(Uuser uuser) {

        return uuserMapperExt.findAll(uuser);
    }
}
