package com.frico.website.service.articleManagement.serviceImpl;

import com.frico.website.common.UserUtil;
import com.frico.website.common.exception.MyException;
import com.frico.website.common.model.LoginInfo;
import com.frico.website.dao.articleManagement.ArticleMapperExt;
import com.frico.website.model.articleManagement.Article;
import com.frico.website.service.articleManagement.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * User: Administrator
 * Date: 2018/3/21
 * Time: 16:14
 * Java gives me life and I have to work hard.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapperExt articleMapperExt;

    @Override
    public void insert(Article article){
        article.preInsert();
//        LoginInfo loginInfo = UserUtil.getLoginInfo();
//        article.setCreateDate(new Date());
//        article.setUpdateDate(article.getCreateDate());
//        if(loginInfo.getId()!=null){
//            article.setCreateId(loginInfo.getId());
//            article.setUpdateId(article.getCreateId());
//        }else {
//            throw new MyException("请先登录");
//        }
        articleMapperExt.insertSelective(article);
    }

    @Override
    public void delete(Integer[] ids) {
        if(ids !=null && ids.length >1){
            for(Integer id :ids){
                articleMapperExt.deleteByPrimaryKey(id);
            }
        }else {
            throw new MyException("11","删除失败，主键不能为空");
        }
    }

    @Override
    public void update(Article article) {
        articleMapperExt.updateByPrimaryKeySelective(article);
    }

    @Override
    public List<Article> findList(Article article) {

        return articleMapperExt.findList(article);
    }

    @Override
    public Article get(Integer id) {
        return articleMapperExt.selectByPrimaryKey(id);
    }

    @Override
    public void permanentDelete(Integer[] ids) {
        if(ids !=null && ids.length>0) {
            for(Integer id :ids){
                Article article = new Article();
                article.setId(id);
                article.setIsDelete("1");
                articleMapperExt.updateByPrimaryKeySelective(article);
            }
        }else {
            throw new MyException("11","删除失败，主键不能为空");
        }
    }

    @Override
    public void restore(Integer[] ids) {
        if(ids !=null && ids.length>0) {
            for(Integer id :ids){
                Article article = new Article();
                article.setId(id);
                article.setIsDelete("0");
                articleMapperExt.updateByPrimaryKeySelective(article);
            }
        }else {
            throw new MyException("11","还原失败，主键不能为空");
        }
    }
}
