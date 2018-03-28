package com.frico.website.web.articleManagement;

import com.frico.website.common.Result;
import com.frico.website.model.articleManagement.Comment;
import com.frico.website.service.articleManagement.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("bc/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping("findList")
    public Result<List<Comment>> findList(@RequestBody Comment comment){
        List<Comment> list = commentService.findList(comment);
        return Result.success(list);
    }
}
