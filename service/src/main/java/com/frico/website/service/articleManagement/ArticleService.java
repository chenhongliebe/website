package com.frico.website.service.articleManagement;

import com.frico.website.model.articleManagement.Article;

import java.util.List;

/**
 * 文章的接口
 * xrb
 */

public interface ArticleService {

    public void insert(Article article);
    //逻辑删除
    public void delete(Integer[] ids);
    //永久删除
    public void permanentDelete(Integer[] ids);
    //还原回收站
    public void restore(Integer[] ids);

    public void update(Article article);

    public List<Article> findList(Article article);
    //通过文章主键查询文章
    public Article get(Integer id);


}
