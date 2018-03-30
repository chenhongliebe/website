package com.frico.website.service.articleManagement;

import com.frico.website.model.articleManagement.Comment;

import java.util.List;

public interface CommentService {

    public List<Comment> findList(Comment comment);

    public void save(Comment comment);
}
