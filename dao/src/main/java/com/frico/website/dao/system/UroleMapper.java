/**
 * 
 * **
 * 
 * UroleMapper.java
 * 
 */
package com.frico.website.dao.system;

import com.frico.website.model.system.Urole;

/**
 * <p>
 * 表 : u_role的 Mapper 类
 * 
 * @author 	chh
 * @date 	2018年03月29日
 */
public interface UroleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Urole record);

    int insertSelective(Urole record);

    Urole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Urole record);

    int updateByPrimaryKey(Urole record);
}