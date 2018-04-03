/**
 * 
 * **
 * 
 * UrolepermissionMapper.java
 * 
 */
package com.frico.website.dao.system;

import com.frico.website.model.system.Urolepermission;

/**
 * <p>
 * 表 : u_role_permission的 Mapper 类
 * 
 * @author 	chh
 * @date 	2018年03月29日
 */
public interface UrolepermissionMapper {

    int insert(Urolepermission record);

    int insertSelective(Urolepermission record);
}