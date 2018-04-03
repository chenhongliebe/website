/**
 * 
 * **
 * 
 * UroleMapperExt.java
 * 
 */
package com.frico.website.dao.system;

import com.frico.website.model.system.Urole;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * UroleMapper的扩展 Mapper 接口
 * 
 * @author 	chh
 * @date 	2018年03月29日
 */
@Resource
public interface UroleMapperExt extends UroleMapper {

    //根据用户id获取该用户所在组的角色权限
    public List<Urole> findRoleUid(Integer obj);

}