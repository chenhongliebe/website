/**
 * 
 * **
 * 
 * Article.java
 * 
 */
package com.frico.website.model.articleManagement;

import com.frico.website.common.Enum.DeleteEnum;
import com.frico.website.common.model.DataEntity;

import java.util.Date;

/**
 * <p>
 * 表 : article的 Model 类
 * 
 * @author 	chh
 * @date 	2018年03月26日
 */
public class Article extends DataEntity<Article> {

    private static final long serialVersionUID = 1L;

    /** 字段:title，发表文章的标题 */
    private String title;

    /** 字段:status，文章的状态 1已发布 2保存草稿箱 */
    private String status;

    /** 字段:type，文章的分类1 外汇 2 期货 3 股票 4 基金 */
    private String type;

    /** 字段:author，文章的作者 */
    private String author;

    /** 字段:cover_url，封面图地址 */
    private String coverUrl;

    /** 字段:content，发表的文章内容 */
    private String content;

    //主键id
    private Integer id;

    /** 字段:create_id，创建人 */
    private Integer createId;

    /** 字段:create_date，创建时间 */
    private Date createDate;

    /** 字段:update_id，修改人 */
    private Integer updateId;

    /** 字段:update_date，修改时间 */
    private Date updateDate;

    /** 字段:id_delete，是否删除 */
    protected String isDelete;

    public Article(){
        this.isDelete=DeleteEnum.NOT_DELETE.getCode();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl == null ? null : coverUrl.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
}