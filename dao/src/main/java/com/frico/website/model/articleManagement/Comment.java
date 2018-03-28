/**
 * 
 * **
 * 
 * Comment.java
 * 
 */
package com.frico.website.model.articleManagement;

import com.frico.website.common.model.DataEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 表 : comment的 Model 类
 * 
 * @author 	chh
 * @date 	2018年03月28日
 */
public class Comment extends DataEntity{
    /** 字段:id，主键 */
    private Integer id;

    /** 字段:content，类型 */
    private String content;

    /** 字段:article_id，评论的文章 */
    private Integer articleId;

    /** 字段:create_id，创建者 */
    private Integer createId;

    /** 字段:create_date，创建时间 */
    private Date createDate;

    /** 字段:is_delete，是否删除 */
    private String isDelete;

    /** 字段:zan_count，赞数 */
    private Integer zanCount;

    private List<Reply> replyList =new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public Integer getZanCount() {
        return zanCount;
    }

    public void setZanCount(Integer zanCount) {
        this.zanCount = zanCount;
    }

    public List<Reply> getReplyList() {
        return replyList;
    }

    public void setReplyList(List<Reply> replyList) {
        this.replyList = replyList;
    }
}