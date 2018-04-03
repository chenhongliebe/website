/**
 * 
 * **
 * 
 * UuserMapperExt.java
 * 
 */
package com.frico.website.dao.system;

import com.frico.website.model.system.Uuser;


import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * UuserMapper的扩展 Mapper 接口
 * 
 * @author 	xrb
 * @date 	2018年03月29日
 */
@Resource
public interface UuserMapperExt extends UuserMapper {

    //shiro查询对象
    public Uuser findByName(String nickname);


    //查询所有的小编
    public List <Uuser> findAll(Uuser uuser);


}
