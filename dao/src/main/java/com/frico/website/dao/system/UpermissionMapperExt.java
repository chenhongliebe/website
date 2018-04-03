/**
 * 
 * **
 * 
 * UpermissionMapperExt.java
 * 
 */
package com.frico.website.dao.system;

import com.frico.website.model.system.Upermission;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * UpermissionMapper的扩展 Mapper 接口
 * 
 * @author 	chh
 * @date 	2018年03月29日
 */
@Resource
public interface UpermissionMapperExt extends UpermissionMapper {

    //根据用户id获取用户权限
    List<Upermission> findPermissionByUid(Integer id);
}