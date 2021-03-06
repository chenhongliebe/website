/**
 * 
 * **
 * 
 * ArticleMapper.java
 * 
 */
package com.frico.website.dao.articleManagement;

import com.frico.website.model.articleManagement.Article;

/**
 * <p>
 * 表 : article的 Mapper 类
 * 
 * @author 	xrb
 * @date 	2018年03月26日
 */
public interface ArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);
}