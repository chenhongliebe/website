package com.frico.website.service.articleManagement.serviceImpl;

import com.frico.website.dao.articleManagement.CommentMapperExt;
import com.frico.website.model.articleManagement.Comment;
import com.frico.website.service.articleManagement.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapperExt commentMapperExt;

    @Override
    public List<Comment> findList(Comment comment) {
        return commentMapperExt.findList(comment);
    }
}
