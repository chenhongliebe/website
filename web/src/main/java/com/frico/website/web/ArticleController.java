package com.frico.website.web;

import com.frico.website.common.Result;
import com.frico.website.model.Article;
import com.frico.website.service.serviceImpl.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 文章的控制层
 * User: Administrator
 * Date: 2018/3/22
 * Time: 14:12
 * Java gives me life and I have to work hard.
 */

@RestController
@RequestMapping("Article")
public class ArticleController {

    @Autowired
    private ArticleServiceImpl articleService;

    /**
     * 查询全部文章
     * @return
     */
    @RequestMapping("getArticle")
    public Result getArticle() {

        List<Article> list = articleService.findAll();


        return Result.success(list);

    }

    /**
     * 根据主键id删除文章
     * @return
     */
    public Result delectArticle(Integer id) {

        articleService.deleteArticle(id);
        return Result.success();
    }

    /**
     * 根据文章id来更改文章内容
     *
     */
    public Result updateArticle(Integer id) {

        articleService.updateArticle(id);

        return Result.success();

    }


}
