package com.frico.website.service.articleManagement.serviceImpl;

import com.frico.website.common.UserUtil;
import com.frico.website.common.exception.MyException;
import com.frico.website.common.model.LoginInfo;
import com.frico.website.dao.articleManagement.CommentMapperExt;
import com.frico.website.model.articleManagement.Comment;
import com.frico.website.service.articleManagement.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapperExt commentMapperExt;

    @Override
    public List<Comment> findList(Comment comment) {
        return commentMapperExt.findList(comment);
    }

    @Override
    public void save(Comment comment){
        LoginInfo loginInfo = UserUtil.getLoginInfo();
        if(loginInfo!=null && loginInfo.getId() !=null){
            comment.setCreateDate(new Date());
            comment.setCreateId(loginInfo.getId());
            commentMapperExt.insertSelective(comment);
        }else {
            throw new MyException("登录后才能评论！");
        }
    }
}
