/**
 * 
 * **
 * 
 * CommentMapperExt.java
 * 
 */
package com.frico.website.dao.articleManagement;

import com.frico.website.model.articleManagement.Comment;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * CommentMapper的扩展 Mapper 接口
 * 
 * @author 	chh
 * @date 	2018年03月26日
 */
@Resource
public interface CommentMapperExt extends CommentMapper {

    public List<Comment> findList(Comment comment);

}