package com.frico.website.service;

import com.frico.website.model.Article;

import java.util.List;

/**
 * 文章的接口
 * xrb
 */

public interface ArticleService {

    //查询全部的新闻信息
//    List<Article> selectArticleList(Integer id);
    List<Article> findAll();

    //更新新闻信息的方法
    void updateArticle(Article article);

    //删除新闻信息的方法
    void deleteArticle(Integer id);

    //添加新闻信息
    void insertArticle(Article article);

}
