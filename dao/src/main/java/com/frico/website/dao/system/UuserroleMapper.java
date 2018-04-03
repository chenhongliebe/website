/**
 * 
 * **
 * 
 * UuserroleMapper.java
 * 
 */
package com.frico.website.dao.system;

import com.frico.website.model.system.Uuserrole;

/**
 * <p>
 * 表 : u_user_role的 Mapper 类
 * 
 * @author 	chh
 * @date 	2018年03月29日
 */
public interface UuserroleMapper {
    int insert(Uuserrole record);

    int insertSelective(Uuserrole record);
}