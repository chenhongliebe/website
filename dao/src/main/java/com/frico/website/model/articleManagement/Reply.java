/**
 * 
 *
 * 
 * Reply.java
 * 
 */
package com.frico.website.model.articleManagement;

import com.frico.website.common.model.DataEntity;

import java.util.Date;

/**
 * <p>
 * 表 : reply的 Model 类
 * 
 * @author 	chh
 * @date 	2018年03月28日
 */
public class Reply extends DataEntity{
    /** 字段:id，主键id */
    private Integer id;

    /** 字段:comment_id，评论Id */
    private Integer commentId;

    /** 字段:create_id，回复人 */
    private Integer createId;

    /** 字段:to_create_id，回复对象 */
    private Integer toCreateId;

    /** 字段:reply_msg，回复内容 */
    private String replyMsg;

    /** 字段:create_date，创建时间 */
    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {

        this.commentId = commentId;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Integer getToCreateId() {
        return toCreateId;
    }

    public void setToCreateId(Integer toCreateId) {
        this.toCreateId = toCreateId;
    }

    public String getReplyMsg() {
        return replyMsg;
    }

    public void setReplyMsg(String replyMsg) {
        this.replyMsg = replyMsg == null ? null : replyMsg.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}