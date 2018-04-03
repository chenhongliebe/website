/**
 * 
 * **
 * 
 * UuserMapper.java
 * 
 */
package com.frico.website.dao.system;

import com.frico.website.model.system.Uuser;

/**
 * <p>
 * 表 : u_user的 Mapper 类
 * 
 * @author 	chh
 * @date 	2018年03月29日
 */
public interface UuserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Uuser record);

    int insertSelective(Uuser record);

    Uuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Uuser record);

    int updateByPrimaryKey(Uuser record);
}