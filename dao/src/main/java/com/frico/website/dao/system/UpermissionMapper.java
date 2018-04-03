/**
 * 
 * **
 * 
 * UpermissionMapper.java
 * 
 */
package com.frico.website.dao.system;

import com.frico.website.model.system.Upermission;

/**
 * <p>
 * 表 : u_permission的 Mapper 类
 * 
 * @author 	chh
 * @date 	2018年03月29日
 */
public interface UpermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Upermission record);

    int insertSelective(Upermission record);

    Upermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Upermission record);

    int updateByPrimaryKey(Upermission record);
}