/**
 * 
 * **
 * 
 * ReplyMapper.java
 * 
 */
package com.frico.website.dao.articleManagement;

import com.frico.website.model.articleManagement.Reply;

/**
 * <p>
 * 表 : reply的 Mapper 类
 * 
 * @author 	chh
 * @date 	2018年03月28日
 */
public interface ReplyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Reply record);

    int insertSelective(Reply record);

    Reply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKey(Reply record);
}