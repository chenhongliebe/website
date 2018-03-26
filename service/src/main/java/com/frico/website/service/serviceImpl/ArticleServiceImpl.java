package com.frico.website.service.serviceImpl;

import com.frico.website.dao.ArticleMapper;
import com.frico.website.model.Article;
import com.frico.website.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: Administrator
 * Date: 2018/3/21
 * Time: 16:14
 * Java gives me life and I have to work hard.
 */
@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    private ArticleMapper articleMapper;
    private Article article;

    @Override
    public List<Article> findAll() {

        List list = articleMapper.findAll();

        return list;
    }



    //更新新闻信息
    @Override
    public void updateArticle(Integer id) {


        articleMapper.updateByPrimaryKeySelective(article);
    }


    //根据id来进行删除
    @Override
    public void deleteArticle(Integer id) {

        articleMapper.deleteByPrimaryKey(id);
    }


    //添加
    @Override
    public void insertArticle(Article article) {


        articleMapper.insertSelective(article);
    }
}
